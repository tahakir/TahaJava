package Practice;

public class ExceptionThrowsKeyword {
    public static void main(String[] args) throws Exception {

        System.out.println("Step 1");
        Thread.sleep(1000);


        System.out.println("Step 3");

        System.out.println("Step 4");

        Thread.sleep(2000);

        System.out.println("Step 5");

    }

    public static void method1() throws Exception {
        main(new String[]{"A"});

    }

    public static void method2() throws Exception {
        method1();
    }

    public static void method3() throws Exception {
        method2();
    }
}
