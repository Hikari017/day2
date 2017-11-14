public class StringTest {



    public static void main(String[] args) {
        String s2 = "hello";




       // String s3 = new String("hello").intern();
        String s4 = new String("hello").intern();
        String s5 = "hello";

        if(s4 == s5 ){
            System.out.println("takie same");
        }else{
            System.out.println("nie takie same");
        }
    }
}
