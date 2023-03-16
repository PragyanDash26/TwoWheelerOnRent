package com.twor.service;

import java.util.List;

import com.twor.entity.Driver;
import com.twor.exception.NullEmailFoundException;
import com.twor.exception.NullUserFound;

public interface DriverService {
	
	public Driver registerDriver(Driver driver) throws NullUserFound, NullEmailFoundException;
	
	public List<Driver> getAllDriver();
	
	public Driver getDriverById(Integer driverid) throws NullUserFound;
	
    public Driver updateDriver(Driver driver) throws NullUserFound;
	
	public String deleteDriver(Driver driver) throws NullUserFound;

	public List<Driver> sortDriverbyrating()throws Exception;
	
	
	
	//public Driver loginDriver(String email, String password) throws NullUserFound;
	
	
}