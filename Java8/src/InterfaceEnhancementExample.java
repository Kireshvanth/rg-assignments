interface MyInterface {
    void abstractMethod();

    default void defaultMethod() {
        System.out.println("Default method in interface");
    }

    static void staticMethod() {
        System.out.println("Static method in interface");
    }
}

class MyClass implements MyInterface {
    @Override
    public void abstractMethod() {
        System.out.println("Abstract method implemented in MyClass");
    }

    @Override
    public void defaultMethod() {
        System.out.println("Default method overridden in MyClass");
    }
}

public class InterfaceEnhancementExample {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.abstractMethod();
        myClass.defaultMethod();
        MyInterface.staticMethod();
    }
}
