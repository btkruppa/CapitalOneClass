package JavaAssigment3;

//1.	Write a class named Assignment3 that declares 2 strings “abc” and “abc”. The first should use the string literal syntax and the other should use the new keyword. Write a comparison operator that prints a message if they are equal or otherwise. (Use an if/else-statement)


public class Assignment3 {
    public static void main(String[] args) {
        String a = "abc";
        String b = new String("abc");

        if (a == b)
        {
            System.out.println("equal");
        }

        else
        {
            System.out.println("not equal");
        }


    }
}
