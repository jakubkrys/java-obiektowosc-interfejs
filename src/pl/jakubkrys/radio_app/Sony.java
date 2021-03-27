package pl.jakubkrys.radio_app;

public class Sony implements Work {

    public Sony() {
    }

    @Override
    public void turnOn() {
        System.out.println("Turn on Sony");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off Sony");
    }

    @Override
    public void changeStation() {
        System.out.println("Change station on Sony");
    }

    public void useRemoteContoller(){
        System.out.println("Use remote controller on Sony");
    }
}
