package pl.jakubkrys.radio_app;

public class Lenco implements Work {

    public Lenco() {
    }

    @Override
    public void turnOn() {
        System.out.println("Turn on Lenco");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off Lenco");
    }

    @Override
    public void changeStation() {
        System.out.println("Change station on Lenco");
    }

    public void readFromCDDVD(){
        System.out.println("Read from CD on Lenco");
    }
}
