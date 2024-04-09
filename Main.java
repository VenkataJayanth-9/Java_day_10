import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Smart Kitchens...");

        System.out.println("On/Off");
        String on = scanner.nextLine().toLowerCase();
        String task;

        if(on.equals("on")) {
            System.out.println("Enter smart thing Refrigerator/DishWasher/CoffeeMaker");
            String select = scanner.nextLine().toLowerCase();

            if (select.equals("refrigerator")) {
                System.out.println("Enter task temperature / mode");
                task = scanner.nextLine();
                if (task.equals("temperature")) {
                    Refrigerater refrigerater = new Refrigerater(true, true);
                    System.out.print("Enter temperature: ");
                    float temp = scanner.nextFloat();
                    refrigerater.setSetTemperature(temp);
                } else if (task.equals("mode")) {
                    System.out.println("Enter the mode : Normal, Extra Shopping, Vacation, Seasonal, and Home Alone Mode.");
                    String mode = scanner.nextLine();
                    Refrigerater refrigerater = new Refrigerater(true, true);
                    refrigerater.setSetMode(mode);
                }else {
                    System.out.println("Invalid Input");
                }
            } else if (select.equals("dishwasher")) {
                System.out.println("Enter task dishwash / washkitchen");
                task = scanner.nextLine();
                if (task.equals("dishwash")) {
                    DishWasher dishWasher = new DishWasher(true, true);
                    dishWasher.leadDishwasher(true);
                } else if (task.equals("washkitchen")) {
                    DishWasher dishWasher = new DishWasher(true, true);
                    dishWasher.doKitchenWork(true);
                }
                else {
                    System.out.println("Invalid Input");
                }
            } else if (select.equals("coffeemaker")) {
                System.out.println("Enter task addwater/addmilk");
                task = scanner.nextLine();
                if(task.equals("addwater")){
                    coffeeMaker coffeemaker = new coffeeMaker(true, true);
                    coffeemaker.addWater(true);
                } else if (task.equals("addmilk")) {
                    coffeeMaker coffeemaker = new coffeeMaker(true, true);
                    coffeemaker.addMilk(true);
                }
                else {
                    System.out.println("Invalid Input");
                }
            }
            } else if (on.equals("off")) {
            System.out.println("SmartKitchens is off");
        } else {
            System.out.println("Invalid Input");
        }
    }
}