package com.PaymentServices.Service;

import com.PaymentServices.DTO.PaymentDTO;

public interface PaymentService {

	
	PaymentDTO savePayment(PaymentDTO paymentDTO);
	
	PaymentDTO getPayment(long id);
}
