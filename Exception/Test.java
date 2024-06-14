package Exception;

import java.io.IOException;

class Parent {

    public void mi() throws IOException {
        System.out.println("mi");
    }

}

public class Test {

    public void mi() throws Exception {
        System.out.println("mi");
    }

    public static void main(String[] args) {

    }
}
