 


public class NormalizeAngle {

    public Integer normalizeValueUsingModulo(Integer angle){
        int x=0;
        if(angle%360>=0)
        x=angle%360;
        else
        x=angle+360;
        return x;
        
    }

    public Integer normalizeValueUsingFloorMod(Integer integer){
       return Math.floorMod(integer,360);
        
    }

    public static void main(String[] args){

    }
}
