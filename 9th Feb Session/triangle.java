public class triangle {
    public static void getTypeOfTriangle(int x,int y,int z){
        if (x == y && y == z )
            System.out.println("Equilateral Triangle");
        else if (x == y || y == z || z == x )
            System.out.println("Isosceles Triangle");
        else
            System.out.println("Scalene Triangle");
    }



    public static boolean isprime(int n){
        if(n<1 || (n%2 == 0 && n>2)) return false;
        for(int i=3;i<(int)Math.pow(n,2)+1;i++){
            if(n%i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args){
        getTypeOfTriangle(3,4,4);
    }
}
