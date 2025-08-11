package main.java.internship.Phanka1;
public class Fans {
    private boolean isOn = false;
    private FanSpeed speed;
    private String brandName="Orient";
    public Fans(){
        this.speed=FanSpeed.OFF;
    }
    public void switchOnTheFan() {
        isOn = true;
        speed = FanSpeed.LOW;
        System.out.println("Fan is switching on");
    }

    public void switchOffTheFan() {
        isOn = false;
        speed = FanSpeed.OFF;
        System.out.println("Fan is switching off");
    }

    public boolean status() {
        return isOn == true;
    }

    public void increace() {
        if(status()==false){
            System.out.println("please switch on fan");
        } else {
            speed = speed.increase();
        }
    }

    public void decrease() {
        if(status()==false){
            System.out.println("The fan is already off");
        } else {
            speed = speed.decrease();
        }
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public FanSpeed getSpeed() {
        return speed;
    }

    public void setSpeed(FanSpeed speed) {
        this.speed = speed;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public String toString() {
        return "Fans{" +
                "isOn=" + isOn +
                ", speed=" + speed +
                ", brandName='" + brandName + '\'' +
                '}';
    }
}