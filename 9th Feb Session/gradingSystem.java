public class gradingSystem {
    public static String getGrade(int total){
        if(total >= 275) return "Grade-A";
        if(total >= 245) return "Grade-B";
        if(total >= 100) return "Grade-C";
        return "Grade-D";
    }

    public static void main(String[] args){
        int phy=78,chem=90,maths=100;
        int total = phy+chem+maths;
        System.out.println("total "+total);
        System.out.print(getGrade(total));
    }
}
