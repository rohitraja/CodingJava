package com.rohit.collection;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;

import com.rohit.dto.EmployeeDto;

public class TestMap {
	
	public static Date localToGMT(Date currentDate) {
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	    sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
	    Date gmt = new Date(sdf.format(currentDate));
	    return gmt;
	}

	public static void main(String arg[]){
		
		Map<EmployeeDto,String> employeeMap = new TreeMap<EmployeeDto,String>();
		
		employeeMap.put(new EmployeeDto(50, "Golu"), "Golu");
		employeeMap.put(new EmployeeDto(30, "Raju"), "Raju");
		employeeMap.put(new EmployeeDto(10, "Mukesh"), "Mukesh");
		employeeMap.put(new EmployeeDto(20, "Ramesh"), "Ramesh");
		employeeMap.put(new EmployeeDto(70, "Rohit"), "Rohit");
		employeeMap.put(new EmployeeDto(40, "Jagdish"), "Jagdish");
		
		System.out.println(employeeMap);
		
		
	}
}
