package com.PaymentServices.Entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long pid;
	Date paymentDate;
	String paymentMode;
	String paymentDescription;

	public long getPid() {
		return pid;
	}

	public void setPid(long pid) {
		this.pid = pid;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getPaymentDescription() {
		return paymentDescription;
	}

	public void setPaymentDescription(String paymentDescription) {
		this.paymentDescription = paymentDescription;
	}

	public Payment(long pid, Date paymentDate, String paymentMode, String paymentDescription) {

		this.pid = pid;
		this.paymentDate = paymentDate;
		this.paymentMode = paymentMode;
		this.paymentDescription = paymentDescription;
	}

	public Payment() {
		
	}

	@Override
	public String toString() {
		return "Payment [pid=" + pid + ", paymentDate=" + paymentDate + ", paymentMode=" + paymentMode
				+ ", paymentDescription=" + paymentDescription + "]";
	}
	
	

}
