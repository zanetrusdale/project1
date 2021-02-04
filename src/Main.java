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

                    break;
                case 2:
                    exitProgram();
                    break;
            }
        }

    }
    public static void exitProgram(){
        System.exit(0);
    }


}