package com.twor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.twor.entity.Driver;
import com.twor.exception.NullEmailFoundException;
import com.twor.exception.NullUserFound;
import com.twor.service.DriverService;

@RestController
@CrossOrigin("http://localhost:8002")
@RequestMapping("/driver")


public class DriverController {
	
	@Autowired
	DriverService driverService;
	
	@PostMapping("/registerDriver")
	public Driver registerDriver(@RequestBody Driver driver) throws NullUserFound, NullEmailFoundException
	{
		return driverService.registerDriver(driver);
	}
	
	@GetMapping("/allDriver")
	public List<Driver> getAllDriver()
	{
		return driverService.getAllDriver();
	}
	
	@PutMapping("/updateDriver")
	public Driver updateDriver(@RequestBody Driver driver) throws NullUserFound {
		return driverService.updateDriver(driver);
	}
	
	@DeleteMapping("/deleteDriver")
	public String deleteTutor(@RequestBody Driver driver) throws NullUserFound {
		return driverService.deleteDriver(driver);
	}

	@GetMapping("/sort/drivers")
	public List<Driver> sortDriverbyrating()throws Exception
	{
		
		return driverService.sortDriverbyrating();
	}	
	
}
