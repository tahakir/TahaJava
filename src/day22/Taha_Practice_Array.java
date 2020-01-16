package day22;

public class Taha_Practice_Array {
    public static void main(String[] args) {

        //Create an array with double, char, string and print them out

        //Double
        System.out.println("DOUBLE");

        double[] prices=new double[4];
        prices[0]=2.99;
        prices[1]=6.76;
        prices[2]=300;
        prices[3]=3321;

        System.out.println(prices[0]+","+prices[1]+","+prices[2]+","+prices[3]);

        System.out.println("CHAR");

        char[] name=new char[4];
        name[0]='T';
        name[1]='A';
        name[2]='H';
        name[3]='A';

        System.out.println(name[0]+","+name[1]+","+name[2]+","+name[3]);

        System.out.println("STRING");

        String[] beverages=new String[4];
        beverages[0]="Coke";
        beverages[1]="Fanta";
        beverages[2]="Tea";
        beverages[3]="Coffee";

        System.out.println(beverages[0]+" "+beverages[1]+" "+beverages[2]+" "+beverages[3]);
        // create an byte array with size 4
        // and store it into a variable called data

        // assign value for each index location
        // print out the values at each index

        // update last index value
        // then print it out


        byte[] data=new byte[4];

        data[0]=122;
        data[1]=126;
        data[2]=32;
        data[3]=31;

        System.out.println(data[0]);
        System.out.println(data[1]);
        System.out.println(data[2]);
        System.out.println(data[3]);

        data[3]=69;
        System.out.println("Updated value of 3 " + data[3]);

        //create an String array with size you define
        // and store all your household member names

        String[] house=new String[6];
        house[0]="Mehmet";
        house[1]="Ilkay";
        house[2]="Kaan";
        house[3]="Taha";
        house[4]="Kubra";
        house[5]="Ados";

        System.out.println(house[0]);
        System.out.println(house[1]);
        System.out.println(house[2]);
        System.out.println(house[3]);
        System.out.println(house[4]);
        System.out.println(house[5]);


        //creating an array in second way

        int[] ages = new int[] {3,5,11,33,44,55,66,98};

        int itemCount=ages.length;
        System.out.println("itemCount = " + itemCount);

        for (int x = 0; x <itemCount ; x++) {
            System.out.println(ages[x]);
        }



    }

}
