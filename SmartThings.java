public class SmartThings {
    private boolean smartOn;
    public SmartThings(boolean smartOn) {
        this.smartOn = smartOn;
    }
}

class Refrigerater extends SmartThings{
    private boolean hasToDo;

    public Refrigerater(boolean smartOn,boolean hasToDo){
        super(smartOn);
        this.hasToDo = hasToDo;
        System.out.println("Refrigerater is switched on");
    }
    public void setSetTemperature(float temp){
        System.out.println("At present the temperature in refigerator is : "+temp);
    }
    public void setSetMode(String mode){
        System.out.println("At present the refrigerator is in "+mode+ "mode");
    }
}

class DishWasher extends SmartThings{
    private boolean hasToDo;
    public DishWasher(boolean smartOn, boolean hasToDo){
        super(smartOn);
        this.hasToDo = hasToDo;
        System.out.println("DishWasher is switched on");
    }

    public void leadDishwasher(boolean load){
        System.out.println("Dish washer is loaded and your dishes will be cleaned in just 20min...");
    }
    public void doKitchenWork(boolean load){
        System.out.println("Started to clean your kitchen this could take 30 minutes to complete so you can take a walk outside...");
    }
}

class coffeeMaker extends SmartThings{
    private boolean hasToDo;
    public coffeeMaker(boolean smartOn, boolean hasToDo){
        super(smartOn);
        this.hasToDo = hasToDo;
        System.out.println("Coffee Maker is switched on");
    }

    public void addWater(boolean hasToDo){
        System.out.println("Added water to the machine");
    }
    public void addMilk(boolean hasToDo){
        System.out.println("Adding milk to the machine");
    }
}
