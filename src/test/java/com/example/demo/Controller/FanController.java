package com.example.demo.Controller;

import com.example.demo.Services.FanServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FanController {
    private FanServices fanServices;
    @Autowired
    public FanController(FanServices fanServices){
        this.fanServices = fanServices;
    }
    @GetMapping("/fan/switchon/{fanNumber}")
    public void switchOn(@PathVariable Integer fanNumber){
        System.out.println("Fan number to switch on : " + fanNumber);
        fanServices.switchOn(fanNumber);

    }
    @GetMapping("/fan/switchoff/{fanNumber}")
    public void switchOff(@PathVariable Integer fanNumber){
        System.out.println("Fan is switched off: "+fanNumber);
        fanServices.switchOff(fanNumber);

    }

    @GetMapping("/fan/increase/{fanNumber}")
    public void IncreaseSpeed(@PathVariable Integer fanNumber){
        fanServices.IncreaseSpeed(fanNumber);

    }

    @GetMapping("/fan/decrease/{fanNumber}")
    public void DecreaseSpeed(@PathVariable Integer fanNumber){
        fanServices.DecreaseSpeed(fanNumber
        );

    }
    @GetMapping("/fan/report")
    public void report(){
        fanServices.report();

    }
}
