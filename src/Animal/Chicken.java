package Animal;

import Edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: oooo-o-oooo";
    }

    @Override
    public String howtoEat() {
        return "could be fried";
    }
}
