package com.zhr.cloudprividerpayment8001.Service;


import com.zhr.cloudprividerpayment8001.Entity.Payment;

public interface PaymentService {
    int createPayment(Payment payment);
    Payment getPaymentById(Integer id);
}
