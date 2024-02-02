package think;

public class Human {
    public static void main(String[] args) {

        Person person = new Person("John", 20);

        String name = person.getName();
        int age = person.getAge();
        System.out.println("Name : " +name + " age : " + age);
    }

}
