package example1;

public class HelloWorld {

    public void helloInit() {
        System.out.println("HelloWorld init " + this.getClass().getSimpleName());
    }

    public void helloDestroy() {
        System.out.println("HelloWorld destroy " + this.getClass().getSimpleName());
    }
}
