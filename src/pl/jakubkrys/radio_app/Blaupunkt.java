package pl.jakubkrys.radio_app;

public class Blaupunkt implements Work {

    public Blaupunkt() {
    }

    @Override
    public void turnOn() {
        System.out.println("Turn on Blaupunkt");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off Blaupunkt");
    }

    @Override
    public void changeStation() {
        System.out.println("Change station on Blaupunkt");
    }

    @Override
    public void readFromUSB(){
        System.out.println("Read from USB on Blaupunkt");
    }
}
