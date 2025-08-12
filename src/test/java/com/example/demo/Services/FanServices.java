package com.example.demo.Services;

import Fan.Fans;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class FanServices {
    ArrayList<Fans> FansArrayList = new ArrayList<>();
    Fans f1 =new Fans();
    public FanServices() {
        int i = 1;
        while (i <= 180) {
            Fans f = new Fans();
            FansArrayList.add(f);
            i++;
        }
    }


    public void switchOn(Integer fanNumber) {
        /*if (f.isOn() == false) {
            System.out.println("Starting the fan");
            f.switchOnTheFan();


        } else {
            System.out.println("fan is already runninng");
        }*/
        Fans f1 = FansArrayList.get(fanNumber);
        f1.switchOnTheFan();
        System.out.println("Fan is switch on");


    }

    public void switchOff(Integer fanNumber) {
        /*if (f.isOn() == true) {
            System.out.println("Fan switched off");
            f.switchOffTheFan();

        } else {
            System.out.println("Fan is already switched off");
        }*/

        Fans f1 = FansArrayList.get(fanNumber);
        f1.switchOffTheFan();
        System.out.println("Fan is switch off");


    }

    public void IncreaseSpeed(Integer fanNumber) {
        Fans f1 = FansArrayList.get(fanNumber);
        f1.increace();
        System.out.println("Fan speed is: " + f1.getSpeed());

    }

    public void DecreaseSpeed(Integer fanNumber) {
        Fans f1 = FansArrayList.get(fanNumber);
        f1.decrease();
        System.out.println("Fan speed is: " + f1.getSpeed());

    }

    public void report() {
        //running=false;
        int onCount = 0;
        int offCount = 0;
        for (Fans fan : FansArrayList) {
            if (fan.isOn()) {
                onCount++;
            } else {
                offCount++;
            }


        }

    }
}













