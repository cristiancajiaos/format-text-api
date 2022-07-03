package com.example.opr.controller;

import com.example.opr.model.OpResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class OpResultController {

    private final AtomicLong counter = new AtomicLong();

    @GetMapping("lowercase")
    public OpResult lowercase(@RequestParam(value="str", defaultValue = "Hello, world!") String str) {
        String newStr = str.toLowerCase();
        OpResult result = new OpResult(counter.incrementAndGet(), newStr);
        return result;
    }
}
