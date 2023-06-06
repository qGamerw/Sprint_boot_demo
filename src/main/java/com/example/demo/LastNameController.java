package com.example.demo;

import com.example.demo.domain.MassengDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@RestController
public class LastNameController {

    @Autowired
    private MassengDao bdDaoAccessingdatamysql;
    @RequestMapping("/last")
    String lastname(
            @RequestParam(name="name",
            required=false, defaultValue="Wool") String name,
            Map<String, Object> model) {
        model.put("name", name);
        return String.format("Hello (lastname) %s!", name);
    }

    @GetMapping
    public String main(Map<String, Object> model){
//        bdDaoAccessingdatamysql.findAll();
        model.put("some", "Hello (main), letscode");
        return "main";
    }

}
