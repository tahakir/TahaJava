package day06;

public class CompoundOperator {

    public static void main(String[] args) {

        //Assignment Operator= ---->Will save the result of whatever
        // the operation on the right side and
        // the assigned the result to the left side variable;

        int studentOnline=263;
        studentOnline=studentOnline+5;

        System.out.println("5 people joined teh class" + studentOnline);

        studentOnline=studentOnline-3;
        System.out.println("3 people left the class " + studentOnline);

        studentOnline=studentOnline*2;
        System.out.println("The student online count doubled " + studentOnline);

        studentOnline=studentOnline/3;
        System.out.println("The student count has dropped to 1/3: " + studentOnline);




    }
}
