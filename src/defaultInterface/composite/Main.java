package defaultInterface.composite;

public class Main {
    public static void main(String[] args) {
        AbstractCompositeClass abstractCompositeClass = new ConcreteClass();
        CompositeClass compositeClass = new CompositeClass(abstractCompositeClass);
        compositeClass.Action();
    }

}
