package de.heckenmann.jenkinsdocker;

/**
 *
 * @author heckenmann
 */
public class HelloWorld {

    public static void main(String... args) {
        System.out.println("Hallo " + System.getenv("name"));
    }
}
