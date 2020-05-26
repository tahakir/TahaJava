package AAA_LastReview;

public class PrimitivesCasting {
    /*
    casting: converting larger primitive to smaller size
    datatype variablename=(datatype)
    casting: Explicit&implicit
    primitives: byte,short,int,long,float,double
     */

    public static void main(String[] args) {
        int a=10;
        byte b=(byte)a; //explicit casting
        System.out.println(b);

        double DecimalNumber=10.5;
        float FloatNumber=(float) DecimalNumber;
        System.out.println(FloatNumber);

        double DecimalNumber2=10.5;
        float FloatNumber2=(int) DecimalNumber;//double>float
        System.out.println(FloatNumber2);

        long LongNum=300L;
        int IntNum=(short)LongNum;
        System.out.println(IntNum);

        //implicit casting: small size data to larger size of data...
        byte ByteNum=100;
        int IntNum2=ByteNum;
        System.out.println(IntNum2);


        short ShortNum=100;
        long LongNum2=ShortNum;


        
    }

}
