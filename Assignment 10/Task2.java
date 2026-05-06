// Abstract class Food
abstract class Food {
    public abstract void prepare();
}

// Pizza class extending Food
class Pizza extends Food {
    public void prepare() {
        System.out.println("Preparing Pizza: Knead dough, add sauce, cheese, and toppings, then bake.");
    }
}

// Burger class extending Food
class Burger extends Food {
    public void prepare() {
        System.out.println("Preparing Burger: Grill patty, toast buns, add lettuce, tomato, and sauces.");
    }
}

// Main class to test
public class Task2{
    public static void main(String[] args) {
        Food pizza = new Pizza();
        pizza.prepare();

        Food burger = new Burger();
        burger.prepare();
    }
}

