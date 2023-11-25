package org.practice;

import org.practice.Abstract.John;
import org.practice.Abstract.Person;
import org.practice.Abstract.Pooja;
import org.practice.AccessModifiers.Other;
import org.practice.AccessModifiers.TestMain;
import org.practice.Enum.Learning;
import org.practice.ExceptionHandling.ExceptionHandling;
import org.practice.FinalKeyword.Child;
import org.practice.FinalKeyword.Parent;
import org.practice.InnerClasses.Door;
import org.practice.InnerClasses.Lock;
import org.practice.InnerClasses.Shop;
import org.practice.Interface.Iphone;
import org.practice.Interface.Phone;
import org.practice.Interface.Samsung;
import org.practice.Packages.Store.Home;
import org.practice.StaticElements.StaticClass;
import org.practice.StaticElements.TestStatic;
import org.practice.StaticElements.ToyotaCars;
import org.practice.UserInput.UserInput;

public class Main {
    public static void main(String[] args) {
        //!Interface
        /*
         * It is used to restrict the Datatype of a variable or a function of a Class/Object
         * */
        Samsung ph1 = new Samsung();
        String s = ph1.processor();
//        System.out.println(s);
//        System.out.println(ph1.spaceInGB());

        Iphone ph2 = new Iphone();
        s = ph2.processor();
//        System.out.println(s);
//        System.out.println(ph2.spaceInGB());

        Phone ph3 = new Iphone();
//        System.out.println(ph3.airdrop()); //Throws and error because `airdrop()` function is present in Iphone class but not in Phone interface
        Iphone ph4 = new Iphone();
//        System.out.println(ph4.airdrop()); //prints: `Copy paste anywhere`


        //!Abstract class
        /*
         * Abstract classes are created by using the abstract keyword in the class definition.
         * An abstract class is used to achieve abstraction. A class that is declared with the abstract keyword is known as an abstract class in Java.
         * It can have abstract and non-abstract methods (method with the body).
         * An abstract class can have abstract and concrete methods both.
         * An abstract class cannot be instantiated, it means we cannot create an object of the class. We need a different class for the implementation of the abstract class.
         * */

        Person p = new John();
//        p.speak();
//        p.eat();

        p = new Pooja();
//        p.speak();
//        p.eat();

        p = new Person() {
            @Override
            public void eat() {
                System.out.println("Eats food");
            }
        };
//        p.speak();
//        p.eat();

        //!Inner Classes
        /*
        * Inner classes is the concept where we want to add more encapsulation to the given code.
        * When we declare a class inside a class then the inside class can access all the private members
        * in addition to the inner class can be hidden from the outside world.
        *
        * Types of inner class in java.
        *
        *  1. Nested Inner class
        *  2. Method Local Inner class
        *  3. Anonymous Inner class
        *  4. Static Inner class
        * */

        Shop shop = new Shop();

//        shop.shopStatus(); //Prints `Shop is close`

        //Now Imagine we want to change the logic to print shop is open we can do that by changing the value of
        //inner class private variable value to false;
//        shop.getLock().sett ///We are still not able to access the setter function of the private class present in Shop class we need to change the default access modifier of Lock class to public to access lock variable

        shop.getLock().setLocking(false);
//        shop.shopStatus(); //Prints `Shop is open`

        //!Local Inner class
        Door door = new Door();
//        System.out.println("args = " + Arrays.toString(args)); //Configure it from above where you can run the Main function and pass args values
        if(door.isLocked(args[0])) { //used index position to check args values
//            System.out.println("Door is unlocked");
        } else {
//            System.out.println("Door is locked");
        }

        //!Anonymous Object/class
//        System.out.println("args = " + Arrays.toString(args));
        if(args[1].equals(new Lock().getCode())) { //So instead of Lock lock = new Lock() where lock we'll be used one time we can used it directly so that is won't be stored in memory.
//            System.out.println("Door is now open");
        } else {
//            System.out.println("Door is now closed");
        }

        //!Anonymous Object/class with abstract class
        new Lock().new newLock() {

            @Override
            public void isUnlocked(String key) {
                if(key.equals("qwerty")) {
//                    System.out.println("Shop is unlocked");
                } else {
//                    System.out.println("Shop is locked");
                }
            }
        }.isUnlocked("qwerty"); //Prints `Shop is unlocked`

        //!User Input
        UserInput userInput = new UserInput();
//        userInput.userName();
//        userInput.userAge();

        //!Static Elements: Variables/Methods
        /*
        * Java allows you to access static members, static members are class level and can be
        * accessed directly without any instance. For example.
        * The static keyword means that the variable or function is shared among all the instances
        * of that class since it belongs to the type, not to the real objects themselves.
        *
        * The implementation of a static variable is shown here.
        * The basic concept of a static variable is that it has a single reference variable.
        *
        * In this way, the utilization of such variables should be possible to keep up a basic
        * count of created objects or objects that access a class.
        * */
//        System.out.println("Values of static variable, "+ TestStatic.getTestVariable()); //As the value is in a single reference we don't need to initialize a object instead we can directly use the class as well
        TestStatic.setTestVariable(20);
//        System.out.println("Values of static variable, "+ TestStatic.getTestVariable());
        TestStatic.setTestVariable(30);
//        System.out.println("Values of static variable, "+ TestStatic.getTestVariable());

        //!Static Inner Class
//        StaticClass.InnerClass.staticMessage(); //Prints `Hello static message`
//        System.out.println("Value of static class of static variable is, "+ StaticClass.InnerClass.x);

        //For non static inner class you have to create object;
        StaticClass staticClass = new StaticClass();

        StaticClass.NonStaticInnerClass nonStaticInnerClassInstance = staticClass.new NonStaticInnerClass();

//        nonStaticInnerClassInstance.nonStaticMessage(); //Prints `Hello non static message`
//        staticClass.new NonStaticInnerClass().nonStaticMessage(); //Prints `Hello non static message`

        ToyotaCars toyotaCars = new ToyotaCars();
//        toyotaCars.getNonStaticInner().model("Corolla");
//        ToyotaCars.Brand.tagLine();

        //!Final Keyword
        /*
        * Cannot reassign values to a final variable
         */

        //?Default constructor initialization
        Child child = new Child();//After initialization there is not way we can change the value of x now
//        System.out.println(child.getX()); //Prints `10`

        //?Parameterised constructor initialization
        Child child1 = new Child(101); //After initialization there is not way we can change the value of x now
//        System.out.println(child1.getX()); //Prints `101`

        //! Final keyword in class and methods
        /*
        ? Final Method:-
        * After apply a final keyword on a method we can't change the method
        * For example:-
        *               We are inheriting from a parent class to a child class and child class is trying
        * to modify a class in parent class but the class has a final keyword the child class will not be
        * able to modify the class

        ? Final Class:-
        * After apply a final keyword on a class we can't change the class
        * For example:-
        *                We are inheriting from a parent class to a child class we cannot do that as the
        * final keyword restrict the modification of parent class. So if we want not to override or change
        * the class we can add final keyword but then we cannot inherit parent class to any other class.
         */
        Parent child2 = new Child();
//        child2.India(); //Prints `Bharat mata is jai!!!`
//        child2.USA();//Prints `USA is a nice country with guns!!!`

        //!Packages
        /*
        * It is a way to group many classes belonging to a specific project.
        * A package is like a folder of similar things such as music or a folder of movies.
        *
        * The package adds a different level of inheritance, this level of inheritance is by default
        * applied to all the members created in the method. Hence a package is a useful and efficient
        * entity in java.  The package also has a naming convention which we have studied earlier.
        * We can also import the packages which will result in accessing all the classes and methods
        * in it.
        *
        * The company uses always reversed Internet domain names for its package names.
        * For example, the company’s Internet domain name is studyasy.org, and then all its package
        * names start with org.studyeasy. Every component of the package name corresponds to a
        * subdirectory.
        *
        * In the following program, we have created two different packages. In both packages,
        * we have created the same name classes. The import statement in Java allows you to refer
        * to the classes that are declared in other packages that can be accessed without referring
        * to the full name of the package.
         */
        Home home = new Home();
//        home.message(); //Prints `Welcome to Store home page`

        org.practice.Packages.Blog.Home home1 = new org.practice.Packages.Blog.Home();
//        home1.message(); //Prints `Welcome to blog home page`

        //! Access Modifiers
        /*
        * Access modifiers in Java help to restrict the scope of a class, constructor, variable,
        * method, and data member.
        *
        * There are four types of access modifiers:
        *
        *  1. Private
        *  2. Public
        *  3. Protected
        *  4. Default – No keyword is required
        * */
        TestMain testMain = new TestMain();
        Other other = new Other();
//        testMain.printsVariable(); //Check the Other.java Class to learn more about it
//        System.out.println("Prints using public access modifiers from main method from Main class, "+ other.d);

        //! Using Inheritance
        TestMain testMain1 = new TestMain();
//        System.out.println(testMain1.d); //We can access only public variable and nothing else

        //! Exceptional Handling
        /*
        * Using try catch we can handle any exception using
        *
        * We can use multiple catch block after try but the hierarchy must be from specific to broad range
        *
        * For example:-
        *               If their is a Arithmetic exception then the first catch Block should have ArithmeticException
        * and then can use Exception class.
        * */

        //? Right way
//        try {
//            System.out.println("The divide by 0, "+ 10/0);
//        } catch (ArithmeticException e) { //Throws an error
//            System.out.println(e);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        //? Wrong way

//        try {
//            System.out.println("The divide by 0, "+ 10/0);
//        } catch (Exception e) {
//            e.printStackTrace();
//        } catch (ArithmeticException e) { //Throws an error
//            System.out.println(e);
//        }

        //? Finally block
//        int y = 0, x = 0;
//        try {
//            x = (y = 10+10)/0;
//        } catch (ArithmeticException e) { //Throws an error
//            System.out.println(e);
//        }  catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            System.out.println(y);
//        }

        //?No exception handling but can run finally block
//        try {
//            x = (y = 10+10)/0;
//        } finally {
//            System.out.println(y);
//        }

        //! Throw and Throws keyword usage in Java
        /*
        * Throws are used to suppress the error if the user doesn’t want to specify the try and catch
        * block. Note that this doesn’t handle the error only suppresses i.e pass the error where that specific
        * method is been called so that it can be handled by try catch block or can suppress it more. It should be used
        * only when the developer is sure that the error doesn’t occur.
        *
        * The throw is used to forcefully throw an error where it is decided by the developer
        * regarding certain conditions.
        * */

        ExceptionHandling exceptionHandling = new ExceptionHandling();
//        try {
//            exceptionHandling.doSomething();
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e); //* This is how throw keyword is used to throw and Exception
//        }

        //? User-defined Exception
//        try {
//            exceptionHandling.doSomething2(); //Throws exception via User defined exception
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        //? Checked and Unchecked exception
        /*
        * Java makes this division of exceptions depending on the level of importance of the
        * exception. The checked exceptions are handled by the java compiler itself and the
        * unchecked exception are handled by the user (not mandatory) in case of occurrence of
        * such exceptions.
        *
        * If any code within a method throws a checked exception, then the method must handle the
        * exception or must specify the exception using the keyword throws.
        *
        * For example, consider the following Java program we make use of the FileReader class
        * object and initialize it.  The program is not compiled, because the main function uses
        * FileReader() and FileReader() throws a checked exception FileNotFoundException.
        *
        * To fix the above program, we need to specify the list of exceptions using throws, or we
        * need to use a try-catch block.
        * */

        //! Enum in Java
        /*
        * Enum is used to define a set of constants in java. Not only constant by it could also
        * call any method, constructor associated with it. Which will be seen further in the
        * tutorial.
        *
        * We should always use enum when a variable (especially a method parameter) can only take
        * one from a small set of possible values.
        *
        * Enum is default public static hence we can directly reference variable by Enum Name.
        *
        * You can define an enum type either independently or as part of a class. The code to
        * define an enum independently is:
        * */

        System.out.println(Learning.COLLECTIONS); //Prints `COLLECTIONS`

        //? If we want value to be print or pass value in enum
        System.out.println(Learning.COLLECTIONS.getName()); //Prints `Neeraj`
    }
}