package pruebas;


public class Main {
    
    
    
    public static void main(String[] args) throws Exception {
       
        BallAndHats solution = new BallAndHats();
        String hats = "o..";
        int numSwaps = 101;

        int rspt = 1;
        
        int r= solution.getHat(hats,numSwaps);
        
        System.out.println("RSPT: "+rspt +"  "+ hats+"("+numSwaps+")" );
        System.out.println("PRUEBA: "+r);
        
        
    }
}
