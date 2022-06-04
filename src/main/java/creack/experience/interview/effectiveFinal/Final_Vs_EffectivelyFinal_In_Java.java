package creack.experience.interview.effectiveFinal;

/**
 * One of the most interesting features introduced in Java 8 is effectively final. It allows us to not write the final modifier for variables, fields, and parameters that are effectively treated and used like final ones.
 * <br></br>
 * @implNote https://www.baeldung.com/java-effectively-final
 */

@FunctionalInterface
public interface Final_Vs_EffectivelyFinal_In_Java {
    void testEffectivelyFinal();
    default void test() {
        int effectivelyFinalInt = 10;
        Final_Vs_EffectivelyFinal_In_Java final_Vs_EffectivelyFinal_In_Java
                = () -> System.out.println("Value of effectively variable is : " + effectivelyFinalInt);
    }
}

class OuterClass{
    int numberLength;

    class InnerClass{
        InnerClass(String phoneNumber) {
            numberLength =7;
            System.out.println("to. do.");
            if (phoneNumber.length() == numberLength)
                numberLength = 8;
            else
                numberLength = 0;
        }
    }

    public static void main(String[] args) {
        OuterClass outerClass =new OuterClass();
        System.out.println(outerClass.numberLength);
    }
}

