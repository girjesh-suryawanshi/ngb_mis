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

        return new ResponseEntity<>("Hello world", HttpStatus.OK);

    }



    

    @RequestMapping(method = RequestMethod.GET,value = "arpit")
    public ResponseEntity<String>helloArpit(){

        return new ResponseEntity<>("Hello Arpit", HttpStatus.OK);

    }

    @RequestMapping(method = RequestMethod.POST,value = "arpit")
    public ResponseEntity<String>addt(){

        return new ResponseEntity<>("add", HttpStatus.OK);

    }
    @RequestMapping(method = RequestMethod.POST,value = "arpit")
    public ResponseEntity<String>sub(){

        return new ResponseEntity<>("add", HttpStatus.OK);

    }
}
