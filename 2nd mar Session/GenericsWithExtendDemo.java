import java.lang.Math;
class NumberClass<T extends Number> {
    T num;

    public NumberClass(T num) {
        this.num = num;
    }

    double square() {
        return num.intValue() * num.intValue();
    }

    boolean absEquals(NumberClass<T> obj){

        return Math.abs(obj.num.intValue()) == Math.abs(this.num.intValue());
    }
}

public class GenericsWithExtendDemo {
    public static void main(String[] args) {
        NumberClass<Integer> obj = new NumberClass<>(3);
        System.out.println(obj.square());
        NumberClass<Double> obj1 = new NumberClass<>(-3.4);
        System.out.println(obj1.absEquals(obj1));
    }
}
