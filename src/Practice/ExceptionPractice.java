package Practice;

public class ExceptionPractice {

    //EXCEPTION HANDLINGS
    //1)TRY AND CATCH
    //try{
//}catch(Exceptionclass name){
    //}


    public static void main(String[] args)  {

        String str="Batch15";
        try {
            char ch1=str.charAt(10);
            System.out.println(ch1);
        }catch (StringIndexOutOfBoundsException x){
            System.out.println("String Index Out Of Bounds Exception");

        }
        try {
            Thread.sleep(3000);
            System.out.println("Test completed");
            System.out.println("Try");

        }catch (Exception z){
            System.out.println("Catch");
        }




    }
}
