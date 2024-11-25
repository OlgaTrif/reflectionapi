import java.util.Arrays;

public class Analyser {
    public static void analyzeClass() {
        Class clazz = String.class;
        System.out.println("Методы класса: " +  Arrays.toString(clazz.getDeclaredMethods()));
    }
}
