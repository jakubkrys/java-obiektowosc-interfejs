package pl.jakubkrys;

public interface Repo {

    void save(String text);

    void get();

    default void getByID(int id) {
        System.out.println("Get by ID");
    }
}
