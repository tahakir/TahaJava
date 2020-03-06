package Inheritance;

class TestBase {


    static String chromeDriver = "Chrome";

    public static void TakeScreenShot() {
        System.out.println("Took screenShot");
    }

    private static void closeBrowser() {
        System.out.println("Browser closed");
    }

}


public class Inheritance extends TestBase {

    public static void main(String[] args) {

        System.out.println(chromeDriver);

        TakeScreenShot();

    }

}
