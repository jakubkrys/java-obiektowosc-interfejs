package pl.jakubkrys.radio_app;

import java.util.Scanner;

public class RadioApp {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        Blaupunkt blaupunktBB12BKX = new Blaupunkt();
        Sony sonyZSPS50X = new Sony();
        Lenco lencoSCD650X = new Lenco();
        Work[] works = {blaupunktBB12BKX, sonyZSPS50X, lencoSCD650X};
        int mainOption, option;

        do {
            mainMenuDisplay();
            mainOption = getMainOption();

            switch (mainOption) {
                case 1:
                    turnMenu();
                    System.out.println("4 - Read from USB");
                    option = getOption();

                    switchMenu(works, mainOption, option);
                    break;
                case 2:
                    turnMenu();
                    System.out.println("4 - Use remote controller");
                    option = getOption();

                    switchMenu(works, mainOption, option);
                    break;
                case 3:
                    turnMenu();
                    System.out.println("4 - Read from CD/DVD");
                    option = getOption();

                    switchMenu(works, mainOption, option);
                    break;
            }
        } while (mainOption != 0);
        scanner.close();
    }

    private static void switchMenu(Work[] works, int mainOption, int option) {
        switch (option) {
            case 1:
                works[mainOption - 1].turnOn();
                break;
            case 2:
                works[mainOption - 1].turnOff();
                break;
            case 3:
                works[mainOption - 1].changeStation();
                break;
            case 4:
                if (works[mainOption - 1] instanceof Blaupunkt) {
                    works[mainOption - 1].readFromUSB();
                } else if (works[mainOption - 1] instanceof Sony) {
                    works[mainOption - 1].useRemoteContoller();
                } else if (works[mainOption - 1] instanceof Lenco) {
                    works[mainOption - 1].readFromCDDVD();
                }
                break;
        }
    }

    private static int getMainOption() {
        int option;
        option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }

    private static int getOption() {
        int option;
        option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }

    private static void mainMenuDisplay() {
        System.out.println("----- Radio App -----");
        System.out.println("1 - Blaupunkt BB12BKX");
        System.out.println("2 - Sony ZS-PS50X");
        System.out.println("3 - Lenco SCD-650X");
        System.out.println("0 - Quit");
    }

    private static void turnMenu() {
        System.out.println("1 - Turn on");
        System.out.println("2 - Turn off");
        System.out.println("3 - Change station");
    }
}
