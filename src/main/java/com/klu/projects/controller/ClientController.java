package com.klu.projects.controller;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.klu.projects.model.Admin;
import com.klu.projects.model.Flight;
import com.klu.projects.model.People;
import com.klu.projects.service.AdminService;
import com.klu.projects.service.FlightService;
import com.klu.projects.service.PeopleService;





@Controller
public class ClientController {
    @Autowired
	private AdminService adminService; 
	
	@Autowired  
	private PeopleService peopleService;
	@Autowired
	private FlightService flightService;
	
   @GetMapping("/")
   public String mainhomedemo() {
	   return "index";
   }
   @GetMapping("/adminlogin")
   public ModelAndView adminlogindemo() {
	   ModelAndView mv=new ModelAndView("adminlogin");
	   return mv;
   }
  
   @GetMapping("/adminhome")
   public ModelAndView adminhomedemo() {
	   ModelAndView mv=new ModelAndView("adminhome");
	   return mv;
   }
   @GetMapping("/peoplehome")
   public ModelAndView peoplehomedemo(HttpServletRequest request) {
	   ModelAndView mv=new ModelAndView("peoplehome");
	   HttpSession session = request.getSession();
		String euname = (String) session.getAttribute("euname");
		mv.addObject("euname", euname);
	   return mv;
   }
   @GetMapping("/viewallflights")
   public ModelAndView viewallflightsdemo() {
	   
	   ModelAndView mv=new ModelAndView("viewallflights");
	   List<Flight> flightlist=flightService.viewallflights();
	   mv.addObject("flist", flightlist);
	   return mv;
   }
   @GetMapping("/viewallpeople")
   public ModelAndView viewallpeopledemo() {
	   ModelAndView mv=new ModelAndView("viewallpeople");
	   List<People> plist = adminService.viewallpeople();
		mv.addObject("plist",plist);
	   return mv;
   }
   
   @GetMapping("/addflight")
   public ModelAndView flightdemo() {
	   ModelAndView mv= new ModelAndView("addflight","emp1",new Flight());
	   return mv;
   }
   @PostMapping("/addflight")
   public String adduserflight(@ModelAttribute("emp1")Flight flight) {
	   flightService.addflight(flight);
	   //ModelAndView mv=new ModelAndView();
	   //mv.setViewName("peoplereg");
	   //mv.addObject("msg","User Registred Successfully");
	   return "redirect:addflight";
   }
  
   @GetMapping("/peoplelogin")
   public ModelAndView peoplelogindemo() {
	   ModelAndView mv=new ModelAndView("peoplelogin");
	   return mv;
   }
   @GetMapping("/peoplereg")
   public ModelAndView peopleregdemo() {
	   ModelAndView mv= new ModelAndView("peoplereg","emp",new People());
	   return mv;
   }
   @PostMapping("/checkadminlogin")
  public ModelAndView checkadminlogindemo(HttpServletRequest request) {
	 ModelAndView mv=new ModelAndView();
	  
	String auname=request.getParameter("auname");
	  String apwd=request.getParameter("apwd");
	  Admin admin=adminService.checkadminlogin(auname, apwd);
	  
	if(admin!=null) {
		HttpSession session=request.getSession();
		session.setAttribute("auname", auname);
	 mv.setViewName("adminhome");
	 }
	 else {
		mv.setViewName("adminlogin");
		mv.addObject("msg","login failed");
	   }
	 return mv;
  }
   @PostMapping("/checkpeoplelogin")
	public ModelAndView checkpeoplelogindemo(HttpServletRequest request)
	{
		ModelAndView mv =  new ModelAndView();
		
		String euname = request.getParameter("euname");
		String epwd = request.getParameter("epwd");
		
		//People people= peopleService.checkpeoplelogin(euname, epwd);
	 People people=peopleService.checkpeoplelogin(euname, epwd);
		if(people!=null)
		{
			//HttpSession session = request.getSession();
			
			//session.setAttribute("euname", euname);
			
			mv.setViewName("peoplehome");
		}
		else
		{
			mv.setViewName("peoplelogin");
			mv.addObject("msg", "Login Failed");
		}
		
		
		return mv;
	}
   @PostMapping("/addpeople")
   public String addpeopledemo(@ModelAttribute("emp")People people) {
	   peopleService.addpeople(people);
	  //ModelAndView mv=new ModelAndView();
	   //mv.setViewName("peoplereg");
	   //mv.addObject("msg","User Registred Successfully");
	   return "redirect:peoplelogin";
   }
   @GetMapping("/viewpeople")
	public ModelAndView viewpeople(HttpServletRequest request)
	{
		HttpSession session = request.getSession();
		
		String euname = (String) session.getAttribute("euname");
		
		People emp=  peopleService.viewpeople(euname);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("viewpeople");
		mv.addObject("emp",emp);
		
		return mv;
	}
   
   @GetMapping("/deletepeople")
   public String deletepeopledemo(@RequestParam("id")int pid) {
	   adminService.deletepeople(pid);
	   return "redirect:viewallpeople";
   }  
   @GetMapping("/echangepwd")
   public ModelAndView echangepwd(HttpServletRequest request) {
	   HttpSession session=request.getSession();
	   String ename=(String)session.getAttribute("euname");
	   ModelAndView mv=new ModelAndView();
	   mv.setViewName("echangepwd");
	   return mv;
   }
   @PostMapping("/updatepeoplepwd")
   public ModelAndView updatepeoplepwddemo(HttpServletRequest request) {
	   ModelAndView mv =new ModelAndView();
	   
	   HttpSession session=request.getSession();
	   String ename=(String)session.getAttribute("euname");
	   String oldpwd=request.getParameter("oldpwd");
	   String newpwd=request.getParameter("newpwd");
	   int t=peopleService.changepeoplepassword(oldpwd, newpwd, ename);
	   if(t>0) {
		   mv.setViewName("echangepwd");
		   mv.addObject("msg","password update sucessfully");
	   }
	   else {
		 
		   mv.addObject("msg","old password is incorrect");
	   }
	   return mv;
   }
   @GetMapping("/index")
	  public String hello() {
	    return "uploader";
	  }

	  @PostMapping("/upload") 
	  public ResponseEntity<?> handleFileUpload( @RequestParam("file") MultipartFile file ) {

	    String fileName = file.getOriginalFilename();
	    try {
	      file.transferTo( new File("C:/Users/User/Downloads/Ariline/passportdetails" + fileName));
	    } catch (Exception e) {
	      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	    } 
	    return ResponseEntity.ok("File uploaded successfully.");
	  }


	}
   
