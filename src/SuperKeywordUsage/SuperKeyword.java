package SuperKeywordUsage;


class A {

    String name = "Zorro";

    public void method2() {

    }

    public A(int a) {

    }
}

public class SuperKeyword extends A {

    public SuperKeyword(int a) {
        super(a);
    }


    public void method() {
        super.name = "Don Alejandro";
        this.name = "De la Vega";
        super.method2();
        this.method2();
    }


}
