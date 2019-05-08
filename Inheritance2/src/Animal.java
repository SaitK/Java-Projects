
public class Animal {
    
    private String name;
    private int weight;
    private double height;
    private int leg;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }
    
    
    

    public Animal(String name, int weight, double height, int leg) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.leg = leg;
    }
    
    public void eat(){
        
        System.out.println("Animal is eating...");
    }
    public void move(int speed){
        
        System.out.println("Animal is moving, speed: " + speed);
    }
    
    
    
}
