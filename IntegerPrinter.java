 


public class IntegerPrinter {

    public static String printIntegerAsBinary(int value){
       int binary[]=new int[100];
      int i=0;
      String x="";
        while(value>0){
        binary[i]=value%2;
        value=value/2;
        i++;
        }
        for(int j=i-1;j>=0;j--){
            x=x+binary[j];
     
        }
         return x;
    }

    public String printIntegerAsOctal(int value){
        int octal[]=new int[100];
        int i=0;
        String x="";
        while(value>0){
        octal[i]=value%8;
        value=value/8;
        i++;
        }
        for(int j=i-1;j>=0;j--){
            x=x+octal[j];
        }
        return x;
    }

    public static String printIntegerAsHexadecimal(int value){
      String x="";
         char hex[]={'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
     int i=0;
     while(value>0)
     {
       i=value%16; 
       x=hex[i]+x; 
       value=value/16;
     }
        System.out.println(x);
        return x;
        
    }

    public static void main(String[] args){
    System.out.println(printIntegerAsBinary(500));
    System.out.println(printIntegerAsHexadecimal(500));
    }
}
