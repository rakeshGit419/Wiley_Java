public class ReverseString {
    public static void main(String[] args) {
        String str = "India Is My Country";
        String[] strArr = str.split(" ");
        for(int i=strArr.length-1;i>=0;i--){
            System.out.print(reverse(strArr[i])+" ");
        }
    }

    private static String reverse(String string) {
        String res = "";
        for(int i=string.length()-1;i>=0;i--){
            res+=string.charAt(i);
        }
        return res;
    }
}
