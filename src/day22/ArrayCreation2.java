package day22;

public class ArrayCreation2 {
    public static void main(String[] args) {
        
        //creating an array in second way
        
        int[] ages = new int[] {3,5,11,33,44,55,66,98};
        
        int itemCount=ages.length;
        System.out.println("itemCount = " + itemCount);

        for (int x = 0; x <itemCount ; x++) {
            System.out.println(ages[x]);
        }

        System.out.println(" = = = = = = = = = = ");

int[]areaCodes={703,404,770,997};
        for (int x = 0; x <areaCodes.length ; x++) {
            System.out.print(areaCodes[x] + " ");
        }

    }
}
