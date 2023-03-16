package com.twor.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.twor.entity.Driver;
import com.twor.exception.NullEmailFoundException;
import com.twor.exception.NullUserFound;
import com.twor.repository.DriverRepository;


@SpringBootTest
class DriverServiceTest {
	
	@Autowired
	DriverRepository driverRepo;
	
	@Autowired
	DriverService driverService;

	

	@Test
	void testGetDriverById() throws NullUserFound{
		assertThrows(NullUserFound.class, () -> driverService.getDriverById(0) );
	}
	
	
	@Test
	void testUpdateDriver() throws NullUserFound{
    Driver d = new Driver(1,"Pragyan","Dash","prag@gmail.com","ppd", 2, false);		
		
	assertThrows(NullUserFound.class, () -> driverService.updateDriver(d));
	}

	@Test
	void testDeleteDriver() throws NullUserFound{
       Driver d = new Driver(1,"Pragyan","Dash","prag@gmail.com","ppd", 2, false);
	
			assertThrows(NullUserFound.class, () -> driverService.deleteDriver(d));
	}

	

}
