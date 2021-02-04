import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;

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
                    } while (userChoise > 2 || userChoise < 1);
            }
        }

    }
    public static void showAvailableProducts(){
        ArrayList <String> availableProducts = new ArrayList<String>();
            availableProducts.add("\n, Кока Кола \n");
            availableProducts.add("Пиринско Младо Пиво \n");
            availableProducts.add("Водка Савой - Ако немаш пари \n");
            availableProducts.add("Закуски- (Пици, Банички, Саламки) - Дигант \n");
            availableProducts.add("Чипсове, Хрупанки - Зайо Байо \n");

        System.out.println(availableProducts);

    }
    public static void exitProgram(){
        System.exit(0);
    }


}