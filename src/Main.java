import java.time.format.DateTimeFormatterBuilder;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    static Scanner input = new Scanner(System.in);

    static ArrayList<String> orderedProducts = new ArrayList<String>();
    static ArrayList<String> orderedProductsShelf1 = new ArrayList<String>();
    static ArrayList<String> orderedProductsShelf2 = new ArrayList<String>();
    static ArrayList<String> orderedProductsShelf3 = new ArrayList<String>();

    static ArrayList<Integer> numberOfTheProductOrder = new ArrayList<Integer>();
    static ArrayList<Integer> numberOfTheProductOrderShelf1 = new ArrayList<Integer>();
    static ArrayList<Integer> numberOfTheProductOrderShelf2 = new ArrayList<Integer>();
    static ArrayList<Integer> numberOfTheProductOrderShelf3 = new ArrayList<Integer>();

    static ArrayList<Integer> chooseMonthForTheOrder = new ArrayList<Integer>();
    static ArrayList<Integer> chooseDateForTheOrder = new ArrayList<Integer>();

    public static void main(String[] args) {

        while (true) {
            System.out.println("Избери една опция:");
            System.out.println("---------------------------\n" +
                    "   1. Продукти, които предлагаме \n" +
                    "   2. Склад \n" +
                    "   3. Изход \n" +
                    "----------------------------");
        doTheOptionsForTheFirstMenu();
        }
    }
    public static void doTheOptionsForTheFirstMenu(){
            byte userChoise = input.nextByte();
            switch (userChoise) {
                case 1:
                    addTheProductsWeProvide();
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

    public static void addTheProductsWeProvide() {             //Method for the User's 1st choise

        ArrayList<String> productsWeProvide = new ArrayList<String>();
        productsWeProvide.add("\n, Кока Кола - Захар като за диабет - 500ml - 10дни\n");
        productsWeProvide.add("Пиринско - Младо Пиво - Млада Бира за Млади Хора - 2l - 15дни\n");
        productsWeProvide.add("Водка - Савой - Ако немаш пари - 700ml\n");
        productsWeProvide.add("Закуски - (Пици, Банички, Саламки) - Дигант - Малко не струват, но пък са евтини - 350g - 3дни\n");
        productsWeProvide.add("Чипсове, Хрупанки - Зайо Байо - Пълни са с.... - 300g - 8дни\n");

        System.out.println(productsWeProvide);
    }

    public static void developStorage() {
        showMenu();
    }

    public static void showMenu() {
        while (true) {
            System.out.println("Избери опция");
            System.out.println("---------------------------\n" +
                    "   1. Всички налични продукти \n" +
                    "   2. Заяви Поръчка \n" +
                    "   3. Търси по дата \n" +
                    "   4. Изход \n" +
                    "----------------------------");
            doOptions();
        }
    }

    public static void doOptions() {
        byte userChoise = input.nextByte();
        switch (userChoise) {
            case 1:
                showAvailableProducts();
                break;
            case 2:
                showProductsThatCanBeOrdered();
                break;
            case 3:
                searchByDate();
                break;
            case 4:
                exitProgram();
                break;
            default:
                do {
                    System.out.println("Грешен избор, моля изберете пак:");
                    userChoise = input.nextByte();
                } while (userChoise > 3 || userChoise < 1);
        }
    }

    public static void showAvailableProducts() {

        if (orderedProducts.size() >= 1) {
            distributeTheProducts();
        } else {
            System.out.println("Няма налично количество.\n");
        }
        developStorage();
    }

    public static void distributeTheProducts() {
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
        }
        System.out.println("----------------------------------------\n");
    }

    public static void developShelf2() {
        System.out.println("Рафт 2 - между 11 и 20 броя стока");
        System.out.println("----------------------------------------");
        if (orderedProductsShelf2.size() >= 1) {
            for (int i = 0; i < orderedProductsShelf2.size(); i++) {
                System.out.println(orderedProductsShelf2.get(i) + "- " + numberOfTheProductOrderShelf2.get(i) + "бр");
            }
        } else {
            System.out.println("Празен.");
        }
        System.out.println("----------------------------------------\n");
    }

    public static void developShelf3() {
        System.out.println("Рафт 3 - между 21 и 30 броя стока.");
        System.out.println("----------------------------------------");
        if (orderedProductsShelf3.size() >= 1) {
            for (int i = 0; i < orderedProductsShelf3.size(); i++) {
                System.out.println(orderedProductsShelf3.get(i) + "- " + numberOfTheProductOrderShelf3.get(i) + "бр");
            }
        } else {
            System.out.println("Празен.");
        }
        System.out.println("----------------------------------------\n");
    }

    public static void showProductsThatCanBeOrdered() {
        System.out.println("Продукти които могат да бъдат избрани.");
        System.out.println("----------------------------------------");
        String orderNumber[] = {"1.", "2.", "3.", "4.", "5.",};
        String products[] = {"Кола ", "Водка ", "Бира ", "Закуски ", "Чипсове "};
        for (int i = 0; i < products.length; i++) {
            System.out.println(orderNumber[i] + products[i]);
        }
        System.out.println("----------------------------------------\n");
        chooseAProductForTheOrder(products);
    }

    public static void chooseAProductForTheOrder(String[] products) {
        System.out.println("Моля изберете продукт.");                                    // Start ordering the product.
        int productChoise = input.nextInt();

        if (productChoise > 5 || productChoise < 1) {
            System.out.println("Грешен избор, моля опитайте отново.");
            productChoise = input.nextInt();
        }
        developTheOrder(productChoise, products);
    }

    public static void developTheOrder(int productChoise, String products[]) {
        orderedProducts.add(products[productChoise - 1]);    //Добавяне на продуктите в общ Арей лист

        System.out.println("Моля изберете брой - до 30бр");
        int numberChoise = input.nextInt();
        if (numberChoise > 30 || numberChoise < 1) {
            System.out.println("Неправилно количество");
        } else if (numberChoise > 1 && numberChoise <= 10) {
            orderedProductsShelf1.add(products[productChoise - 1]);                 // Добавяне на продуктите в 1ви рафт
            numberOfTheProductOrderShelf1.add(numberChoise);
        } else if (numberChoise > 10 && numberChoise <= 20) {
            orderedProductsShelf2.add(products[productChoise - 1]);                 // Добавяне на продуктите в 2ри рафт
            numberOfTheProductOrderShelf2.add(numberChoise);
        } else if (numberChoise > 20) {
            orderedProductsShelf3.add(products[productChoise - 1]);                 // Добавяне на продуктите в 3ти рафт
            numberOfTheProductOrderShelf3.add(numberChoise);
        }
        addOrFinishTheOrder(numberChoise);
    }

    public static void addOrFinishTheOrder(int numberChoise) {
        numberOfTheProductOrder.add(numberChoise);

        System.out.println("1. Добави продукт");
        System.out.println("2. Завърши поръчката");
        int choiseToAddOrFinishTheOrder = input.nextInt();
        switch (choiseToAddOrFinishTheOrder) {
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
    }

    public static void chooseMonth() {
        System.out.println("Дата:");
        System.out.println("Изберете Месец:");
        int chooseMonth = input.nextInt();
        while (chooseMonth > 12 || chooseMonth < 1) {
            System.out.println("Невалиден месец, моля въведете отново:");
            chooseMonth = input.nextInt();
        }
        chooseMonthForTheOrder.add(chooseMonth);
        calculateDates(chooseMonth);
    }

    public static void calculateDates(int chooseMonth) {
        System.out.println("Изберете дата:");
        int chooseDate = input.nextInt();
        while (chooseMonth == 2 && chooseDate > 28 || chooseDate < 1) {
            System.out.println("Невалидна дата, моля изберете пак");
            chooseDate = input.nextInt();
        }
        while (chooseMonth == 4 || chooseMonth == 6 || chooseMonth == 9 || chooseMonth == 11 && chooseDate > 30) {
            System.out.println("Невалидна дата, моля изберете пак");
        }
        while (chooseDate < 1 || chooseDate > 31) {
            System.out.println("Невалидна дата, моля изберете пак");
            chooseDate = input.nextInt();
        }
        chooseDateForTheOrder.add(chooseDate);
        equalDateToProductAvailable(chooseMonth, chooseDate);
    }
    public static void equalDateToProductAvailable (int chooseMonth, int chooseDate){
       for (int i = 0; i < orderedProducts.size(); i++)
        if (orderedProducts.size() > chooseMonthForTheOrder.size()){
            chooseMonthForTheOrder.add(chooseMonth);
            chooseDateForTheOrder.add(chooseDate);
        }
    }

    public static void finishTheOrder() {
        chooseMonth();
        System.out.println("Цялостна поръчка.");
        for (int i = 0; i < orderedProducts.size(); i++) {
            System.out.println(orderedProducts.get(i) + "- " + numberOfTheProductOrder.get(i) + "бр");
        }
        developStorage();
    }

    public static void searchByDate() {
        showIfThereAreProducts();
    }

    public static void showIfThereAreProducts(){

        if (orderedProducts.size() >= 1) {
            chooseDateRange();
        } else {
            System.out.println("Няма никакво налично количество.\n");
            developStorage();
        }
    }

    public static void chooseDateRange() {
        System.out.println("Моля въведете начална дата:");
        System.out.println("          Месец:           ");
        int startMonth = input.nextInt();
        System.out.println("          Дата:           ");
        int startDate = input.nextInt();

        System.out.println("Моля въведете крайна дата:");
        System.out.println("          Месец:           ");
        int endMonth = input.nextInt();
        System.out.println("          Дата:           ");
        int endDate = input.nextInt();

        compareTheDates(startMonth, startDate, endMonth,endDate);
    }
    public static void compareTheDates(int startMonth, int startDate, int endMonth, int endDate){
     for (int i = 0; i < orderedProducts.size(); i ++ ){
       if (startMonth == chooseMonthForTheOrder.get(i) &&  startDate > chooseDateForTheOrder.get(i) || endMonth == chooseMonthForTheOrder.get(i) && endDate < chooseDateForTheOrder.get(i) ){
           System.out.println("No");
       } else if (startMonth <= chooseMonthForTheOrder.get(i) && endMonth >= chooseMonthForTheOrder.get(i)){
           System.out.println(orderedProducts.get(i) + "- " +numberOfTheProductOrder.get(i) + "бр " + "- " + chooseDateForTheOrder.get(i) + "." + chooseMonthForTheOrder.get(i));
        } else {
           System.out.println("Няма количество");
       }
    }
}
    public static void exitProgram(){           // Last choise - the method to exit the program ;)
        System.exit(0);
    }
}