package com.klu.projects.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flight121")
public class Flight {
	@Id
	@GeneratedValue
	private int id;
	@Column(nullable=false,length=200)
	private String airportname;
	@Column(nullable=false,length=200)
	private String arriveldate;
	@Column(nullable=false,length=200)
	private String arrivalplace;
	@Column(nullable=false,length=200)
	private String departureplace;
	@Column(nullable=false,unique=true,length=200)
	private String flightnumber;
	@Column(nullable=false,unique=true,length=200)
	private String flightname;
	@Column(nullable=false,length=200)
	private String ticketprice;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAirportname() {
		return airportname;
	}
	public void setAirportname(String airportname) {
		this.airportname = airportname;
	}
	public String getArriveldate() {
		return arriveldate;
	}
	public void setArriveldate(String arriveldate) {
		this.arriveldate = arriveldate;
	}
	public String getArrivalplace() {
		return arrivalplace;
	}
	public void setArrivalplace(String arrivalplace) {
		this.arrivalplace = arrivalplace;
	}
	public String getDepartureplace() {
		return departureplace;
	}
	public void setDepartureplace(String departureplace) {
		this.departureplace = departureplace;
	}
	public String getFlightnumber() {
		return flightnumber;
	}
	public void setFlightnumber(String flightnumber) {
		this.flightnumber = flightnumber;
	}
	public String getFlightname() {
		return flightname;
	}
	public void setFlightname(String flightname) {
		this.flightname = flightname;
	}
	public String getTicketprice() {
		return ticketprice;
	}
	public void setTicketprice(String ticketprice) {
		this.ticketprice = ticketprice;
	}
	@Override
	public String toString() {
		return "Flight [id=" + id + ", airportname=" + airportname + ", arriveldate=" + arriveldate + ", arrivalplace="
				+ arrivalplace + ", departureplace=" + departureplace + ", flightnumber=" + flightnumber
				+ ", flightname=" + flightname + ", ticketprice=" + ticketprice + "]";
	}
	
	

}
