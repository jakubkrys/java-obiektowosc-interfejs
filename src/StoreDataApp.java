import java.util.Scanner;

public class StoreDataApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, "UTF-8");
        int option;

        do {
            System.out.println("----- Store Data App -----");
            System.out.println("1 - save data");
            System.out.println("2 - get data");
            System.out.println("0 - quit");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Text: ");
                    String text = scanner.nextLine();
                    System.out.println("1 - to file");
                    System.out.println("2 - to database");
                    option = scanner.nextInt();
                    scanner.nextLine();

                    switch (option) {
                        case 1:
                            System.out.println("Saved to file");
                            break;
                        case 2:
                            System.out.println("Saved to database");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Get data");
                    System.out.println("1 - from file");
                    System.out.println("2 - from database");
                    option = scanner.nextInt();
                    scanner.nextLine();

                    switch (option) {
                        case 1:
                            System.out.println("Got from file");
                            break;
                        case 2:
                            System.out.println("Got from database");
                            break;
                    }
                    break;
            }
        } while (option != 0);
        scanner.close();
    }
}
