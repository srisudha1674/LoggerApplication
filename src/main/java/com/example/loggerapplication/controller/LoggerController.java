package com.example.loggerapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.loggerapplication.entity.AppUsage;
import com.example.loggerapplication.model.RequestModel;
import com.example.loggerapplication.service.LoggerService;


@RestController
public class LoggerController {
	
	@Autowired
	private LoggerService loggerservice;
	
	@RequestMapping(method=RequestMethod.POST,value="/addLog")
	public void addLog(@RequestBody RequestModel userlog)
	{
		System.out.println(userlog);
		  loggerservice.addLog(userlog);
	}

}
