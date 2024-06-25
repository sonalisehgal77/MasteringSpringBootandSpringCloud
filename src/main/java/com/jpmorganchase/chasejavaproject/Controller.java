package com.jpmorganchase.chasejavaproject;

import org.springframework.web.bind.annotation.*;
import com.jpmorganchase.chasejavaproject.EntityClass;


@RestController
public class Controller {

    private int apiID;
    private String apiName;
    private String LOB;

//    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
//    public int getApiID(@PathVariable Integer id) {
//        return new Integer(123);
//    }
    @GetMapping(value = "/apiID/{apiID}")
    public int getapiID(){

        return 123;
    }

    @GetMapping(value = "/apiID/{apiName}")
    public String getApiName(){

        return "SONALI";
    }

    @GetMapping(value = "/apiID/{LOB}")
    public String getLOB(){

        return "LOB";
    }



}
