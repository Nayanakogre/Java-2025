package in.xworkz.exception;

public class Example18 {
    public static void main(String[] args) {

            try {
                System.out.println("---------------------try entry-------------");
                java.util.Scanner sc = new java.util.Scanner(System.in);
                sc.close();
                sc.nextLine();
            } catch (Throwable e) {
                System.out.println("---------------------catch entry-------------");
                e.printStackTrace();
            }
        }
    }

