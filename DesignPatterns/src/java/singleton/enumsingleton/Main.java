public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.INSTANCE; // Get the only instance
        singleton.showMessage(); // Output: Hello from Enum Singleton!
    }
}