package com.example.loggerapplication.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "APP_USAGE")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AppUsage {
	
	@Id
	@SequenceGenerator(name="seq",sequenceName="dept_seq", allocationSize = 1)        
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	@Column(name = "LOG_ID")
	private String log_id;
	@Column(name ="EMAIL_ID")
	private String email_id;
	@Column(name ="SERVICE_NAME")
	private String servicename;
	@Column(name ="ACCESSED_TIME")
	private Date accessed_time;

}
