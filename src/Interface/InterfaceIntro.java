package Interface;

public interface InterfaceIntro {

    public abstract void methodA();

}

interface Data{


}

class Test implements InterfaceIntro,Data{
//  subtype             supertype,  supertype

    @Override
    public void methodA() {

    }
}

