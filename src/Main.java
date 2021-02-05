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
                    "   2. Продукти и наличност \n" +                //Products that we have at the moment:
                    "   3. Разпределение на склада \n" +        //Where the product is placed
                    "   4. Изход \n" +
                    "----------------------------" );
            byte userChoise = input.nextByte();
            switch (userChoise) {
                case 1:
                    showTheProductsWeProvide();
                    break;
                case 2:
                    developAvailability();
                    break;
                case 3:
                    developStorage();
                    break;
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


    public static void showTheProductsWeProvide(){             //Method for the User's 1st choise

        ArrayList <String> productsWeProvide = new ArrayList<String>();
        productsWeProvide.add("\n, Кока Кола - Захар като за диабет - 500ml\n");
        productsWeProvide.add("Пиринско - Младо Пиво - Млада Бира за Млади Хора - 2l\n");
        productsWeProvide.add("Водка - Савой - Ако немаш пари - 700ml\n");
        productsWeProvide.add("Закуски - (Пици, Банички, Саламки) - Дигант - Малко не струват, но пък са евтини - 350g\n");
        productsWeProvide.add("Чипсове, Хрупанки - Зайо Байо - Пълни са с.... - 300g\n");

        System.out.println(productsWeProvide);
    }


    public static void developAvailability(){           //2nd choise
        Scanner input = new Scanner(System.in);

       while (true) {
           System.out.println("Избери опция");
           System.out.println("---------------------------\n"+
                   "   1. Менажиране на склада \n" +
                   "   2. Менажиране на продукти \n" +
                   "   3. Изход \n" +
                   "----------------------------" );
           byte userChoise = input.nextByte();
           switch (userChoise){
               case 1:
                   developStorage();
                   break;
               case 2:
                   developProducts();
               case 3:  //exit the program
                   break;
           }
       }
    }


    public static void developStorage(){
        showAvailableProducts();
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


    public static void developProducts(){                          //Develop Products
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.println("Избери опция");
                System.out.println("---------------------------\n"+
                    "   1. Заяви поръчка \n" +
                    "   2. Изход \n" +
                    "----------------------------" );

                byte userChoise = input.nextByte();
                switch (userChoise){
                    case 1:
                        addNewOrder();
                        break;
                    case 2:  //exit the program
                        break;
                }
        }
    }

    public static void addNewOrder(){  //Chosen add Order
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Моля изберете продукта, който искате да поръчате:");
            System.out.println("---------------------------\n" +
                    "   1. Кока Кола \n" +
                    "   2. Фанта \n" +
                    "   3. Закуски \n" +
                    "   4. Водка \n" +
                    "   5. Бира \n" +
                    "   6. Зайо Байо \n" +
                    "----------------------------");
            byte userChoise = input.nextByte();
            switch (userChoise){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                default:
                    do {
                        System.out.println("Грешен избор, моля изберете пак:");
                        userChoise = input.nextByte();
                    } while (userChoise > 4 || userChoise < 1);
            }
        }
    }

    public static void exitProgram(){           // Last choise - the method to exit the program ;)
        System.exit(0);
    }


}