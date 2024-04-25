package com.example.springboot8;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.springboot8.model.BirthCertificate;

import com.example.springboot8.model.BirthService;



@Controller
public class BirthController {
	
	@Autowired
	BirthService birth;
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	//----------insert data-------------------//
	@RequestMapping("/insert")
	public String insert() {
		return "insert-form";
	}

	
	@PostMapping("/insert-birth")
	public String insertBirth(@RequestParam int Bno, @RequestParam String FirstName, @RequestParam String LastName, @RequestParam String Hospital, @RequestParam LocalDate DOB, @RequestParam String Gender, @RequestParam String Area, @RequestParam String city, @RequestParam int Pincode) {
		
		BirthCertificate b1 = new BirthCertificate(Bno, FirstName, LastName, Hospital, DOB, Gender, Area, city, Pincode);
		birth.add(b1);
		return "home";
		
	}
	
	//-----------show method------------------//
	@GetMapping("/show")
	public String Show(Model data) {
		List<BirthCertificate> birthc = birth.getAll();
		data.addAttribute("Birth" , birthc);
		return "show-form";
		
	}
	
	//----------delete method-------------//
	@GetMapping("delete-birth")
	public String delete(@RequestParam int Bno) {
		BirthCertificate b2 = new BirthCertificate(Bno, null, null, null, null, null, null, null, 0);
		birth.delete(b2);
		return "home";	
		
	}

	
	//------------update-----------------------------------------------------------------------------------//
	@GetMapping("/update-birth")
	public String update(@RequestParam int Bno, Model data) {
		BirthCertificate b3 = birth.getById(Bno);
		
		if(b3 != null) {
			data.addAttribute("Birth",b3);
			return "update-form";
		}
		else {
			List<BirthCertificate> b4 = birth.getAll();
			data.addAttribute("birth", b4);
			return "show-form";
		}
		
	}
	
	@PostMapping("/update-birth")
	public String update(Model data,@RequestParam int Bno, @RequestParam String FirstName, @RequestParam String LastName, @RequestParam String Hospital, @RequestParam LocalDate DOB, @RequestParam String Gender, @RequestParam String Area, @RequestParam String city, @RequestParam int Pincode) {
		
		BirthCertificate bc = new BirthCertificate(Bno, FirstName, LastName, Hospital, DOB, Gender, Area, city, Pincode);
		birth.add(bc);
		List<BirthCertificate> b4 = birth.getAll();
		data.addAttribute("birth", b4);
		
		return "show-form";
		
		
	}
	
	
	
	

}
