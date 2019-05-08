
public class Manager extends Worker{
    private int responsible_person;

    public Manager(String name, int salary, String department, int responsible_person) {
        super(name, salary, department);
        this.responsible_person = responsible_person;
    }
    
    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Responsible Person number: " + this.responsible_person);        
    }
    
    
    
}
