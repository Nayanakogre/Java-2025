package in.xworkz.exception;

//PatternSyntaxException
import java.util.regex.Pattern;

public class Example45 {
    public static void main(String[] args) {
        try {
            System.out.println("---------------------try entry-------------");
            Pattern.compile("[a-Z"); // invalid regex pattern
        } catch (Throwable e) {
            System.out.println("---------------------catch entry-------------");
            e.printStackTrace();
        }
    }
}
