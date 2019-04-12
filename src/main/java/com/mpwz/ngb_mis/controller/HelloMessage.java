package com.mpwz.ngb_mis.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/greeting")
public class HelloMessage {

    @RequestMapping(method = RequestMethod.GET,value ="hello")
    public ResponseEntity<String>helloWorld(){

        return new ResponseEntity<>("Hello world This is change", HttpStatus.OK);

    }

    @RequestMapping(method = RequestMethod.GET,value ="hemant")
    public ResponseEntity<String>helloHemant(){

        return new ResponseEntity<>("Hello world This is change", HttpStatus.OK);

    }


}
