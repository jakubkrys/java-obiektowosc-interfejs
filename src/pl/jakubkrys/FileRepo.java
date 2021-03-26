package pl.jakubkrys;

public class FileRepo implements Repo{

    @Override
    public void save(String text){
        System.out.println("Saved to file: "+text);
    }

    @Override
    public void get(){
        System.out.println("Got data from file");
    }
}
