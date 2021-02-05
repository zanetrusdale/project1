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

        int availableNumber [] = {50, 20, 15};

        double dateProductArrived [] = {5.02, 13.02, 1.02};

        String expireDates [] = {"20 days", "3 days", "50 days"};


       for (int i = 0; i < availableProducts.length; i++){                 //Знам, че ги събрах малко кофти
            System.out.print(availableProducts[i] + " - " + availableNumber[i] + "бр" + " - " + dateProductArrived[i] + " - " + expireDates[i] + "\n");
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
        Scanner input = new Scanner(System.in);

        ArrayList <String> shelfUpTen = new ArrayList<String>();
        ArrayList <String> shelfFromTenToTwenty = new ArrayList<String>();

        System.out.println("Моля изберете продукт:");                       //TODO: Finish the shelfs
            String newOrder = input.nextLine();
        System.out.println("Моля изберете брой:");
            int productNumberOfTheOrder = input.nextInt();

        if (productNumberOfTheOrder < 1){
            System.out.println("Недостатъчно количество за поръчка");
        }   else if(productNumberOfTheOrder >= 1 && productNumberOfTheOrder <= 10){
            shelfUpTen.add(newOrder);
            System.out.println(shelfUpTen);
        } else if (productNumberOfTheOrder > 10 && productNumberOfTheOrder <= 20){
            shelfFromTenToTwenty.add(newOrder);
            System.out.println(shelfFromTenToTwenty);
        } else {
            System.out.println("Wrong information with the order");
        };
    public static void makeMenuForProductOrder

    }
    public static void exitProgram(){           // Last choise - the method to exit the program ;)
        System.exit(0);
    }


}