package com.PaymentServices.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PaymentServices.Entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
