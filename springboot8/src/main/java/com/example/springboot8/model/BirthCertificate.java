package com.example.springboot8.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BirthCertificate {
	
	@Id
	private  int Bno;
	
	private String FirstName;
	private String LastName;
	private String Hospital;
	private LocalDate DOB;
	private String Gender;
	private String Area;
	private String city;
	private int Pincode;
	
	
	

}
