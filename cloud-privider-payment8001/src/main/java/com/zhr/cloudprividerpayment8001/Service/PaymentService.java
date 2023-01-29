package com.zhr.cloudprividerpayment8001.Service;


import com.zhr.cloudcommonapi.Entity.Payment;

public interface PaymentService {
    int createPayment(Payment payment);
    Payment getPaymentById(Long id);
}
