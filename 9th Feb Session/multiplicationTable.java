public class multiplicationTable {
    public static void getTable(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n+" X "+i+" = "+(n*i));
        }
    }

    public static void main(String[] args){
        int n = 5;
        getTable(5);
    }
}
