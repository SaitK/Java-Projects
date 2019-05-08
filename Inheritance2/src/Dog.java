
public class Dog extends Animal{
    
    private int tooth_no;
    
    
    public Dog(String name, int weight, double height, int leg, int tooth_no) {
        super(name, weight, height, leg);
        this.tooth_no = tooth_no;
    }

    public int getTooth_no() {
        return tooth_no;
    }

    public void setTooth_no(int tooth_no) {
        this.tooth_no = tooth_no;
    }
    
    public void run(int speed){
        System.out.println("Dog is running");
        super.move(32);
    }
    
    
    
    
    
    
    
}
