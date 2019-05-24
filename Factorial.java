import java.math.BigInteger;

public class Factorial {

    public BigInteger factorialOf(Integer value){
      
        BigInteger f=new BigInteger("1");
         
        for(int i=1;i<=value;i++){
            f=f.multiply(BigInteger.valueOf(i)); 
        }
          System.out.println("The Factorial of "+f);
        return f;
    }
    
   
}
