package com.PaymentServices.Service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PaymentServices.DTO.PaymentDTO;
import com.PaymentServices.Entity.Payment;
import com.PaymentServices.Repository.PaymentRepository;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	PaymentRepository PaymentRepositorys;

	@Autowired
	ModelMapper modelMapper;

	@Override
	public PaymentDTO savePayment(PaymentDTO paymentDTO) {

		Payment payment = modelMapper.map(paymentDTO, Payment.class);

		Payment Paymentsave = PaymentRepositorys.save(payment);

		PaymentDTO dto = modelMapper.map(Paymentsave, PaymentDTO.class);

		return dto;
	}

	@Override
	public PaymentDTO getPayment(long id) {

		Payment payment = PaymentRepositorys.findById(id).get();

		PaymentDTO dto = modelMapper.map(payment, PaymentDTO.class);

		return dto;
	}
}
