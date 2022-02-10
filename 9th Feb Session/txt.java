public class txt {
    public static void main(String[] args){
        for(int i=1;i<=3;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int k=(2*3);k>=1;k--){
                System.out.print("  ");
            }
            for(int l=1;l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
