package defaultInterface.exam02;

public class ObjectBoxMain {
    public static void main(String[] args) {
        ObjectBox box = new ObjectBox();
        box.setObject("kim");
        String str = (String)box.getObject();
        System.out.println(str.toUpperCase());

        box.setObject(new Integer(5));
        Integer i = (Integer) box.getObject();
        System.out.println(i.intValue());
    }
}
