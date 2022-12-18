import java.lang.reflect.Method;

public class App {

    /**
     * 
     */
    @MyCustomAnnotation(value = 10)
    public void sayHello() {
        System.out.println("MyCustom Anootation");
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        App h = new App();
        Method methodVal = h.getClass().getMethod("sayHello");

        MyCustomAnnotation myCustomAnnotation = methodVal.getAnnotation(MyCustomAnnotation.class);
        System.out.println("value is " + myCustomAnnotation.value());

    } 
}