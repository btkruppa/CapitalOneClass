package JavaAssigment5.model;

public class Applications {

    public static void main(String[] args) {
        AwesomePerson ap = new AwesomePerson();
        ap.talk();

        ReallyAwesomePerson rap = new ReallyAwesomePerson();
        rap.talk("This is a custom message!");
    }
}
