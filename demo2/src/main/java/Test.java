import org.jboss.weld.util.Annotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
    @Annotation(a = 2, b = 5)
    public void test(int a, int b) {
        int subtract = b - a;
        int sum = a + b;
        System.out.println("Amount of subtract is: " + subtract);
        System.out.println("Amount of sum is: " + sum);
        if (sum < subtract) {
            System.out.println("The amount of sum less than subtract");
        } else {
            System.out.println("The amount of sum bigger than subtract");
        }
    }
}
