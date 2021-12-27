package com.cjss.deva.RestTemplete.rest;

import com.cjss.deva.RestTemplete.model.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/")
public class EmployeeRestControl {
        @GetMapping("/data")
    public ResponseEntity<String> showData(){

        return new ResponseEntity<String>(
                "Hello Data!",
                HttpStatus.OK);
    }
    @GetMapping("/obj")
    public ResponseEntity<Employee> showObject(){
         return new ResponseEntity<Employee>(new Employee(1,"devaraju","1500"),HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Employee>> showList(){
            return new  ResponseEntity<List<Employee>>(Arrays.asList(
                    new Employee(1,"devaraju","14000"),
                    new Employee(1,"raj","1400"),
                    new Employee(3,"rajkumar","1300")
            ),HttpStatus.OK);
    }
}
