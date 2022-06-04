package creack.experience.interview.effectiveFinal;

@FunctionalInterface
public interface IFuncInt {
    int func(int num1, int num2);
    public String  toString();//all method present in Object Class.
    public int hashCode();
    public boolean equals(Object o);
}

// Main driver method
class GFG {

    // Main driver method
    public static void main(String[] args)
    {

       // int i =7;
        //Variable used in lambda expression should be final or effectively final

        IFuncInt funcInt = (num1, num2) ->
        {

            // It produces an error due to effectively final
            // variable not declared
          int  i = num1 + num2;
            return i;
        };
    }
}

