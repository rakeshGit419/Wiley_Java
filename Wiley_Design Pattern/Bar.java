public class Bar {
    private String name;
    private int age;
    private Foo foo;
    public Bar() {
    }
    public Bar(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void processFooName() {
        System.out.println(foo.getName());
    }
    public void setFoo(Foo foo) {
        this.foo = foo;
    }
    @Override
    public String toString() {
        return "Bar [age=" + age  + ", name=" + name + "]";
    }
    public static void main(String[] args) {
        Foo foo = new Foo("Foo Test");
        Bar bar = new Bar("Rakesh",21);
        bar.setFoo(foo);
        bar.processFooName();
        System.out.println(bar);
    }
}
