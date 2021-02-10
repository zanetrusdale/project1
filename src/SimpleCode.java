import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.Scanner;

public class SimpleCode {
    public static void main(String[] args) {
        showAvailableProducts();
    } public static void test(ArrayList<String>test){
        System.out.println(test);
    }




    public static void showThePlacementOfTheProducts (){
        Scanner input = new Scanner(System.in);

        ArrayList<String> shelfUpTen = new ArrayList<String>();
        ArrayList <String> shelfFromTenToTwenty = new ArrayList<String>();

        System.out.println("Моля изберете продукт:");
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
                  //  addNewOrder();
                    break;
                case 2:
                   // developStorage();
                    break;
                default:
                    do {
                        System.out.println("Грешен избор, моля изберете пак:");
                        userChoise = input.nextByte();
                    } while (userChoise > 2 || userChoise < 1);
            }
        }
    }





    public static void addNewOrder() {  //Chosen add Order
        Scanner input = new Scanner(System.in);

        ArrayList<String> fullOrderProducts = new ArrayList<String>();
        ArrayList<Integer> orderedProductNumber = new ArrayList<Integer>();
        System.out.println("Моля изберете опцияя");
        int choise = input.nextInt();
        if (fullOrderProducts.size() > 1 && choise == 1) {
            System.out.println(fullOrderProducts);
            System.out.println("hiejvo");
        } else if (choise == 1 && fullOrderProducts.size() < 1) {
            System.out.println("Недостатъчно количество в склада.");
            addNewOrder();
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
                        addNewOrder();
                        break;
                    case 8:
                        //developStorage();
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
            addNewOrder();
        }
    }
    }