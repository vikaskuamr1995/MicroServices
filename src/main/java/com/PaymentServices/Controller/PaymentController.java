package com.PaymentServices.Controller;

import java.util.Date;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PaymentServices.DTO.PaymentDTO;
import com.PaymentServices.Service.PaymentService;

@RequestMapping("/payment")
@RestController
public class PaymentController {

	
	@Autowired
	PaymentService PaymentServices;

	@PostMapping("/save")
	public ResponseEntity<?> savePayment(@RequestBody PaymentDTO paymentdto) {
		try {
			paymentdto.setPaymentDate(new Date());

			return new ResponseEntity<>(PaymentServices.savePayment(paymentdto), HttpStatus.CREATED);
		} catch (Exception e) {

			return new ResponseEntity<>("Failed to create Payment." + "Please try again",
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> getPayment(@PathVariable("id") long id) {
		try {
			return new ResponseEntity<>(PaymentServices.getPayment(id), HttpStatus.ACCEPTED);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>("No data present for this id" + id + ",", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
