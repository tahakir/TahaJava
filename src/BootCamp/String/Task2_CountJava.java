package BootCamp.String;

public class Task2_CountJava {
    public static void main(String[] args) {
//1
        String str = "java is fun. java is the best";
        int java1=0;

        for (int i = 0; i <str.length()-3 ; i++) {

            if (str.substring(i,i+4).equalsIgnoreCase("java")){
                java1++;
            }
        }
        System.out.println("java1 : "+java1);

//2

        int java2=0;
        while (str.contains("java")){
            java2++;

            str=str.replaceFirst("java","");
        }
        System.out.println("java2 : "+java2);


    }
}
