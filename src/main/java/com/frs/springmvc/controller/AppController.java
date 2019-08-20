package com.frs.springmvc.controller;

import java.util.List;
import java.util.Locale;

import javax.validation.Valid;

import org.jboss.logging.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.frs.springmvc.model.Flight;
import com.frs.springmvc.model.User;
import com.frs.springmvc.service.UserService;


@Controller
@RequestMapping("/")
public class AppController {

	@Autowired
	UserService service;
	
	@Autowired
	MessageSource messageSource;
	
	@RequestMapping(value = { "/"}, method = RequestMethod.GET)
	public String homePage(ModelMap model) {
		return "home";
	}

	@RequestMapping(value = { "/register"}, method = RequestMethod.GET)
	public String registerPage(ModelMap model) {
		User user = new User();
		model.addAttribute("user", user);
		return "register";
	}
	
	@RequestMapping(value = { "/login"}, method = RequestMethod.GET)
	public String loginPage(ModelMap model) {
		return "login";
	}
	
	@RequestMapping(value = { "/products"}, method = RequestMethod.GET)
	public String productsPage(ModelMap model) {
		return "products";
	}

	@RequestMapping(value = { "/addflight"}, method = RequestMethod.GET)
	public String contactUsPage(ModelMap model) {
		Flight flight = new Flight();
		model.addAttribute("flight", flight);
		model.addAttribute("edit", false);
		return "addflight";
	}
	
	@RequestMapping(value = { "/register" }, method = RequestMethod.POST)
	public String saveUser(@Valid User user, BindingResult result,
			ModelMap model) {
		System.out.println(user.getUserId() + " : " + user.getFirstName() + " : " + user.getLastName() +
				" : " + user.getUserType() + " : "+ user.getDob() + " : " + user.getGender() + " : " 
				+ user.getStreet() + " : " + user.getLocation() + " : " + user.getCity() + " : " 
				+ user.getState() + " : " + user.getPincode() + " : " + user.getPhNo() + " : " 
				+ user.getEmailId() + " : " + user.getPassword());
		service.saveUser(user);
		//model.addAttribute("success", "User " + user.getUserId() + " registered successfully");
		return "register";
		
	}
	
	@RequestMapping(value = { "/addflight" }, method = RequestMethod.POST)
	public String saveUser(@Valid Flight flight, BindingResult result,
			ModelMap model) {
		System.out.println(flight.getFlightId() + " : " + flight.getFlightName() + " : " + flight.getSeatingCap() + " : " + flight.getReserveCap());
		service.addFlight(flight);
		return "addflight";
	}
	
	
	@RequestMapping(value = {"/viewflight" }, method = RequestMethod.GET)
	public String listFlight(ModelMap model) {

		List<Flight> flights = service.findAllFlights();
		model.addAttribute("flights", flights);
		return "viewflight";
	}
	
	/*@RequestMapping(value = {"/viewflight" }, method = RequestMethod.POST)
	public String editFlight(ModelMap model, @Param String editFlightId) {

		model.addAttribute("editFlightId", editFlightId);
		System.out.println("PARAM : " + editFlightId);
		return "editflight";
	}*/
	
	@RequestMapping(value = { "/delete-{fid}-flight" }, method = RequestMethod.GET)
	public String deleteFlight(@PathVariable String fid) {
		service.deleteFlightById(fid);
		return "redirect:/viewflight";
	}
	
	@RequestMapping(value = { "/edit-{flightId}-flight" }, method = RequestMethod.GET)
	public String editFlight(@PathVariable String flightId, ModelMap model) {
		
		Flight flight = service.findFlightByFid(flightId);
		System.out.println(flightId);
		model.addAttribute("flight", flight);
		model.addAttribute("edit", true);
		return "addflight";
	}
	
	@RequestMapping(value = { "/edit-{flightId}-flight" }, method = RequestMethod.POST)
	public String updateFlight(@Valid Flight flight, BindingResult result,
			ModelMap model, @PathVariable String flightId) {

		if (result.hasErrors()) {
			return "addflight";
		}
		
		service.updateFlight(flight);
		System.out.println(flight.getId() + " : " + flight.getFlightId() + " : " + flight.getFlightName() + " : " + flight.getSeatingCap() + " : " 
		+ flight.getReserveCap());
		model.addAttribute("success", "Flight " + flight.getFlightId()	+ " updated successfully");
		return "redirect:/viewflight";
	}
	
}