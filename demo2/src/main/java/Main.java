import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
//H.W. 3.1
public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Test testClass = new Test();
        final Class<?> cls = Test.class;

        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Annotation.class)) {
                Annotation tMA = method.getAnnotation(Annotation.class);
                method.invoke(testClass, tMA.a(), tMA.b());
            }
        }
    }
}


