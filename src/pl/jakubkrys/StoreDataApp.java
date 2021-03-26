package pl.jakubkrys;

import java.util.Scanner;

public class StoreDataApp {

    private static Scanner scanner = new Scanner(System.in, "UTF-8");
    private static Repo repo;

    public static void main(String[] args) {

        int option;

        do {
            displayMainMenu();
            option = getOption();

            switch (option) {
                case 1:
                    System.out.print("Text: ");
                    String text = scanner.nextLine();
                    saveDataMenu();
                    option = getOption();

                    saveDataOptions(option, text);
                    break;
                case 2:
                    getDataMenu();
                    option = getOption();

                    getDataOptions(option);
                    break;
                case 3:
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    getByIDMenu(id);
                    break;
            }
        } while (option != 0);
        scanner.close();
    }

    private static void getByIDMenu(int id) {
        repo = new DatabaseRepo();
        repo.getByID(id);
    }

    private static void getDataOptions(int option) {
        switch (option) {
            case 1:
                repo = new FileRepo();
                repo.get();
                break;
            case 2:
                repo = new DatabaseRepo();
                repo.get();
                break;
        }
    }

    private static void saveDataOptions(int option, String text) {
        switch (option) {
            case 1:
                repo = new FileRepo();
                repo.save(text);
                break;
            case 2:
                repo = new DatabaseRepo();
                repo.save(text);
                break;
        }
    }

    private static void getDataMenu() {
        System.out.println("Get data");
        System.out.println("1 - get from file");
        System.out.println("2 - get from database");
    }

    private static void saveDataMenu() {
        System.out.println("1 - save to file");
        System.out.println("2 - save to database");
    }

    private static int getOption() {
        int option;
        option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }

    private static void displayMainMenu() {
        System.out.println("----- Store Data App -----");
        System.out.println("1 - save data");
        System.out.println("2 - get data");
        System.out.println("3-  get data by ID");
        System.out.println("0 - quit");
    }
}
