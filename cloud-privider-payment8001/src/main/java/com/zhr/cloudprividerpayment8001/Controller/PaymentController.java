package com.zhr.cloudprividerpayment8001.Controller;


import com.zhr.cloudcommonapi.Entity.CommonResult;
import com.zhr.cloudcommonapi.Entity.Payment;
import com.zhr.cloudprividerpayment8001.Service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author jjking
 */
@RestController
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("查出的结果" + payment);
        System.out.println(123456);
        if (payment != null) {
            return new CommonResult<>(200, "查询成功", payment);
        } else {
            return new CommonResult<>(500,"查找失败");
        }
    }


    @PostMapping(value = "/payment/create")
    public CommonResult<Integer> createPayment(@RequestBody Payment payment) {
        int payment1 = paymentService.createPayment(payment);
        if (payment1 > 0) {
            return new CommonResult<>(200,"成功",payment1);
        } else {
            return new CommonResult<Integer>(500,"失败");
        }
    }
}
