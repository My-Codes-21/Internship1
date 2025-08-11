package com.example.demo.Services;

import Fan.Fans;

import java.util.ArrayList;

public class FanServices {
    ArrayList<Fans> FansArrayList = new ArrayList<>();
    public FanServices() {
        int i = 1;
        while (i <= 180) {
            Fans f = new Fans();
            FansArrayList.add(f);
            i++;
        }
    }

    Fans f = new Fans();

    public void switchOn() {
        if (f.isOn() == false) {
            System.out.println("Starting the fan");
            f.switchOnTheFan();


        } else {
            System.out.println("fan is already runninng");
        }

    }

    public void switchOff() {
        if (f.isOn() == true) {
            System.out.println("Fan switched off");
            f.switchOffTheFan();

        } else {
            System.out.println("Fan is already switched off");
        }


    }

    public void IncreaseSpeed() {
        f.increace();
        System.out.println("Fan speed is: " + f.getSpeed());

    }

    public void DecreaseSpeed() {
        f.decrease();
        System.out.println("Fan speed is: " + f.getSpeed());

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