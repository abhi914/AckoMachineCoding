package com.interview.Acko.MachineCoding.Controller;

import com.interview.Acko.MachineCoding.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/hello")
    public String hello(@RequestParam(value="param", defaultValue = "10") String name) {
        return "Hello From " + name;
    }

}
