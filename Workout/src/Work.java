
public class Work {
    
    private int burpee;
    private int squat;
    private int push_up;
    private int lunge;
    
    
        public Work(int burpee, int squat, int push_up, int lunge) {
        this.burpee = burpee;
        this.squat = squat;
        this.push_up = push_up;
        this.lunge = lunge;
    }
    
    
    

    public int getBurpee() {
        return burpee;
    }

    public void setBurpee(int burpee) {
        this.burpee = burpee;
    }

    public int getSquat() {
        return squat;
    }

    public void setSquat(int squat) {
        this.squat = squat;
    }

    public int getPush_up() {
        return push_up;
    }

    public void setPush_up(int push_up) {
        this.push_up = push_up;
    }

    public int getLunge() {
        return lunge;
    }

    public void setLunge(int lunge) {
        this.lunge = lunge;
    }
    
    
    public void dowork(String move, int number){
        if(move.equals("burpee")){
            doBurpee(number);            
        }
        else if(move.equals("squat")){
            doSquat(number);
        }
        else if(move.equals("push_up")){
            doPush_up(number);
        }
        else if(move.equals("lunge")){
            doLunge(number);
        }
        else
            System.out.println("İnvalid Choose...");
        
    }
    public void doBurpee(int number){
        if(burpee == 0){
            System.out.println("Set is over... 15 sec rest...");
        }
        if(burpee < 0){
            System.out.println("Extra ha, Keep going...");
            burpee = 0;
        }
        else{
            burpee -= number;
            System.out.println("Keep doing man, " + burpee + " left...");
        }
    }
        
    public void doSquat(int number){
        if(squat == 0){
            System.out.println("Set is over... 15 sec rest...");
        }
        if(squat < 0){
            System.out.println("Extra ha, Keep going...");
            squat = 0;
        }
        else{
            squat -= number;
            System.out.println("Keep doing man, " + squat + " left...");
            }
    }
        
    public void doPush_up(int number){
        if(push_up == 0){
            System.out.println("Set is over... 15 sec rest...");
        }
        if(push_up < 0){
            System.out.println("Extra ha, Keep going...");
            push_up = 0;
        }
        else{
            push_up -= number;
            System.out.println("Keep doing man, " + push_up + " left...");
            }
    }
        
    public void doLunge(int number){
        if(lunge == 0){
            System.out.println("Set is over... 15 sec rest...");
        }
        if(lunge < 0){
            System.out.println("Extra ha, Keep going...");
            lunge = 0;
        }
        else{
            lunge -= number;
            System.out.println("Keep doing man, " + lunge + " left...");
            }
    }
    
    public boolean finish(){
        return (burpee == 0) && (squat == 0) && (push_up == 0) && (lunge == 0);
    }
    
}
