package Interface;

import java.net.PortUnreachableException;

interface B{
    void method3();
}

public interface extends_VS_implements extends B {
    //                  SUBTYPE               SUPERTYPE

    void method1();
    void method2();

}

class A implements extends_VS_implements{

    @Override
    public void method1(){

    }

    @Override
    public void method2() {

    }


    @Override
    public void method3() {

    }


}

class C extends A implements extends_VS_implements{

}