public class GenericClass{
    public <T> void GenericOperation(int n,T param){
        try{
            Double num2 = Double.parseDouble((String) param);
            System.out.println(n*num2);
        }catch(Exception e){
            if(((String) param).equals("true") || ((String) param).equals("false"))
                System.out.println("false");
            else System.out.println("Cannot perfrom multiplication on strings");
        }
    }
    public static void main(String[] args) {
        GenericClass g = new GenericClass();
        g.<String>GenericOperation(2, "rakesh");
    }
}











































// public class GenericFunctionExample {
//     static <T> T genericFunction(Integer n, T param) {
//         if (param instanceof Integer || param instanceof Double) {
//             Integer res = n * Integer.parseInt(String.valueOf(param));
//             return (T) res;
//         } else if (param instanceof String) {
//             return (T) "Can't perform multiplication";
//         } else if (param instanceof Boolean)
//             return (T) (Object) false;
//         else
//             return (T) "No output";

//     }

//     public static void main(String[] args) {
//         System.out.println(genericFunction(44, 33));
//     }
// }
