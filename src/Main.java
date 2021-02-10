import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static Scanner input = new Scanner(System.in);

   static ArrayList <String> orderedProducts = new ArrayList<String>();
   static ArrayList<Integer> orderedProductsNumber = new ArrayList<Integer>();

    public static void main(String[] args) {
        ArrayList<String> productsOrdered = new ArrayList<String>();
        ArrayList<Integer> numberOfProductsOrdered = new ArrayList<Integer>();

        while (true){
                System.out.println("Избери една опция:");
            System.out.println("---------------------------\n"+
                    "   1. Продукти, които предлагаме \n" +
                    "   2. Склад \n" +
                    "   3. Изход \n" +
                    "----------------------------" );
            byte userChoise = input.nextByte();
            switch (userChoise) {
                case 1:
                    showTheProductsWeProvide();
                    break;
                case 2:
                    developStorage();
                    break;
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


    public static void showTheProductsWeProvide(){             //Method for the User's 1st choise

        ArrayList <String> productsWeProvide = new ArrayList<String>();
        productsWeProvide.add("\n, Кока Кола - Захар като за диабет - 500ml\n");
        productsWeProvide.add("Пиринско - Младо Пиво - Млада Бира за Млади Хора - 2l\n");
        productsWeProvide.add("Водка - Савой - Ако немаш пари - 700ml\n");
        productsWeProvide.add("Закуски - (Пици, Банички, Саламки) - Дигант - Малко не струват, но пък са евтини - 350g\n");
        productsWeProvide.add("Чипсове, Хрупанки - Зайо Байо - Пълни са с.... - 300g\n");

        System.out.println(productsWeProvide);
    }


    public static void developStorage(){

       while (true) {
           System.out.println("Избери опция");
           System.out.println("---------------------------\n"+
                   "   1. Налични продукти \n" +
                   "   2. Заяви Поръчка \n" +
                   "   3. Изход \n" +
                   "----------------------------" );
           byte userChoise = input.nextByte();
           switch (userChoise){
               case 1:
                   showAvailableProducts();
                   break;
               case 2:
                   showProductsThatCanBeOrdered();
                   break;
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

        if (orderedProducts.size() >= 1) {
            distributeTheProducts();
        } else {
            System.out.println("Няма налично количество.");
        } developStorage();
    } public static void distributeTheProducts (){

    }

    public static void showProductsThatCanBeOrdered(){
        System.out.println("Продукти които могат да бъдат избрани.");
        System.out.println("----------------------------------------");
        String orderNumber [] = {"1." , "2.",  "3.", "4.", "5.",};
       String products [] = {"Кола ", "Водка ", "Бира ", "Закуски ", "Чипсове "};
       for (int i = 0; i < products.length; i++){
           System.out.println(orderNumber[i] + products[i]);
       } System.out.println("----------------------------------------");

         System.out.println("Моля изберете продукт.");                                    // Start ordering the product.
       int productChoise = input.nextInt();
       if (productChoise > 5 && productChoise < 1){
           System.out.println("Грешен избор, моля опитайте отново.");
          productChoise = input.nextInt();
       }  orderProducts(productChoise, products);
    } public static void orderProducts (int productChoise, String products []){
       orderedProducts.add(products [productChoise - 1]);    //Добавяне на продуктите в масив

        System.out.println("Моля изберете брой");
        int numberChoise = input.nextInt();
        orderedProductsNumber.add(numberChoise);

           System.out.println("1. Добави продукт");
           System.out.println("2. Завърше поръчката");

            int addOrFinishTheOrder = input.nextInt();
            switch (addOrFinishTheOrder){
                case 1:
                    showProductsThatCanBeOrdered();
                    break;
                case 2:
                    finishTheOrder();
                    break;
            } do {
               System.out.println("Грешен избор, моля изберете пак:");
               addOrFinishTheOrder = input.nextByte();
           } while (addOrFinishTheOrder > 2 || addOrFinishTheOrder < 1);
    } public static void finishTheOrder(){
        for (int i = 0; i < orderedProducts.size(); i++){
            System.out.println(orderedProducts.get(i) + orderedProductsNumber.get(i));
        } developStorage();
    }

    public static void exitProgram(){           // Last choise - the method to exit the program ;)
        System.exit(0);
    }
}