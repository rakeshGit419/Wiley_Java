class Cal{  
    private int sum;

    Cal(){
        sum = 0;
    }

    void add(int a,int b){
        sum = a+b;
    }  

    void add(int a,int b,int c){
        sum = a+b+c;
    }  

    // more than 3 operands
    void add(int... arr){
        sum = 0;
        for(int i:arr)
            sum += i;      
    }

    void getSum(){
        System.out.println(sum);
    }
}  
public class MethodOverloading{  
    public static void main(String[] args){  
        Cal operation = new Cal();
        operation.add(4,5);
        operation.getSum();

        operation.add(1,2,9);
        operation.getSum();

        operation.add(1,2,3,4,5);
        operation.getSum();
    }
}  