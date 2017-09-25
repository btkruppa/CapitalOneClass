package JavaAssigment5.model;

public class AwesomePerson extends Person {

    public AwesomePerson() {
        this.name = "Firstname";
        this.age = 21;

        System.out.println("In AwesomePerson constructor...");
    }

    public void talk () {
        System.out.println("Hello my name is " + this.name + " and I'm " + this.age); }

    }


