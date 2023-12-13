package org.example;

import org.example.ObjectsinFile.Vehicle;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //! File Creation
        /*
        * This tutorial is about creating text or creating a file on a disk. This can be done by importing
        * the file library. Here you can study all the commands related to the creation of files and their
        * location on the disk. It also deals with the exceptions thrown after file creation. The concept
        * of the absolute and relative path is also shown here.
        *
        * The following constructor takes a file object to create the file. First, we create a file object
        * using File() method as follows:
        *
        *   File file = new File(“StudyEasy.txt”);
        *
        * Once you have an object in hand, then there is a list of helper methods, we select the file.createNewFile()
        * method. This method is used to create a new empty file.
        *
        * When we create a new file we need to handle the exception. Here we make use of Add throws declaration
        * that throws java.io.IOException when it’s not able to create the file.
        *
        * Here we have not given any path as a result “StudyEasy.txt” is created inside the project file. Hence
        * this particular filename is related to the project.
        * */
        File file = new File("/Users/neeraj/Documents/Zolostays/Practice/Java/Learning Full Stack Java/DataStream/src/main/java/org/example/newTextFile.txt");
//        file.createNewFile();
//        System.out.println("File created successfully");

        //? Create Directory
        File file2 = new File("/Users/neeraj/Documents/Zolostays/Practice/Java/Learning Full Stack Java/DataStream/src/main/java/org/example/newDirectory/anotherDirectory/yetAnotherDirectory");
//        file2.mkdir(); //? mkdir() method creates a single directory named by this abstract pathname.
//        if(file2.mkdirs()) { //? mkdirs() method creates a directory named by this abstract pathname, including any necessary but nonexistent parent or child directories.
//            System.out.println("Directory created successfully");
//        } else {
//            System.out.println("Directory already exists");
//        }

        //? Check for OS
        String OS = System.getProperty("os.name").toLowerCase();
//        System.out.println(OS); //? mac os x
//
//        if (OS.contains("win")){
//            System.out.println("Windows");
//        }else if (OS.contains("mac")){
//            System.out.println("Apple system");
//        }else if (OS.contains("nix") || OS.contains("nux") || OS.contains("aix")){
//            System.out.println("Linux/Unix system");
//        }else{
//            System.out.println("Unknown OS");
//        }

        //? Writing into a file

        //* Try without resources
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("DataStream/src/main/java/org/example/dummy.txt", true));
            bw.write("Author: ");
            bw.write("Neeraj");
            bw.newLine();
            bw.close(); //! Closing the file is important to save the changes and to avoid memory leaks
//            System.out.println("File write operation was successful");
        } catch (IOException e) {
            e.printStackTrace();
//            System.out.println("Something went wrong");
        }

        //* Try with resources
        File newFile = new File("DataStream/src/main/java/org/example/dummy.txt");
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(newFile, true))){
            bw.write("Author: ");
            bw.write("Neeraj");
            bw.newLine();
//            System.out.println("File operation was successful");
        } catch (IOException e) {
            e.printStackTrace();
//            System.out.println("Something went wrong");
        }

        //? Reading from a file
        File file3 = new File("DataStream/src/main/java/org/example/test.txt");
        try(BufferedReader br = new BufferedReader(new FileReader(file3))){
            String line;
//            while ((line = br.readLine()) != null){
//                System.out.println(line);
//            }
//            System.out.println("File operation was successful");
        } catch (IOException e) {
            e.printStackTrace();
//            System.out.println("Something went wrong");
        }

        //! Scanner Class
        /*
        * The Scanner class is used to get user input, and it is found in the java.util package.
        * To use the Scanner class, create an object of the class and use any of the available
        * methods found in the Scanner class documentation. In our example, we will use the nextLine()
        * method, which is used to read Strings:
         */
        try(Scanner sc = new Scanner(new File("DataStream/src/main/java/org/example/test.txt"))){
            String line;
//            while (sc.hasNext()){
//                line = sc.nextLine();
//                System.out.println(line);
//            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //? Delete a file
        File file4 = new File("DataStream/src/main/java/org/example/dummy.txt");
//        if(file4.delete()){
//            System.out.println("File deleted successfully");
//        } else {
//            System.out.println("Failed to delete the file");
//        }

        //? Read and Write Objects in File operations
        /*
        * The ObjectOutputStream class is used to write primitive data types and Java objects to an
        * OutputStream. Only objects that support the java.io.Serializable interface can be written
        * to streams. The ObjectOutputStream class contains writeObject() method for serializing an Object.
        * The ObjectInputStream class contains readObject() method for deserializing an object.
        *
        * The following example demonstrates how to write and read objects in a file.
         */

        Vehicle Bike = new Vehicle("Bike", 1234);
        Vehicle Car = new Vehicle("Car", 5678);

        //? Write Objects
        File file5 = new File("DataStream/src/main/java/org/example/vehicles.dat");

//        try(FileOutputStream fos = new FileOutputStream(file5)) {
//            try(ObjectOutputStream obj = new ObjectOutputStream(fos)) {
//                obj.writeObject(Bike);
//                obj.writeObject(Car);
//                System.out.println("Object written successfully to vehicles.dat");
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //? Read Objects
        /*
        * The following example demonstrates how to read objects from a file.
        * and after reading the objects, we are printing them on the console.
        *
        * Output:-
        *          Vehicle{name='Bike', number=1234}
        *          Vehicle{name='Car', number=5678}
        *
        * Note:-
        *      The readObject() method returns an Object, so we need to cast it to the Vehicle class.
        *
        * But what if we change something in the Vehicle class? Let’s say we add a new field in the Vehicle class.
        * It will throw an exception. Because the Vehicle class is not the same as it was when we wrote the objects
        * in the file. So, we need to handle this serialVersionID exception.
        *
        * This is error which is thrown after making Variables in Vehicle.java as final:-
        *
        ! java.io.InvalidClassException: org.example.ObjectsinFile.Vehicle; local class incompatible: stream classdesc serialVersionUID = 6423144807643359315, local class serialVersionUID = 646374114825610748
        *
        * To handle this exception, we need to add a serialVersionID in the Vehicle class. as `private static final long serialVersionUID = 6423144807643359315L`;
         */
        try(FileInputStream fis = new FileInputStream(file5)) {
            try {
                ObjectInputStream obj = new ObjectInputStream(fis);
                Vehicle vehicle1 = (Vehicle) obj.readObject();
                Vehicle vehicle2 = (Vehicle) obj.readObject();
                System.out.println(vehicle1);
                System.out.println(vehicle2);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}