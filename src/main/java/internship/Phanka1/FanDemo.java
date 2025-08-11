package main.java.internship.Phanka1;
import java.util.*;

public class FanDemo {
    public static void main(String[] args) {
        ArrayList<Fans> FansArrayList = new ArrayList<>();
        Fans f1 = new Fans();
        Scanner sc = new Scanner(System.in);

        int i = 1;
        while (i <= 180) {
            Fans f = new Fans();
            FansArrayList.add(f);
            i++;
        }
        System.out.println("No of fans in warehouse : " + FansArrayList.size());
        boolean outerrunning = true;
        while (outerrunning == true) {
            System.out.println("Enter fan no to selected: ");
            int fanSelected = sc.nextInt();
            Fans f = FansArrayList.get(fanSelected);
            boolean running = true;

            while (running == true) {
//            System.out.println("--Fan Controls--");
                System.out.println("1-Switch on the fan");
                System.out.println("2-Switch off the fan");
                System.out.println("3-Increase speed of fan");
                System.out.println("4-Decrease speed of fan");
                System.out.println("5-Fan selected");
                System.out.println("6-quit");
                System.out.println("7-show fan status summary");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1 -> {
                        if (f.isOn() == false) {
                            System.out.println("Starting the fan");
                            f.switchOnTheFan();


                        } else {
                            System.out.println("fan is already runninng");
                        }
                    }
                    case 2 -> {
                        if (f.isOn() == true) {
                            System.out.println("Fan switched off");
                            f.switchOffTheFan();

                        } else {
                            System.out.println("Fan is already switched off");
                        }
                    }
                    case 3 -> {
                        f.increace();
                        System.out.println("Fan speed is: " + f1.getSpeed());
                    }
                    case 4 -> {
                        f.decrease();
                        System.out.println("Fan speed is: " + f1.getSpeed());
                    }

                    case 5 -> {
                        running = false;
                        System.out.println("Enter another fan");
                    }
                    case 6 -> {
                        running = false;
                        outerrunning = false;
                        System.out.println("Exited");
                    }
                    case 7 -> {
                        running=false;
                        int onCount = 0;
                        int offCount = 0;
                        for (Fans fan : FansArrayList) {
                            if (fan.isOn()) {
                                onCount++;
                            } else {
                                offCount++;
                            }
                        }
                        System.out.println("Fan Status Summary:");
                        System.out.println("Fans ON  : " + onCount);
                        System.out.println("Fans OFF : " + offCount);
                    }
                    case 8 ->{
                        System.out.println("Enter fan number to check status:");
                        int fanNum = sc.nextInt();

                        if (fanNum < 0 || fanNum >= FansArrayList.size()) {
                            System.out.println("Invalid fan number.");
                        } else {
                            Fans selectedFan = FansArrayList.get(fanNum);
                            System.out.println(" Fan " + fanNum + " Status:");
                            System.out.println("Power   : " + (selectedFan.isOn() ? "ON" : "OFF"));
                            System.out.println("Speed   : " + selectedFan.getSpeed());
                            System.out.println("Brand   : " + selectedFan.getBrandName());
                        }

                    }
                }

            }

        }
        sc.close();
    }
}