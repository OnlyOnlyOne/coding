package 复习.java基础.invoke;

public class TargetObject {
    private String value;

    public TargetObject() {
        value = "Hwy";
    }

    public void publicMethod(String string) {
        System.out.println("I am" + string);
    }

    public void privateMethod() {
        System.out.println("value is " + value);
    }
}
