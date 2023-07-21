package com.csi.controller;


import com.csi.model.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/api")
public class EmployeeController {


    @GetMapping("/say")

    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Welcome To Fintech Csi Pune..");
    }

    @GetMapping("/listofemployees")

    public ResponseEntity<List<Employee>> getalldata() {
        return ResponseEntity.ok(Stream.of(new Employee(121, "Sachin", 98500),
                new Employee(122, "Arjun", 8500),
                new Employee(123, "Sunny", 68500),
                new Employee(124, "Pillu", 9500),
                new Employee(125, "Jayuu", 72500)).collect(Collectors.toList()));
    }

    @GetMapping("/userdata")


    public ResponseEntity<Principal> userdata(Principal principal){
        return ResponseEntity.ok(principal);
    }

}
