package workers;

public class Manager extends Workers{
    private int teamMemberNo;

    public Manager(String name, String surname, int id, int teamMemberNo) {
        super(name, surname, id);
        this.teamMemberNo = teamMemberNo;
    }

    public int getTeamMemberNo() {
        return teamMemberNo;
    }

    public void setTeamMemberNo(int teamMemberNo) {
        this.teamMemberNo = teamMemberNo;
    }
    
    

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Members Number: " + getTeamMemberNo());
    }
    
    public void raiseSalary(int raise){
        System.out.println("Salaries are raising " + raise + " Pound");
                
    }
    
    
    
    
    
    
    
}
