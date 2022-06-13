package com.prectise.advanced.exceptions;

import java.io.Closeable;
import java.io.IOException;

public class JavaException {
    public static void main(String[] args) {

        int x = 10, y = 20;
        int dx, dy;
        try {
            dx = x % 5;
            dy = y / dx;
        } catch (IllegalArgumentException ae) {
            System.out.println("IllegalArgumentException AE");
            dx = 2;
            dy = y / dx;
        } catch (ArithmeticException ae) {
            System.out.println("Caught AE");
            dx = 2;
            dy = y / dx;
        }
        x = x / dx;
        y = y / dy;
        System.out.println(dx + " " + dy);
        System.out.println(x + " " + y);

        // 1.
        // No matter what happens, the exception raised by
        // finally will get through
        try (MyResource myResource = new MyResource()) {
            myResource.open();
            //   throw new NullPointerException("try");
        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
            throw new UserDefineException("nullpinter exception");
        } catch (UserDefineException e) {
            System.out.println(e.getLocalizedMessage());
            throw new UserDefineException1("UserDefineException1");
        } catch (UserDefineException1 e) {
            System.out.println(e.getLocalizedMessage());
            throw new IllegalArgumentException("catch");
        }catch (IllegalArgumentException e) {
            System.out.println(e.getLocalizedMessage());
            throw new Exception("exception");
        } catch (NullPointerException e) {
            System.out.println(e.getLocalizedMessage());
            throw new Exception("Null pointer exception");
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        } finally {
            throw new ClassCastException("finally");
        }


    }
}

class MyResource implements AutoCloseable {
    public void open() throws IOException {
        throw new IllegalArgumentException("IllegalArgumentException");
    }

    public void close() {
        throw new ArithmeticException("close");
    }
}

class MyResource1 implements Closeable {

    @Override
    public void close() throws IOException {
        throw new ArithmeticException("close");
    }
}

