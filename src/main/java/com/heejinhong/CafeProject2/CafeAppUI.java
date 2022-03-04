package com.heejinhong.CafeProject2;

import com.heejinhong.CafeProject2.Product;
import com.heejinhong.CafeProject2.Cappuccino;
import com.heejinhong.CafeProject2.Coffee;
import com.heejinhong.CafeProject2.Espresso;

import java.util.Scanner;

public class CafeAppUI {

    static void startCafeApp() {
        double subtotal = 0;
        Product coffee = new Coffee("Coffee", 2.99, "Pour Over style coffee made from Light Roast Coffee Beans from Hawaii.", false, false);

        Product espresso = new Espresso("Espresso", 3.99, "The simplest drink to prepare, an espresso is a single shot of coffee, usually served in a small demitasse cup.", false, false);

        Product cappuccino = new Cappuccino("Cappuccino", 4.99, "A single shot of espresso, topped up with steamed milk, served in a cup 150ml-200ml in size, and topped with a dusting of chocolate powder", false, false);

        Scanner input = new Scanner(System.in);
        try{
            coffeeOrderPrintStatement();
            String coffeeName = stringFirstLetterUpperCase(input.next());
            if(coffeeName.equals(coffee.getName())){
                productQuantityInput(coffee, input);
                subtotal = coffee.calculateProductTotal();
                System.out.println("Subtotal is " + subtotal);
            }
            else if(coffeeName.equals(espresso.getName())){
                productQuantityInput(espresso, input);
                subtotal = espresso.calculateProductTotal();
                System.out.println("Subtotal is " + subtotal);
            }
            else if(coffeeName.equals(cappuccino.getName())){
                productQuantityInput(cappuccino, input);
                subtotal = cappuccino.calculateProductTotal();
                System.out.println("Subtotal is " + subtotal);
            }
        }
        catch (Exception e){
            System.out.println("Needed to enter a STRING value!");
        }
        System.out.printf("%-20s: $ %.2f\n", "Subtotal", subtotal);
        System.out.printf("%-20s: $ %.2f\n", "Total Sales Tax", subtotal*0.08);
        System.out.printf("%-20s: $ %.2f\n", "Total", subtotal*1.08);
        System.out.println("Thank you and have a good day!");
    }


    private static String stringFirstLetterUpperCase(String name) {
        return name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
    }

    private static void coffeeOrderPrintStatement() {
        System.out.println("CafeApp Starting... please wait a moment\n");
        System.out.println("Welcome to CafeApp What would you like to order?\n");
        System.out.println("MENU:");
        System.out.println("Coffee:     2.99");
        System.out.println("Espresso:   3.99");
        System.out.println("Cappuccino: 4.99\n");
        System.out.println("Please enter the name of your drink and the quantity of your product.");
    }

    private static void productQuantityInput(Product coffeeType, Scanner input) {
        try{
            System.out.println("How many " + coffeeType.getName() + " would you like?");
            coffeeType.setQuantity(input.nextInt());
            if(coffeeType.getName().equals("Coffee")){
                System.out.println("Would you like milk? Please enter yes or no.");
                if(stringFirstLetterUpperCase(input.next()).equals("Yes")){
                    ((Coffee)coffeeType).setMilk(true);
                }
                System.out.println("Would you like sugar? Please enter yes or no.");
                if(stringFirstLetterUpperCase(input.next()).equals("Yes")){
                    ((Coffee)coffeeType).setSugar(true);
                }
            }
            else if(coffeeType.getName().equals("Espresso")){
                System.out.println("Would you like extra shot? Please enter yes or no.");
                if(stringFirstLetterUpperCase(input.next()).equals("Yes")){
                    ((Espresso)coffeeType).setExtraShot(true);
                }
                System.out.println("Would you like macchiato? Please enter yes or no.");
                if(stringFirstLetterUpperCase(input.next()).equals("Yes")){
                    ((Espresso)coffeeType).setMacchiato(true);
                }
            }
            else if(coffeeType.getName().equals("Cappuccino")){
                System.out.println("Would you like peppermint? Please enter yes or no.");
                if(stringFirstLetterUpperCase(input.next()).equals("Yes")){
                    ((Cappuccino)coffeeType).setPeppermint(true);
                }
                System.out.println("Would you like whipped Cream? Please enter yes or no.");
                if(stringFirstLetterUpperCase(input.next()).equals("Yes")){
                    ((Cappuccino)coffeeType).setWhippedCream(true);
                }
            }
        }catch(Exception e){
            System.out.println("Needed to enter an INTEGER value for the quantity of " + coffeeType.getName());
        }
    }

}
