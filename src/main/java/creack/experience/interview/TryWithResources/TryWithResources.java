package creack.experience.interview.TryWithResources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * The try-with-resources statement is a try statement that declares one or more resources.
 * A resource is an object that must be closed after the program is finished with it.
 * The try-with-resources statement ensures that each resource is closed at the end of the statement.
 * Any object that implements java.lang.AutoCloseable, which includes all objects which implement
 * java.io.Closeable, can be used as a resource.
 * <p>
 * The following example reads the first line from a file. It uses an instance of FileReader
 * and BufferedReader to read data from the file. FileReader and BufferedReader are resources
 * that must be closed after the program is finished with it:
 * <p>
 *     Resources that were defined/acquired first will be closed last.
 *     <p>
 * https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html
 * <p>
 * However, this example might have a resource leak. A program has to do more than rely on the garbage collector (GC) to reclaim a resource's memory when it's finished with it. The program must also release the resoure back to the operating system, typically by calling the resource's close method. However, if a program fails to do this before the GC reclaims the resource, then the information needed to release the resource is lost. The resource, which is still considered by the operaing system to be in use, has leaked.
 * <p>
 * In this example, if the readLine method throws an exception, and the statement br.close() in the finally block throws an exception, then the FileReader has leaked. Therefore, use a try-with-resources statement instead of a finally block to close your program's resources.
 */
public class TryWithResources {

    static String readFirstLineFromFile(String path) throws IOException {
        try (FileReader fr = new FileReader(path);
             BufferedReader br = new BufferedReader(fr)) {
            return br.readLine();
        } catch (IOException e) {
            System.out.println("to. do.");
        } finally {
            System.out.println("to. do.");
        }
        return null;
    }
}
