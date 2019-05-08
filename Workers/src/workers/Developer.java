
package workers;

public class Developer extends Workers {
    private String languages;

    public Developer(String name, String surname, int id, String languages) {
        super(name, surname, id);
        this.languages = languages;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }
    

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Languages: " + getLanguages());
        System.out.println("**************************");
    }
    
    public void format(String OS){
        System.out.println("Operation System is changing to " + OS);
    }



    
    
    
    

    
    
    
    
    
    
}
