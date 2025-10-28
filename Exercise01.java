public class Exercise01 {
    public static void main(String[]  args) {
        A a = new A();
        B b = new B();

        String copy = a.message;

        a.hello();   // returns message from the A class, not inherited / parent class
        b.hello();   // returns hello method that was inherited 
    }
    
}
