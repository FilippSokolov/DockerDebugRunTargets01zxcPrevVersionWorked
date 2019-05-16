import java.util.Date;

public class Java_echo_app_args {
    public static void main (String[] args) {
        System.out.println("Args of this program," + new Date().toString() + ":" );
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (String s: args) {
            System.out.println(s + " changed");
        }
    }

}
