// Code for Beginning Java's Cake & Cupcake Shop Tutorial

import java.util.Scanner;  // Needed for the Scanner class to read input

public class custom_order {

    // STEP 1 PRINTING HELLO WORLD TO CONSOLE
    public static void main(String[] args) {

      System.out.println("Hello World!"); // print Hello World to console


    // STEP 2 CREATE A SCANNER OBEJCT, DECLARE VARAIBLES, & PRINT STATEMENTS
Scanner keyboard = new Scanner (System.in);
String FirstName; //User's first name
String ItemOrder; //Item ordered
String FrostingType; // Frosting ordered
String FillingType; //Filling ordered
String Toppings; // toppings ordered
String input; // User input
Double cost = 15.00; //cost of cake and cupcakes
final double TAX_RATE= .08; //Sales tax rate
double tax; //amount of tax


    // Introduce shop and prompt user to input first name
System.out.println("Welcome to java's Cake and Cupcake shop!");
System.out.println("We make custom cakes with out secret cake  batter");



    // TEST CODE

    // STEP 3 INPUT YOUR NAME AND PREPARE TO VIEW MENU
System.out.print("What is your first name?");
FirstName = keyboard.nextLine();
System.out.print( FirstName + ", please see our menu below:");
System.out.print("\n");// skips a line


    // TEST CODE

    // STEP 4 DISPLAY MENU
    System.out.println("_______________________________________________");
    System.out.println("     Menu     Quantity     Base Cost");
    System.out.println("_______________________________________________");
    System.out.println("     Cake                  1           $15");
    System.out.println(" Set of Cupcakes  6             $15       ");
    System.out.println("Frostings (vanilla, Chocolate, Strawberry, Coco)");
    System.out.println(" Fillings(Mocha, Mint, Lemon, Caramel, Vanilla)");
    System.out.println("Toppings ( Sprinkles, Cinnamon, Cocoa, Nuts)");
    System.out.println("_______________________________________________");




    // TEST CODE

    // STEP 5 PROMPT USER TO ORDER
    System.out.println("Do you want a cake or Cupcakes");
    ItemOrder = keyboard.nextLine();






    // TEST CODE

    // STEP 6 PROMPT USER TO CHOOSE FROSTING
    System.out.println("what kind of Frosting do you want?");
    System.out.println("Vanilla, Chocolate, Strawberry or Coco");
    FrostingType = keyboard.nextLine();









    //TEST CODE

    // STEP 7 PROMPT USER TO CHOOSE FILLING
    System.out.println("what kind of Filling do you want?");
    System.out.println("Mocha, Mint, Lemon, Caramel or Raspberry");
    FillingType = keyboard.nextLine();




    // TEST CODE

    // STEP 8 PROMPT USER TO CHOOSE TOPPINGS
    System.out.println("what kind of Toppings do you want?");
    System.out.println("Sprinkles, Cinnamon, Cocoa or Nuts");
    Toppings = keyboard.nextLine();




    // TEST CODE

    // STEP 9 DISPLAY ORDER CONFIRMATION
System.out.println();
System.out.println(FirstName + ", Your order is as follows:");
System.out.println("______________________________________");
System.out.println("Item Ordered: " + ItemOrder);
System.out.println("Frosting:" + FrostingType);
System.out.println("Filling:" + FillingType);
System.out.println("Toppings:" + Toppings);
System.out.println("______________________________________");







    // TEST CODE

    // STEP 10 DISPLAY COST AND SALES TAX
System.out.printf("The cost of your order is: $%.2f/n" , cost);
tax = cost* TAX_RATE;
System.out.printf("The tax is: $%.2f\n" , (tax + cost));
System.out.printf("The total due is: $%.2f/n", (tax + cost));
    
    git add custom_order.java
git commit -m"add cupcake shop"
git push origin master
    }

}
