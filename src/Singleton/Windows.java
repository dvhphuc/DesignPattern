package Singleton;

public class Windows {
    Integer size;
    String color;
    String brand;

    private static Windows instance;

    private Windows() {
        this.size = 10;
        this.color = "white";
        this.brand = "Microsoft";
    }

    public static Windows getInstance() {
        if (instance == null) {
            instance = new Windows();
        }
        return instance;
    }

    @Override
    public String toString() {
        return String.format("Size: %d, Color: %s, Brand: %s", size, color, brand);
    }
}
