package com.twor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.twor.entity.Driver;


public interface DriverRepository extends JpaRepository<Driver, Integer> {
	
	@Query("from Driver d where d.id=:id")
	public Driver getDriverById(@Param(value="id")Integer id );
	
	
}
