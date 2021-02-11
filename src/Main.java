import java.util.Scanner;
import java.util.ArrayList;
//Todo make search by date:
public class Main {
    static Scanner input = new Scanner(System.in);

   static ArrayList <String> orderedProducts = new ArrayList<String>();
   static ArrayList <String> orderedProductsShelf1 = new ArrayList<String>();
   static ArrayList <String> orderedProductsShelf2 = new ArrayList<String>();
   static ArrayList <String> orderedProductsShelf3 = new ArrayList<String>();

   static ArrayList<Integer> numberOfTheProductOrder = new ArrayList<Integer>();
   static ArrayList<Integer> numberOfTheProductOrderShelf1 = new ArrayList<Integer>();
   static ArrayList<Integer> numberOfTheProductOrderShelf2 = new ArrayList<Integer>();
   static ArrayList<Integer> numberOfTheProductOrderShelf3 = new ArrayList<Integer>();

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
            System.out.println("Няма налично количество.\n");
        } developStorage();
    } public static void distributeTheProducts (){
        System.out.println("Максимално количество - 30броя на ред.");

        developShelf1();
        developShelf2();
        developShelf3();
    }
    public static void developShelf1() {
        System.out.println("Рафт 1 - до 10 броя стока");
        System.out.println("----------------------------------------");
        if (orderedProductsShelf1.size() >= 1) {
            for (int i = 0; i < orderedProductsShelf1.size(); i++) {
                System.out.println(orderedProductsShelf1.get(i) + "- " + numberOfTheProductOrderShelf1.get(i) + "бр");
            }
        } else {
            System.out.println("Празен.");
        } System.out.println("----------------------------------------\n");
    }
        public static void developShelf2 (){
            System.out.println("Рафт 2 - между 11 и 20 броя стока");
            System.out.println("----------------------------------------");
            if (orderedProductsShelf2.size() >= 1) {
                for (int i = 0; i < orderedProductsShelf2.size(); i++) {
                    System.out.println(orderedProductsShelf2.get(i) + "- " + numberOfTheProductOrderShelf2.get(i) + "бр");
                }
            } else {
                System.out.println("Празен.");
            } System.out.println("----------------------------------------\n");
        }
        public static void developShelf3(){
            System.out.println("Рафт 3 - между 21 и 30 броя стока.");
            System.out.println("----------------------------------------");
        if (orderedProductsShelf3.size() >= 1 ){
            for (int i = 0; i < orderedProductsShelf3.size(); i++) {
                System.out.println(orderedProductsShelf3.get(i) + "- " + numberOfTheProductOrderShelf3.get(i) + "бр");
            }
        } else {
            System.out.println("Празен.");
        } System.out.println("----------------------------------------\n");
    }

    public static void showProductsThatCanBeOrdered(){
        System.out.println("Продукти които могат да бъдат избрани.");
        System.out.println("----------------------------------------");
        String orderNumber [] = {"1." , "2.",  "3.", "4.", "5.",};
       String products [] = {"Кола ", "Водка ", "Бира ", "Закуски ", "Чипсове "};
       for (int i = 0; i < products.length; i++){
           System.out.println(orderNumber[i] + products[i]);
       } System.out.println("----------------------------------------\n");

         System.out.println("Моля изберете продукт.");                                    // Start ordering the product.
       int productChoise = input.nextInt();

       if (productChoise > 5 && productChoise < 1){
           System.out.println("Грешен избор, моля опитайте отново.");
          productChoise = input.nextInt();
       }  developTheOrder(productChoise, products);
    } public static void developTheOrder (int productChoise, String products []) {
        orderedProducts.add(products[productChoise - 1]);    //Добавяне на продуктите в общ ьрей лист

        System.out.println("Моля изберете брой - до 30бр");
        int numberChoise = input.nextInt();
        if (numberChoise > 30 && numberChoise < 1) {
            System.out.println("Неправилно количество");
        } else if(numberChoise > 1 && numberChoise <= 10){
            orderedProductsShelf1.add(products[productChoise - 1]);                 // Добавяне на продуктите в 1ви рафт
            numberOfTheProductOrderShelf1.add(numberChoise);
        } else if(numberChoise > 10 && numberChoise <= 20){
            orderedProductsShelf2.add(products[productChoise - 1]);                 // Добавяне на продуктите в 2ри рафт
            numberOfTheProductOrderShelf2.add(numberChoise);
        } else if(numberChoise > 20 && numberChoise <= 30){
            orderedProductsShelf3.add(products[productChoise - 1]);                 // Добавяне на продуктите в 3ти рафт
            numberOfTheProductOrderShelf3.add(numberChoise);
        }
        addOrFinishTheOrder(numberChoise);
    } public static void addOrFinishTheOrder(int numberChoise){
        numberOfTheProductOrder.add(numberChoise);

        System.out.println("1. Добави продукт");
        System.out.println("2. Завърши поръчката");
            int choiseToAddOrFinishTheOrder = input.nextInt();
            switch (choiseToAddOrFinishTheOrder){
                case 1:
                    showProductsThatCanBeOrdered();
                    break;
                case 2:
                    finishTheOrder();
                    break;
            } do {
               System.out.println("Грешен избор, моля изберете пак:");
               choiseToAddOrFinishTheOrder = input.nextByte();
           } while (choiseToAddOrFinishTheOrder > 2 || choiseToAddOrFinishTheOrder < 1);
    } public static void finishTheOrder(){
        System.out.println("Цялостна поръчка.");
        for (int i = 0; i < orderedProducts.size(); i++){
            System.out.println(orderedProducts.get(i) + "- " + numberOfTheProductOrder.get(i) + "бр");
        } developStorage();
    }

    public static void exitProgram(){           // Last choise - the method to exit the program ;)
        System.exit(0);
    }
}