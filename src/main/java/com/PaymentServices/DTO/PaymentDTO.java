package com.PaymentServices.DTO;

import java.util.Date;

public class PaymentDTO {

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

	@Override
	public String toString() {
		return "PaymentDTO [pid=" + pid + ", paymentDate=" + paymentDate + ", paymentMode=" + paymentMode
				+ ", paymentDescription=" + paymentDescription + "]";
	}

	public PaymentDTO(long pid, Date paymentDate, String paymentMode, String paymentDescription) {

		this.pid = pid;
		this.paymentDate = paymentDate;
		this.paymentMode = paymentMode;
		this.paymentDescription = paymentDescription;
	}

	public PaymentDTO() {

	}

}
