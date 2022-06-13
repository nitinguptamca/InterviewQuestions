package com.prectise.advanced.exceptions;

public class MultipleCatchBlock1 {
    public static void main12(String[] args) {

        try{
            int a[]=new int[5];
            a[5]=30/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch(Exception e)
        {
            System.out.println("Parent Exception occurs");
        }
        finally {
            System.out.println("finally");
        }
        System.out.println("rest of the code");
    }

    public static void main(String args[]){
        //outer try block
        try{
            //inner try block 1
            try{
                System.out.println("going to divide by 0");
                int b =39/0;
            }
            //catch block of inner try block 1
            catch(ArithmeticException e)
            {
                System.out.println(e);
            }


            //inner try block 2
            try{
                int a[]=new int[5];

                //assigning the value out of array bounds
                a[5]=4;
            }

            //catch block of inner try block 2
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);
            }


            System.out.println("other statement");
        }
        //catch block of outer try block
        catch(Exception e)
        {
            System.out.println("handled the exception (outer catch)");
        }

        System.out.println("normal flow..");
    }
}
