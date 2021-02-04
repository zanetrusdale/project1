import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.println("Избери една опция:");
            System.out.println("---------------------------\n"+
                    "   1. Налични продукти \n" +
                    "   2. Изход \n" +
                    "----------------------------" );
            byte userChoise = input.nextByte();
            switch (userChoise) {
                case 1:
                    showAvailableProducts();
                    break;
                case 2:
                    exitProgram();
                    break;
                default:
                    do {
                        System.out.println("Грешен избор, моля изберете пак:");
                         userChoise = input.nextByte();
                    } while (userChoise < 2 || userChoise > 1);
            }
        }

    }
    public static void showAvailableProducts(){

    }
    public static void exitProgram(){
        System.exit(0);
    }


}