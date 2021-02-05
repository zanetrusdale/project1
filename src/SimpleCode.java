import java.util.ArrayList;
import java.util.Scanner;

public class SimpleCode {
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
}

