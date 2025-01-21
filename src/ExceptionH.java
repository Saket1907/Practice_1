public class ExceptionH {
    public static void main(String[] args) {
        try{
            int exp = 10/0;
            System.out.println("try block");
        } catch(Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
    }
}
