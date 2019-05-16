import java.util.Date;

public class Java_helloworld_print {
    public static void main(String[] args) {
        System.out.println("hello world changed 1" + new Date().toString() );
        try {
            Thread.sleep(2000);
            System.out.println("hello world changed 2" + new Date().toString() );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
