public class Person
{
    /*
     * Class Basics
     * - what is an object?
     * Member of the class
     * - certain data
     *      instance variables
     * - certain behaviors
     *      instance methods
     *
     *      examples:
     *      person
     *      student
     *      number system
     *      times
     *      cars
     *      traffic
     *
     *      What is a class?
     *      - class description for a set of objects
     *          contains:
     *              variables
     *              methods
     *
     *      What kind of variables can we have?
     *      - local variables
     *      - instance variables
     *      - class variables
     *
     *      What kind of methods can we have?
     *      - instance methods
     *      - class methods
     *
     *      Instance:
     *      - relate specifically to our object
     *
     *
     *      How do we instantiate a new object?
     *
     *      <class-name> <reference variables> = new <class-name>();
     *
     *      How do we just declare a new reference variable?
     *      <class-name> <reference variable>;
     *
     *      Method calling:
     *      - how do we call a method?
     *
     *      Instance
     *      <reference variable>.<method-name>(<parameters>);
     *
     *      this.
     *      - When can we use this?
     *          we can use this when our calling object is a reference variable
     *          we can use this. in our methods
     *
     *
     *  Example:
     *      // Within our class
     *      Public int getAge(){
     *          return this.age;
     *      }
     *
     *      // Within our driver
     *      Al.getAge(); <=== Al is our calling object pretend we made a calling object called Al
     *
     *      Trick question:
     *      - can you always use (this.) ?? NO
     *      what if you didn't have an instance
     *
     *  Instance variables and their default values:
     *  - int: 0
     *  - double: 0.0
     *  - boolean: false
     *  - reference: null
     *  - String: null
     *
     *  Access modifiers:
     *  public
     *  - Access for everyone
     *
     *  private
     *  - only members of the clas can access the code
     *
     *  Instance vs local variables:
     *  - Instance: descriptions of an object
     *  - Local: die when our method/loop no longer exists
     *
     *  Local Variables default values?? garbage
     *
     *  while (i < 10){
     *      boolean isLess = false
     *
     *      ...
     *  }
     *
     *  System.out.print(isLess);
     *  - Throws an error
     *
     *
     *  Persistence:
     *  - local variables: only exist until method/loop ends
     *  - instance variables: live as long as our object
     *
     *  Return statements:
     *
     *  public static void main(String[] args){
     *  - nothing! void
     *
     *  public String toString(){
     *  - return String
     *
     *  public int getAge()
     *
     *  public person getClone()
     *      return person
     *
     *  public void doChange(){
     *  ....
     *  // what if we did the change?
     *  // can use an empty return;
     *
     *  return;
     *  // empty return allows us to exit a method
     *
     *
     *  What if we want to grab instance data?
     *  Soln:
     *  use an accessor/ getter
     *
     *  public int getAge(){
     *      return this.age;
     *  }
     *
     *  What if we want to set instance values data?
     *  mutator/setter
     *  What access modifier should this be?
     *  - private
     *
     *  Fwe important method:
     *  - equals
     *  // What if we want to compare to reference variables?
     *  ==?
     *  No!
     *  reference variables: refer to an address
     *  - only use == for primitive types
     *      int, double, float, long, boolean
     *
     *  - .equals?
     *  reference types:
     *  - use for a string
     *
     *  Make our own equals methods that compare the content of the object
     *
     *  - clone
     *  Instance points to address
     *  Person Al = new Person():
     *  Person Allison = new Person():
     *  Allison = Al;
     *  // now they point to the same thing
     *
     *
     *  // soln: make a clone
     *  - create new object of the class
     *  - copy over the contents ie instance data
     *  - return the new object of the class
     *
     *  public <class-name> clone(){
     *
     *  - toString
     *  have instance data we want to return as a string
     *
     *  - int age
     *  - String name;
     *
     *  public String to String(0{
     *  // return a new string
     *  return( this.age + " " + this.name);
     *
     *
     *  Method call chaining:
     *
     *  we have these methods:
     *  getAge()
     *  getHeight()
     *
     *  Al.getAge().getHeight().toString():
     *
     *  use . operator to keep calling an instance method
     *
     *  <ref-variable>.<method-name>(<parameter>).<method-name>(<parameter>):
     *
     *  Overloaded method:
     *
     *  - can have the same method name with different parameters
     *
     *
     *  public void setName(String first, String last)
     *
     *  public void setName(String first, String middle, String last)
     *
     *
     *  Good application:
     *
     *  Constructors!
     *  - when you create a new Object
     *  <Class-name> <ref-name> = new <Class-New>();
     *  // calling our constructors!
     *
     *  - what if we don't include a constructor?
     *
     *  java has a built-in one: default constructor
     *
     *  zero arity constructor:
     *  - this one does not take any parameters
     *  Person al = new Person();
     *
     *  Public Person(){
     *      this.age = 0;
     *      this.name = " ":
     *  }
     *
     *
     *  Specifying constructor:
     *
     *  Public Person(int age, String name){
     *      this.age = age;
     *      this.name = name;
     *  }
     *  // inter-constructor calling
     *  Public Person(){
     *      this.Person(0, " "):
     *  }
     *
     *  Question: what can the constructor be called?
     *  - only the name of the class
     *
     *
     *  Added info:
     *  Public Person(){
     *      while(name != null) { <== this cannot be first or error will be thrown
     *          this.name = name;   <== this must happen first before anything else
     *      }
     *  }
     *
     *  Question: what can the constructor be called?
     *  - only the name of the class
     *
     *
     * Class (static) variables:
     * - these relate to the whole class
     * <public/private> static <type> <variable-name>;
     *
     * default values?
     * int  0
     * double   0.0
     * boolean  false
     * reference null
     *
     * Where can we access class variables?
     * - anywhere within our class
     * - class methods
     * - instance methods
     *
     * Class methods:
     * - methods that relate to the class
     * <public/private> static <return type> <name>(<parameters>)
     *
     * Questions:
     * - Where can you access class variables?
     * - anywhere within the class
     *
     * - where can you access instance variables?
     * public - pretty much anywhere
     * private - only within instance methods
     * - good example mutators
     *
     * - where can you access class methods?
     * - from within the class
     *
     * - where can you access instance methods?
     * - public: other instance methods, and through objects
     *
     * - Private:
     * - instance methods
     *
     * Scope: instance vs class
     * - variables
     * instance: lives as long as our object does
     * class: lives as long as our class does
     *
     *
     * Question:
     * - What has the most broad scope? local, instance or class?
     * Class - the most broad
     * Instance - middle
     * Local - the least broad
     *
     *  Name Constants
     *
     *  - want it to stay the same
     *  Instance constants
     *  public final <constant-name>;
     *  public final <constant-name> = NAME;
     *  - can set the value when we declare it, or we can in our constructor
     *  - constructor: actually sending in a name
     *  - setting the value can not be altered
     *
     *  Class Constants
     *  <public/private> static final <type> <variables-name> = <value>;
     *  - can only be only given a value when you declare
     *
     * // Exam Review End
     *
     *
     *  Now we go over Arrays, ArrayLists, study strategies, examples
     *
     * <<< Array >>>
     *
     * Arrays are a way to store data
     * constructor data
     * int  {0,1,2,3,4,5,6,7,8,9}
     * double
     * reference variables
     * string
     * other arrays
     *
     * Array example:
     * <type>[] <name> = new <type>[ ];
     *
     *  boolean[] deck = new boolean [52];
     * // we created an array now we need to fill it
     * // a good way to do that is to use a for loop instead of
     * // going through everything
     *  for(int i = 0; i < deck.length; i++){
     *      deck[i] = true;
     * // now every boolean in the array holds the value true!
     *
     * Next Example
     *
     * Person Class
     *
     * int age;
     * int height;
     * String name;
     *
     * //Constructor
     * Person(age,height, name)
     *
     * Person [] students = new Person[10];
     * students[2] = new Person(22, 100, "Al");
     * System.out.print(Student[2];
     *      // This would print " 22, 100, Al "
     *
     * Methods: size(), .add() , remove()
     * // good source docs.oracle.com //
     *
     *
     * <<< Arraylists >>>
     *
     * - built in package that needs to be imported // java.util.Arraylist
     * - cannot put primitive types in there
     *      Arraylist<int, boolean or double> name...
     *      // will throw error
     * - can use
     *      - Class
     *      - String
     *
     *
     * <<< Study Strategies >>>
     *  - Draw a pictures to help you understand
     *  - think of everything you need in the code before you code
     *  - write out the instructions or needs for every method
     *  - work backwards if needed like - think about what you want for the outcome
     *  - if you're stuck with a method skip the method and move onto the next
     *  - take frequent breaks (play a game, eat, drink water, talk to humans)
     *  - Don't waste your time look for solutions (Ask a friend, study group, stackoverflow, tutoring)
     *
     */


    private int age;
    private String name;
    private double temp;
    public String EYECOLOR;

    // Class variables
    private static final double sickTemp = 99.1;
    private static int isTwentyOne = 21;

    // 0-arity constructor
    public Person() {
        this(0, " ", 0.0, "clear"); //this is calling the spec constant Main in the form (age,name,temp)
    }
    // spec constant
    public Person(int age, String name, double temp, String eyecolor){
        this.setAge(age);
        this.setName(name);
        this.setTemp(temp);
        this.setEyeColor(eyecolor);
    }

    // Mutators
    private void setAge(int age){
        this.age = age;
    }

    private void setName(String name){
        this.name = name;
    }

    private void setTemp(double temp){
        this.temp = temp;
    }

    private void setEyeColor(String eyecolor){
        this.EYECOLOR = eyecolor;
    }
    // End Mutators

    // Accessors
    public int getAge(){
        return this.age;
    }

    public String getName(){
        return this.name;
    }

    public double getTemp(){
        return this.temp;
    }

    public String getEyeColor(){
        return this.EYECOLOR;
    }
    // End Accessors

    private boolean isSick(){
        if (this.getTemp() > sickTemp) {
            return true;
        }
        return false;
    }

    private boolean is21(){
        if (this.getAge() >= isTwentyOne){
            return true;
        }
        return false;
    }

    public String toString() {
        return ("Age: " + this.getAge() + " Name: " + this.getName() + "\ntemp: " +
                this.getTemp() + "\nIs sick? " + this.isSick() + "\n21 or older: " + this.is21());
    }

    public boolean Equals(Person other) {
        // compare the contents between two people
        if (this.getAge() == other.getAge() && this.getTemp() == other.getTemp() &&
                this.getName().equals(other.getName()) && this.getEyeColor().equals(other.getEyeColor())) {
            return true;
        }
        return false;
    }

    // Clone Method
    public Person clone(){
        Person copy = new Person(this.getAge(),this.getName(),this.getTemp(),this.getEyeColor());
        return copy;
    }
}

// Below is the code for Person driver commented out

//public class PersonDriver {
//    public static final void main(String[] args) {
//        Person Allison = new Person(22, "Allison ", 97.1, "Blue");
//        System.out.println(Allison.toString());
//
//        Person Al = new Person(22, "Al ", 97.1, "Blue");
//        System.out.println(Al.toString());
//
//        Person Bob = new Person(10, "Bob ", 97.1, "Blue");
//        Person John = new Person(11, "John ", 97.1, "Brown");
//
//        Person[] faculty = new Person[4];
//        faculty[0] = Allison;
//        faculty[1] = Al;
//        faculty[2] = Bob;
//        faculty[3] = John;
//
//        for (int i = 0; i < faculty.length; i++) {
//            System.out.println(faculty[i].toString());
//        }
//
//        System.out.println("\nDoes bob equal john? " + Bob.equals(John));
//    }
//}
