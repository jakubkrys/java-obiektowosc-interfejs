package pl.jakubkrys.radio_app;

public interface Work {

    void turnOn();

    void turnOff();

    void changeStation();

    default void readFromCDDVD(){
        System.out.println("Read from CD");
    }

    default void readFromUSB(){
        System.out.println("Read from USB");
    }

    default void useRemoteContoller(){
        System.out.println("Use remote controller");
    }
}
