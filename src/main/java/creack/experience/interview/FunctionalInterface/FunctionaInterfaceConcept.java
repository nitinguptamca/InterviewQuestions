package creack.experience.interview.FunctionalInterface;

/**
 * The term Java functional interface was introduced in Java 8.
 * A functional interface in Java is an interface that contains only a single abstract
 * (unimplemented) method. Its contain any number of default and static method.
 */
@FunctionalInterface
public interface FunctionaInterfaceConcept {
    public String getSomething();

    public static  void setProperties(){
        System.out.println("testing");
    }
    public default void print1(String text) {
        System.out.println(text);
    }
    public static  void setProperties1(){
        System.out.println("testing");
    }
    public default void print2(String text) {
        System.out.println(text);
    }
    public static  void setProperties2(){
        System.out.println("testing");
    }
    public default void print(String text) {
        System.out.println(text);
    }


}
