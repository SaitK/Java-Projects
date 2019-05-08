
public class Main {
    public static void main(String[] args) {
        int say = 0;
        int sayi = 2;
        while(say<50){
            boolean isPrime = true;
            for(int i = 2; i<sayi;i++){
                if(sayi%i == 0){
                    isPrime = false;                    
                }
            }
            
            if(isPrime){
                say++;
                if(say%10==0){
                    System.out.println();
                }
                else{
                    System.out.print(sayi + " ");
                }
            }
            sayi++;
        }
    }    
}
