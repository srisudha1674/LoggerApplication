package com.example.loggerapplication.repository;

import javax.transaction.Transactional;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.loggerapplication.entity.AppUsage;
import com.example.loggerapplication.model.RequestModel;




public interface LoggerRepository extends JpaRepository<AppUsage, String> {

//	@Transactional
	@Modifying
	@Query(value = "insert into APP_USAGE\r\n"
			+ "(EMAIL_ID,SERVICE_NAME)\r\n"
			+ "VALUES (:emailId,:serviceName) ",nativeQuery = true)
	void insert(String emailId,String serviceName);

}
