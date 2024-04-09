public class SmartKitchen extends SmartThings {
    private Refrigerater refrigerater;
    private DishWasher dishwasher;
    private coffeeMaker coffeemaker;

    SmartKitchen(boolean smartOn, Refrigerater refrigerater, DishWasher dishwasher, coffeeMaker coffeemaker){
        super(smartOn);
        this.refrigerater = refrigerater;
        this.dishwasher = dishwasher;
        this.coffeemaker = coffeemaker;
    }
}
