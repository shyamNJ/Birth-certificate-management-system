package com.example.springboot8.model;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class BirthService {

	@Autowired
	BirthRepository birth;
	
	
    //---------------Add--------------------
	public void add(BirthCertificate birthCertificate) {
		birth.save(birthCertificate);	
	}

	//------------show------------------
	public List<BirthCertificate> getAll(){
		return birth.findAll();	
	}

	//------delete-------------------------
	public void delete(BirthCertificate birthCertificate) {
		birth.delete(birthCertificate);
	}

	//-------------update------------------------
	public BirthCertificate getById(int id) {
		Optional<BirthCertificate> birthOptional = birth.findById(id);
		BirthCertificate temp = null;
		if(birthOptional.get() != null) {
			temp = birthOptional.get();

		}
		return temp;
	}


}
