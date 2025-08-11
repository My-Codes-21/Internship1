package com.example.demo.Controller;

import com.example.demo.Services.FanServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FanController {
    private FanServices fanServices;
    @Autowired
    public FanController(FanServices fanServices){
        this.fanServices = fanServices;
    }
    @GetMapping("/Fan/switchOn")
    public void switchOn(int fanNumber){
        fanServices.switchOn();

    }
    public void switchOff(){

    }
    public void IncreaseSpeed(){

    }
    public void DecreaseSpeed(){

    }
    public void report(){

    }
}
