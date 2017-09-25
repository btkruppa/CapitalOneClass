package JavaAssigment3;

//Write a class named Assignment4 that declares a string "abcdefghijklmopqrstuvwxyz". Use the indexOf() method to print the index of "s" and "f".


public class Assignment4 {

    public static void main(String[] args) {

        String a = "abcdefghijklmopqrstuvwxyz";


        int s = a.indexOf("s");
        int f = a.indexOf("f");

        System.out.println("'s' is at: " + s + ", and 'f' is at: "+ f);


    }


}
