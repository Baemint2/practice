package defaultInterface.composite;

public class CompositeClass {
    private AbstractCompositeClass abstractCompositeClass;

        public CompositeClass(AbstractCompositeClass abstractCompositeClass) {
            this.abstractCompositeClass = abstractCompositeClass;
    }
    void Action() {
        abstractCompositeClass.doSomething();
    }
}
