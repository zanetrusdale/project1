import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.println("Днешна дата: 13.02\n");             // With this date i check my code for errors with expire dates, expire dates ect...
                System.out.println("Избери една опция:");
            System.out.println("---------------------------\n"+
                    "   1. Продукти, които предлагаме \n" +       //Products that we provide and their descriptions: - (you can add order based on  this products)
                    "   2. Налични продукти \n" +                //Products that we have at the moment:
                    "   3. Разпределение на склада \n" +        //Where the product is placed
                    "   4. Изход \n" +
                    "----------------------------" );
            byte userChoise = input.nextByte();
            switch (userChoise) {
                case 1:
                    showTheProductsWeProvide();
                    break;
                case 2:
                    showAvailableProducts();
                case 3:
                    showThePlacementOfTheProducts(); // Place of the products:
                case 4:
                    exitProgram();
                    break;
                default:
                    do {
                        System.out.println("Грешен избор, моля изберете пак:");
                         userChoise = input.nextByte();
                    } while (userChoise > 4 || userChoise < 1);
            }
        }

    }

    public static void showAvailableProducts(){                             //Method for User's choise "2"

        String availableProducts [] = {"Кока Кола","Закуски","Водка"};

        Double dateProductArrived [] = {5.02, 13.02, 1.02};

        String expireDates [] = {"20 days", "3 days", "50 days"};


       for (int i = 0; i < availableProducts.length; i++){
            System.out.print(availableProducts[i] + " - " + dateProductArrived[i] + " - " + expireDates[i] + "\n");
        }


    }

    public static void showTheProductsWeProvide(){             //Method for the User's 1st choise
        ArrayList <String> productsWeProvide = new ArrayList<String>();
        productsWeProvide.add("\n, Кока Кола - Захар като за диабет - 500ml\n");
        productsWeProvide.add("Пиринско - Младо Пиво - Млада Бира за Млади Хора - 2l\n");
        productsWeProvide.add("Водка - Савой - Ако немаш пари - 700ml\n");
        productsWeProvide.add("Закуски - (Пици, Банички, Саламки) - Дигант - Малко не струват, но пък са евтини - 350g\n");
        productsWeProvide.add("Чипсове, Хрупанки - Зайо Байо - Пълни са с.... - 300g\n");

        System.out.println(productsWeProvide);


    }
    public static void showThePlacementOfTheProducts (){
        ArrayList <String> placeOfTheProducts = new ArrayList<String>();
        placeOfTheProducts.add("1st raft\n");
        placeOfTheProducts.add("1st raft\n");
        placeOfTheProducts.add("1st raft\n");
        placeOfTheProducts.add("2nd raft\n");
        placeOfTheProducts.add("2nd raft\n");
    }
    public static void exitProgram(){           // Last choise - the method to exit the program ;)
        System.exit(0);
    }


}