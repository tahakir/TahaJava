package Recaps;

public class K_Nested_Loop {
    public static void main(String[] args) {

//        for (int i = 0; i <4 ; i++) {
//            System.out.println();
//            for (int j = 0; j <3 ; j++) {
//                System.out.print(" IRow "+ i + " - Column " + j);
//
//            }
//        }

            int[] cols={1,2,3};
            int[] rows={1,2,3,4};

            for(int rows1 : rows){
                System.out.println();
                for(int column:cols){
                    System.out.print("Rows " + rows1 + " Columns " + column);
                }


            }



    }
}
