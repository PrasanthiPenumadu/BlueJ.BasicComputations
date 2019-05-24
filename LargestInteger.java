import java.util.Scanner; 
import java.lang.Math;

public class LargestInteger {

    public Integer findLargestNumberUsingConditional(Integer[] integers){
        Scanner ui =new Scanner(System.in);
        System.out.println("Enter 3 Numbers to find the largest");
        int x=0,y=0,z=0;
        x=ui.nextInt();
        y= ui.nextInt();
        z=ui.nextInt();
        int max1=0;
        if(x>y&&x>z){
        //System.out.println("Largest Integer is "+x);
        max1=x;
        }
        else if(y>x&&y>z){
           // System.out.println("Largest Integer is "+y);
        max1=y;
        }
        else{
            //System.out.println("Largest Integer is "+z);
        max1=z;
        }
        System.out.println("Largest Integer is "+max1);
        return max1;
        
    }

    public Integer findLargestNumberUsingMathMax(Integer[] integers){
        System.out.println("Enter 3 Numbers to find the largest");
         Scanner ui =new Scanner(System.in);
        int x,y,z;
        x=ui.nextInt();
        y= ui.nextInt();
        z=ui.nextInt();
        int max1=Math.max(x,z);
        int max2=Math.max(y,max1);
        System.out.println("The largest number is "+max2);
        return max2;
    }

}
