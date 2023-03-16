package com.twor.sorting;
import java.util.Comparator;

import com.twor.entity.Driver;

public class sortDriverbyHightoLow implements Comparator<Driver>{

	@Override
	public int compare(Driver d1, Driver d2) {
		// TODO Auto-generated method stub
		return d2.getRating().compareTo(d1.getRating());
	}
	
}