package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Car;
import com.example.demo.repository.CarRepository;

@Controller
public class CarController {
	
	@Autowired
	private Car car;
	
	@Autowired
	private CarRepository repo;
	
	@RequestMapping(value="/cars",method=RequestMethod.GET)
	public String initForm(Model model) {
		
		model.addAttribute("command", car);
		return "addCar";
	}
	
	@RequestMapping(value="/cars",method=RequestMethod.POST)
	public String submitForm(@ModelAttribute("command") Car car,Model model) {
		//System.out.println(customer);
		
		int rowAdded=repo.addCar(car);
		
		model.addAttribute("rowAdded",rowAdded);
		return "addCar";
	}
	
	@RequestMapping(value="/cars/all",method=RequestMethod.GET)
	public String findAllCars(Model model) {
		
		List<Car> list=repo.getAllCars();
		model.addAttribute("list", list);
		return "showCars";
	}
	
	@RequestMapping(value="/cars/unsoldcars",method=RequestMethod.GET)
	public String findUnsoldCars(Model model) {
		
		List<Car> list=repo.getUnsoldCars();
		model.addAttribute("list", list);
		return "showCars";
	}
	
	 @ModelAttribute("brands")
		public String[] brand(){
			String[] brands = repo.getModel();
			
			
			return brands;

		}
	 @RequestMapping(value="/cars/showByBrand",method=RequestMethod.GET)
		public String initFormModel(Model model1)
		{
		
			model1.addAttribute("command",car);
			return "selectBrand";
		}
	 @RequestMapping(value="/cars/model",method=RequestMethod.POST)	
		public String findCarsByModel(@ModelAttribute("command") @RequestParam("model")String model, Model model1)
		{
			List<Car> list = repo.getCarsByModel(model);
			model1.addAttribute("list",list);
			return "showCars";
		}
	
	@ModelAttribute("groups")
	public String[] status() {
		
		return new String[] {"sold","unsold","Booked","unavailable"};
	}
	

}
