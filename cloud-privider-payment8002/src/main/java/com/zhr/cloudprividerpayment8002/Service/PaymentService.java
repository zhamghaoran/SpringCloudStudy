package com.zhr.cloudprividerpayment8002.Service;


import com.zhr.cloudcommonapi.Entity.Payment;

public interface PaymentService {
    int createPayment(Payment payment);
    Payment getPaymentById(Long id);
}
