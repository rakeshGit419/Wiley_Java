public class Main {
    static byte byte_default;
    static short short_default;
	static int int_default ;
    static long long_default;
    static char char_default;
    static float float_default;
    static double double_default;
    static String string_default;
    static boolean bool_default;
    
    public static void main(String[] args){
        byte b = 120;
        short s = 16500;
    	int i = 65000;
        long l = (long)1e9;
        char c = 'R';
        float f = 3.14f;
        double d = 3.14461514254;
        String str = "ShowBot";
        boolean bool = true;
        
        System.out.println("byte default :- "+byte_default);
        System.out.println("short default :- "+short_default);
        System.out.println("int default :- "+int_default);
        System.out.println("long default :- "+long_default);
        System.out.println("char default :- "+char_default);
        System.out.println("float default :- "+float_default);
        System.out.println("double default :- "+double_default);
        System.out.println("String default :- "+string_default);
        System.out.println("boolean default :- "+bool_default);
        
        
        System.out.println();System.out.println();
        
        System.out.println("byte :- "+b);
        System.out.println("short :- "+s);
        System.out.println("int :- "+i);
        System.out.println("long :- "+l);
        System.out.println("char :- "+c);
        System.out.println("float :- "+f);
        System.out.println("double :- "+d);
        System.out.println("String :- "+str);
        System.out.println("boolean :- "+bool);
        
    }
}
