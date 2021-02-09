import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

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


    public static void developStorage(){           //2nd choise
        Scanner input = new Scanner(System.in);

       while (true) {
           System.out.println("Избери опция");
           System.out.println("---------------------------\n"+
                   "   1. Налични продукти \n" +
                   "   2. Менажиране на продукти \n" +
                   "   3. Изход \n" +
                   "----------------------------" );
           byte userChoise = input.nextByte();
           switch (userChoise){
               case 1:
                   showAvailableProducts();
                   break;
               case 2:
                   developProducts();
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
                    "   2. Назад \n" +
                    "----------------------------" );

                byte userChoise = input.nextByte();
                switch (userChoise){
                    case 1:
                        addNewOrder();
                        break;
                    case 2:
                        developStorage();
                        break;
                    default:
                        do {
                        System.out.println("Грешен избор, моля изберете пак:");
                        userChoise = input.nextByte();
                    } while (userChoise > 2 || userChoise < 1);
                }
        }
    }

    public static void addNewOrder(){  //Chosen add Order
        Scanner input = new Scanner(System.in);

            ArrayList<String>fullOrderProducts = new ArrayList<String>();
            ArrayList<Integer>orderedProductNumber = new ArrayList<Integer>();
            int choise = input.nextInt();
        if (fullOrderProducts.size() > 1 && choise == 1){
            System.out.println(fullOrderProducts);
        } else if (choise == 2) {
            while (true) {
                System.out.println("Моля изберете продукта, който искате да поръчате:");
                System.out.println("---------------------------\n" +
                        "   1. Кока Кола \n" +
                        "   2. Фанта \n" +
                        "   3. Закуски \n" +
                        "   4. Водка \n" +
                        "   5. Бира \n" +
                        "   6. Зайо Байо \n" +
                        "   7. Завърши Поръчката \n" +
                        "   8. Назад \n" +
                        "----------------------------");
                byte userChoise = input.nextByte();

                switch (userChoise) {
                    case 1:
                        System.out.println("Моля въведете брой:");
                        int numberOfTheProduct = input.nextInt();
                        orderedProductNumber.add(numberOfTheProduct);
                        fullOrderProducts.add("Кока Кола");
                        break;
                    case 2:
                        System.out.println("Моля въведете брой:");
                        numberOfTheProduct = input.nextInt();
                        orderedProductNumber.add(numberOfTheProduct);
                        fullOrderProducts.add("Фанта");
                        break;
                    case 3:
                        System.out.println("Моля въведете брой:");
                        numberOfTheProduct = input.nextInt();
                        orderedProductNumber.add(numberOfTheProduct);
                        fullOrderProducts.add("Закуски");
                        break;
                    case 4:
                        System.out.println("Моля въведете брой:");
                        numberOfTheProduct = input.nextInt();
                        orderedProductNumber.add(numberOfTheProduct);
                        fullOrderProducts.add("Водка");
                        break;
                    case 5:
                        System.out.println("Моля въведете брой:");
                        numberOfTheProduct = input.nextInt();
                        orderedProductNumber.add(numberOfTheProduct);
                        fullOrderProducts.add("Бира");
                        break;
                    case 6:
                        System.out.println("Моля въведете брой:");
                        numberOfTheProduct = input.nextInt();
                        orderedProductNumber.add(numberOfTheProduct);
                        fullOrderProducts.add("Зайо Байо");
                        break;
                    case 7:
                        for (int i = 0; i < fullOrderProducts.size(); i++) {
                            System.out.print(fullOrderProducts.get(i) + " - " + orderedProductNumber.get(i) + " бр" + "\n");
                        }
                        developStorage();
                        break;
                    case 8:
                        developProducts();
                        break;
                    default:
                        do {
                            System.out.println("Грешен избор, моля изберете пак:");
                            userChoise = input.nextByte();
                        } while (userChoise > 8 || userChoise < 1);
                }
            }
        } else {
            System.out.println("Error, could you try again");
        }
    }

    public static void exitProgram(){           // Last choise - the method to exit the program ;)
        System.exit(0);
    }


}