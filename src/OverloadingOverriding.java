public class OverloadingOverriding {
    public static void main(String[] args) {
        callOverloading(null);
    }

    private static void callOverloading(String input){
        System.out.println("String");
    }

    @SuppressWarnings("unused")
    private static void callOverloading(Object input){
        System.out.println("Object");
    }
}