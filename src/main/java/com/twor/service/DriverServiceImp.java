package com.twor.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twor.entity.Driver;
import com.twor.exception.NullEmailFoundException;
import com.twor.exception.NullUserFound;
import com.twor.repository.DriverRepository;
import com.twor.sorting.sortDriverbyHightoLow;

@Service
public class DriverServiceImp implements DriverService{
	
	@Autowired
	DriverRepository driverRepository;
	

	@Override
	public Driver registerDriver(Driver driver) throws NullUserFound, NullEmailFoundException {
	
		if(driver.getEmail() == "" || driver.getEmail() == null) {
			throw new NullEmailFoundException("Email cannot be null");
		}
		else if (driver.getFirstName().isEmpty() || driver.getLastName().isEmpty() || driver.getEmail().isEmpty()
				|| driver.getPassword().isEmpty()) {
			throw new NullUserFound("Error: Null value is not accepted.");
		} 
		else if (driver.getFirstName().equals("string") || driver.getLastName().equals("string")
				|| driver.getPassword().equals("string") || driver.getEmail().equals("string"))
						
		{
			throw new NullUserFound("Error: Null value is not accepted.");
		}
		return driverRepository.save(driver);
	}

	@Override
	public List<Driver> getAllDriver() {

		return driverRepository.findAll();
	}

	@Override
	public Driver getDriverById(Integer driverid) throws NullUserFound {
		if (driverid == 0) {
			throw new NullUserFound("Null value is not expected");
		}

		return driverRepository.getDriverById(driverid);
	}

	public Driver updateDriver(Driver driver) throws NullUserFound {
		Driver d = getDriverById(driver.getId());

		if (d == null) {
			throw new NullUserFound("No Driver Exixts with same this id: " + driver.getId());
		}

		return driverRepository.save(driver);
	}

	@Override
	public String deleteDriver(Driver driver) throws NullUserFound {
		Driver d = getDriverById(driver.getId());

		if (d == null) {
			throw new NullUserFound("No Driver Exixts with same this id: " + driver.getId());
		}
		driverRepository.delete(d);
		return "Driver Deleted Successfully";
	}

	@Override
	public List<Driver> sortDriverbyrating() {
		List<Driver> list= driverRepository.findAll();
		List<Driver> Driver = new ArrayList<>();
		Collections.sort(list, new sortDriverbyHightoLow());
		// TODO Auto-generated method stub
		return list;
	}
	


}
