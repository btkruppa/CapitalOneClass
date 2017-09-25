package JavaAssigment3;

//1.	Write a class named Assignment2 that uses a 2 if-statement to compare the strings “abc” and “ABC”. The first if-statement should use the double equals (==) operator and the other that uses the .equals() method of one of the strings to compare to the other. Print a message in both if-statements to indicate that the strings are equal


public class Assignment2 {

    public static void main(String[] args) {

        String a = "abc";
        String b = "ABC";

            if (a == b)
            {
                System.out.println("The strings are equal using (==)");
            }

            if (a .equals(b));
        {
            System.out.println("The strings are equal using (.equals)");
        }



    }

}
