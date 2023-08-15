public class House {
    private String name;
    private String location;
    private double price;
    private String description;
    // Add other details here

    public House(String name, String location, double price, String description) {
        this.name = name;
        this.location = location;
        this.price = price;
        this.description = description;
        // Initialize other details here
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
    // Add other getters and setters here
}
