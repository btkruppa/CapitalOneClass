package JavaAssigment3;

public class Assignment7 {

    public static void main(String[] args) {
        String a = "http://example.com?access_token=EFEc8328h29jndjd02h12$3829&ds98d";
        String token = a.substring(a.indexOf("=")+1);

        System.out.println(token);

    }
}
