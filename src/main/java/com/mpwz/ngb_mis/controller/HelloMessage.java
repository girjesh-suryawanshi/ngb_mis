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

        return new ResponseEntity<>("Hello   world by jitendra", HttpStatus.OK);

    }

    @RequestMapping(method = RequestMethod.GET,value = "user")
    public ResponseEntity<String>helloUser(){

        return new ResponseEntity<>("Hello User", HttpStatus.OK);

    }


}
