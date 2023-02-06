package com.zhr.cloudprividerpayment8002.Service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;

import com.zhr.cloudcommonapi.Entity.Payment;
import com.zhr.cloudprividerpayment8002.Service.PaymentService;
import com.zhr.cloudprividerpayment8002.mapper.PaymentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentMapper paymentMapper;

    @Override
    public int createPayment(Payment payment) {
       return paymentMapper.insert(payment);
    }
    @Override
    public Payment getPaymentById(Long id) {
        LambdaQueryWrapper<Payment> paymentLambdaQueryWrapper = new LambdaQueryWrapper<>();
        return paymentMapper.selectById(id);
    }
}
