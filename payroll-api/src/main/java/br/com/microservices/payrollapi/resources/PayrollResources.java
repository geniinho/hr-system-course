package br.com.microservices.payrollapi.resources;

import br.com.microservices.payrollapi.domain.Payroll;
import br.com.microservices.payrollapi.services.PayrollService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/payments")
public class PayrollResources {

    private final PayrollService service;

    @GetMapping(value = "/{workerId}")
    public ResponseEntity<Payroll> getPayment(@PathVariable Long workerId, @RequestBody Payroll payment){
        return ResponseEntity.ok().body(service.getPayment(workerId,payment));
    }
}
