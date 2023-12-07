package org.practice;

import org.practice.inheritance.*;
import org.practice.composition.Laptop;
import org.practice.composition.components.GraphicsCard;
import org.practice.composition.components.Processor;
import org.practice.constructor.Bike;
import org.practice.polymorphism.Iphone;
import org.practice.polymorphism.Phone;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //!Instance of a Class/Object doesn't affect other instances
//        Car car = new Car();
//        Car car1 = new Car();
//        car1.setEngine("GTR");
//        System.out.println(car.getCar_model()); // -> null

        //Value of an uninitialized variable will throw an error
        String x;
//        System.out.println(x); //Throws an

        Car car = new Car();
//        System.out.println(car.run()); //Gives NullPointerException error
//        car.setDoor("closed");
//        car.setEngine("off");
//        car.setCar_speed(20);
//        System.out.println(car.run());

        //!Constructor demo
        Car defaultConstructorCar = new Car(); //default constructor
//        System.out.println(defaultConstructorCar.run()); //prints `Car is in idle position`

        Car parameterisedConstructorCar = new Car("closed", "on", 20); //parameterised constructor
//        System.out.println(parameterisedConstructorCar.run()); // prints `Car is running`

//       SmartPhone phone = new SmartPhone(); //If we are using parameterised constructor, Java won't inject its default constructor because of which we need to pass the parameters

        //Correct way
        SmartPhone phone = new SmartPhone("Apple");
//        System.out.println(phone.getBrand());


        //!Inheritance
        Bike defaultConstructorBike = new Bike(); //using default constructor
//        System.out.println(defaultConstructorBike.getWheels());

        Bike parameterisedConstructorBike = new Bike("petrol", 2, 2, 21, "led", "short"); //using parameterised constructor
//        System.out.println(parameterisedConstructorBike.getFuelTank());

//        System.out.println(parameterisedConstructorBike); //Prints `Bike{handle='short'} Vehicle{engine='petrol', wheels=2, seats=2, fuelTank=21, lights='led'}`

        //Demo Example of Multiple Inheritance
        Crocodile crocodile = new Crocodile();
//        System.out.println(crocodile.showInfo());

        Ele ele = new Ele();
//        System.out.println(ele.showInfo());

        Eagle eagle = new Eagle();
//        System.out.println(eagle.showInfo());


        //!Composition
        /*
        * The composition is the core concept of object-oriented programming.
        * The composition is the design technique to implement a has-a relationship between
        * different types of objects/classes. We can use Java inheritance or object composition
        * in Java for code reuse.
        *
        * Example in computer their are different component but Processor and Graphics have more than one
        * attributes so we need more data to stored that's why we make it as a new Class/Object below is the
        * implimentation of this example.
        * */
        Laptop laptop = new Laptop();
        System.out.println(laptop.getProcessor().getBrand());

        Processor p1 = new Processor();
        GraphicsCard g1 = new GraphicsCard();

        Laptop l1 = new Laptop(24.5f, p1, "DDR5", "1TB", g1, "Single Layer", "backled");
        System.out.println(l1);

        //!Encapsulation
        //It's just making sure to restrict access of variables outside of class/object but if want can be done by getter/setter
        //Setters can have checks for example if I want to change the age but age should not be invalid then a if statement can be
        //used to check in setter whether to update the variable or not.

        //!Polymorphism - Poly: multi, morphism: forms
        /*
        * In polymorphism the base class i.r the parent class can take multiple forms based on object type, it can be of any form like
        * parent or child object/class
        * */

        //base class of Iphone and Nokia3310 class
        Phone ph; //Not initializing it so that we can define it later using any object/class that what make this variable to take multiple form

        ph = new Iphone();
        ph.feature(); //prints: `make calls and do smart things` - from Iphone class

        //Additional feature/ Use Case can be
        List<Animal> animalList = new ArrayList<>();

        Animal animal = new Animal();
        Reptile reptile = new Reptile();
        Animal croc = new Crocodile();
        Animal eleObj = new Ele();
        Bird eagleObj = new Bird();

        animalList.add(animal);
        animalList.add(reptile);
        animalList.add(croc);
        animalList.add(eagleObj);
        animalList.add(eleObj);

        listAnimals(animalList);

    }

    private static void listAnimals(List<Animal> animalList) {
        for (Animal animal: animalList) {
            System.out.println(animal.showInfo());
        }
    }

}