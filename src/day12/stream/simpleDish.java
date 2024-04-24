package day12.stream;

public class simpleDish {

    private final String name;
    private final int calories;

    public simpleDish(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    public simpleDish(Dish dish) {
        this.name = dish.getName();
        this.calories = dish.getCalories();
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return "simpleDish{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                '}';
    }
}
