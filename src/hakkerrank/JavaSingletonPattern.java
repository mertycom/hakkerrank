package hakkerrank;

public class JavaSingletonPattern {
private static final JavaSingletonPattern instance = new JavaSingletonPattern();
    
    private JavaSingletonPattern() {
    }
    
    public String str;
    
    public static JavaSingletonPattern getSingleInstance() {
        return instance;
    }
}
