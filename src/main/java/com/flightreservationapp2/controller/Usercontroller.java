package com.flightreservationapp2.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flightreservationapp2.entity.User;
import com.flightreservationapp2.repository.UserRepository;

import jakarta.persistence.Entity;

@Controller
public class Usercontroller {

	@Entity
	public class Flight {

		@Autowired
		private UserRepository userRepo;

		@RequestMapping("/showLoginPage")
		public String showLoginPage() {
			return "login/login";
		}

		@RequestMapping("/showReg")
		public String showReg() {
			return "login/showReg";
		}

		@RequestMapping("/saveReg")
		public String saveReg(@ModelAttribute("user") User user) {
			userRepo.save(user);
			return "login/login";
		}

		@RequestMapping("/verifyLogin")
		public String verifyLogin(@RequestParam("emailid") String emailid, @RequestParam("password") String password) {

			User user = userRepo.findByEmail(emailid);
			System.out.println(user.getEmail());
			System.out.println(user.getPassword());

			return "findFlights";
		}
	}
}
