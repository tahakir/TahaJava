package SuperKeywordUsage;

class parent{

    public parent(int a){
        System.out.println("A");
    }
}

public class Practice extends parent {

    public Practice(){
        super(10);
        System.out.println("B");
    }

    public static void main(String[] args) {
        Practice obj= new Practice();

    }
}
