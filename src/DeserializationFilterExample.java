import java.io.*;
import java.util.*;

public class DeserializationFilterExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Set a filter
        ObjectInputFilter filter = ObjectInputFilter.Config.createFilter("com.example.*;!*");

        // Apply filter during deserialization
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.data"))) {
            ois.setObjectInputFilter(filter);
            Object obj = ois.readObject();
            System.out.println("Deserialized object: " + obj);
        }
    }
}
