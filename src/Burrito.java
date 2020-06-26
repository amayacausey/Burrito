import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Burrito {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        Random randomGenerator = new Random();
        double burritoAmount = 3;
        double toppings =.5;
        int topVal = 0;
        double totalCost = 0;

        ArrayList<String> burrito = new ArrayList<String>();
        burrito.add("white");
        burrito.add("brown");
        burrito.add("none");
        burrito.add("all");
        burrito.add("chicken");
        burrito.add("steak");
        burrito.add("carnidas");
        burrito.add("chorizo");
        burrito.add("sofritas");
        burrito.add("veggie meat");
        burrito.add("none");
        burrito.add("all");
        burrito.add("pinto");
        burrito.add("black");
        burrito.add("none");
        burrito.add("all");
        burrito.add("mild");
        burrito.add("medium");
        burrito.add("hot");
        burrito.add("none");
        burrito.add("all");
        burrito.add("lettuce");
        burrito.add("fajita veggies");
        burrito.add("none");
        burrito.add("all");
        burrito.add("yes");
        burrito.add("no");
        burrito.add("yes");
        burrito.add("no");
        burrito.add("yes");
        burrito.add("no");
        burrito.add("yes");
        burrito.add("no");


        burrito.set(0, "white rice");
        burrito.set(1, "brown rice");
        burrito.set(2, "no rice");
        burrito.set(3, "all rice");
        burrito.set(10, "no meat");
        burrito.set(11, "all meat");
        burrito.set(12, "pinto beans");
        burrito.set(13, "black beans");
        burrito.set(14, "no beans");
        burrito.set(15, "all beans");
        burrito.set(16, "mild salsa");
        burrito.set(17, "medium salsa");
        burrito.set(18, "hot salsa");
        burrito.set(20, "no salsa");
        burrito.set(23, "all salsa");
        burrito.set(24, "no veggies");
        burrito.set(25, "all veggies");
        burrito.set(26, "cheese");
        burrito.set(26, "no cheese");
        burrito.set(27, "guac");
        burrito.set(28, "no guac");
        burrito.set(29, "queso");
        burrito.set(30, "no queso");
        burrito.set(31, "sour cream");
        burrito.set(32, "no sour cream");

        double burritoRan = randomGenerator.nextInt(burrito.size());

        /*if (burritoRan != 2){
            totalCost=burritoAmount+toppings;
        }
        if (burritoRan != 10){
            totalCost=burritoAmount+toppings;
        }
        if (burritoRan != 14){
            totalCost=burritoAmount+toppings;
        }
        if (burritoRan != 20){
            totalCost=burritoAmount+toppings;
        }
        if (burritoRan != 23){
            totalCost=burritoAmount+toppings;
        }
        if (burritoRan != 24){
            totalCost=burritoAmount+toppings;
        }
        if (burritoRan != 28){
            totalCost=burritoAmount+toppings;
        }
        if (burritoRan != 30){
            totalCost=burritoAmount+toppings;
        }
        if (burritoRan != 32){
            totalCost=burritoAmount+toppings;
        }

      */
        String burritoTest = "";


        for (int i = 0; i < 25; i++) {

            System.out.println("\nBurrito " + (i + 1) + " ");
            for (int j = 0; j < randomGenerator.nextInt(5) + 4; j++) {
                int randomIndex = randomGenerator.nextInt(burrito.size());

                burritoTest = (burrito.get(randomIndex));
                System.out.print(burritoTest + ", ");


               if (burritoTest.contains("no")) {
                    topVal = 0;
                }
                else if (burritoTest.contains("none")) {
                    topVal=0;
                } else {
                   topVal++;
               }

        }
            System.out.println(3.0 + (.5 * topVal));
    }}}



