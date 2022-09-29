// /Question 1. Ques1:create a
// class parent with default
// constructor and
// void sing method.
// print something inside the constructor and method
// Create child class which will inherit the property of parent and has methods
// void speak and void dance.
// print something inside the two methods.
// Create another class inheritance and object of class and call all the
// methods.
// also mention the type of inheritance on the top of the program.

class Parents {
    Parents() {
        System.out.println("i am a parents class constructor");
    }

    public void Sing() {
        System.out.println("Sing a Song");
    }
}

class Childs extends Parents {
    Childs() {
        System.out.println(" i am constructor");
    }

    public void Speak() {
        System.out.println("Speak something");
    }

    public void Dance() {
        System.out.println("oh i can do ");
    }
}

public class Parent {
    public static void main(String[] args) {
        // Parents p=new Parents();
        Childs c = new Childs();
        c.Dance();
        c.Speak();
        c.Sing();

    }
}
