public class sumUp {
    public static void main(String[] args){
        int s = 0;
        for(int i=0;i<10;i++){
            s+=i+1;
            System.out.println(s);
        }
        int sum=0,j=1;
        while(sum<100){
            sum+=j;
            j++;
        }
        System.out.println("sum greater then 100: "+sum+"\nnumAtSum "+j);

    


    }
}
