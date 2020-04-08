package com.acme.authorizer;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class AuthorizerController {

    @PostMapping("/auth")
    public Result auth(@RequestParam(value = "x") BigDecimal x, @RequestParam(value = "y") BigDecimal y) {
		Result result = new Result();
		result.setX(x);
		result.setY(y);
		result.setOperation(Operation.SUM);
		result.setResult(x.add(y));
        return result;
    }

    @PostMapping("/subtraction")
    public Result subtraction(@RequestParam(value = "x") BigDecimal x, @RequestParam(value = "y") BigDecimal y) {
		Result result = new Result();
		result.setX(x);
		result.setY(y);
		result.setOperation(Operation.SUBTRACTION);
		result.setResult(x.subtract(y));
        return result;
    }

    @PostMapping("/multiplication")
    public Result multiplication(@RequestParam(value = "x") BigDecimal x, @RequestParam(value = "y") BigDecimal y) {
		Result result = new Result();
		result.setX(x);
		result.setY(y);
		result.setOperation(Operation.MULTIPLICATION);
		result.setResult(x.multiply(y));
        return result;
    }

    @PostMapping("/division")
    public Result division(@RequestParam(value = "x") BigDecimal x, @RequestParam(value = "y") BigDecimal y) {
		Result result = new Result();
		result.setX(x);
		result.setY(y);
		result.setOperation(Operation.DIVISION);
		result.setResult(x.divide(y));
        return result;
    }
}
