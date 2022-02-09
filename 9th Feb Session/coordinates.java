public class coordinates {
    public static int getCoordinate(int x,int y){
        if(x>0)
            if(y>0) return 1;
            else return 4;
        else
            if(y>0) return 2;
            else return 3;
    }
    public static void main(String[] args){
        int x=3,y=-3;
        System.out.println(getCoordinate(x,y));
    }
}
