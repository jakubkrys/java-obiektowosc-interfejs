package pl.jakubkrys;

public class DatabaseRepo implements Repo{

    @Override
    public void save(String text) {
        System.out.println("Saved to database: " + text);
    }

    @Override
    public void get() {
        System.out.println("Got data from database");
    }

}
