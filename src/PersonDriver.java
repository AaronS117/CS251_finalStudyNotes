public class PersonDriver {
    public static final void main(String[] args) {
        Person Allison = new Person(22, "Allison ", 97.1, "Blue");
        System.out.println(Allison.toString());

        Person Al = new Person(22, "Al ", 97.1, "Blue");
        System.out.println(Al.toString());

        Person Bob = new Person(10, "Bob ", 97.1, "Blue");
        Person John = new Person(11, "John ", 97.1, "Brown");

        Person[] faculty = new Person[4];
        faculty[0] = Allison;
        faculty[1] = Al;
        faculty[2] = Bob;
        faculty[3] = John;

        for (int i = 0; i < faculty.length; i++) {
            System.out.println(faculty[i].toString());
        }

        System.out.println("\nDoes bob equal john? " + Bob.equals(John));
    }
}
