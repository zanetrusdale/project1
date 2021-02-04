import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.println("Избери една опция:");
            System.out.println("---------------------------\n"+
                    "   1. Продукти, които предлагаме \n" + //Products that we provide and their descriptions:
                    "   2. Налични продукти \n" +          //Products that we have at the moment:
                    "   3. Изход \n" +
                    "----------------------------" );
            byte userChoise = input.nextByte();
            switch (userChoise) {
                case 1:
                    showTheProductsWeProvide();
                    break;
                case 2:
                    showAvailableProducts();
                case 3:
                    exitProgram();
                    break;
                default:
                    do {
                        System.out.println("Грешен избор, моля изберете пак:");
                         userChoise = input.nextByte();
                    } while (userChoise > 3 || userChoise < 1);
            }
        }

    }

    public static void showAvailableProducts(){
        ArrayList<String> productsAvailable = new ArrayList<String>();
        productsAvailable.add("\n, - Кока Кола \n");
        productsAvailable.add("- Закуски \n");
        productsAvailable.add("- Водка \n");


        ArrayList<String> expireDates = new ArrayList<String>();
        expireDates.add("\n, - 20 days \n");
        expireDates.add("- 3 days \n");
        expireDates.add("- 50 days \n");

       for (int i = 0; i < productsAvailable.size(); i++){
            System.out.print(productsAvailable.get(i) );
            System.out.println(expireDates.get(i));
        }


    }

    public static void showTheProductsWeProvide(){
        ArrayList <String> productsWeProvide = new ArrayList<String>();
        productsWeProvide.add("\n, Кока Кола - Захар като за диабет - 500ml\n");
        productsWeProvide.add("Пиринско - Младо Пиво - Млада Бира за Млади Хора - 2l\n");
        productsWeProvide.add("Водка - Савой - Ако немаш пари - 700ml\n");
        productsWeProvide.add("Закуски - (Пици, Банички, Саламки) - Дигант - Малко не струват, но пък са евтини - 350g\n");
        productsWeProvide.add("Чипсове, Хрупанки - Зайо Байо - Пълни са с.... - 300g\n");

        System.out.println(productsWeProvide);


    }
    public static void exitProgram(){
        System.exit(0);
    }


}