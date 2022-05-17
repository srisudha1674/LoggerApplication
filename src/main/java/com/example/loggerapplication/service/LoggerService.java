package com.example.loggerapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.loggerapplication.entity.AppUsage;
import com.example.loggerapplication.model.RequestModel;
import com.example.loggerapplication.repository.LoggerRepository;

@Service
public class LoggerService {
	
	@Autowired
	public LoggerRepository loggerrepos;

	public void addLog(RequestModel userlog) {
		 loggerrepos.insert(userlog.getEmailId(),userlog.getServiceName());
	}

}
