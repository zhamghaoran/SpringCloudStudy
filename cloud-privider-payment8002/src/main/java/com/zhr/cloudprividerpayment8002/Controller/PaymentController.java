package com.zhr.cloudprividerpayment8002.Controller;


import com.zhr.cloudcommonapi.Entity.CommonResult;
import com.zhr.cloudcommonapi.Entity.Payment;
import com.zhr.cloudprividerpayment8002.Service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author jjking
 */
@RestController
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("查出的结果" + payment);
        System.out.println(123456);
        if (payment != null) {
            return new CommonResult<>(200, "查询成功,服务端口" + serverPort, payment);
        } else {
            return new CommonResult<>(500,"查找失败");
        }
    }


    @PostMapping(value = "/payment/create")
    public CommonResult<Integer> createPayment(@RequestBody Payment payment) {
        int payment1 = paymentService.createPayment(payment);
        log.info("*****插入操作返回结果:" + payment1);
        if (payment1 > 0) {
            return new CommonResult<>(200,"成功,返回结果" + payment + "\t 服务端口:" + serverPort,payment1);
        } else {
            return new CommonResult<Integer>(500,"失败");
        }
    }
}
