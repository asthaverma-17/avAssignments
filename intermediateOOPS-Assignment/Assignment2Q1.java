//To create a singleton class in Java, you can use the following approach:
//
// 1. Make the constructor of the class private so that it cannot be called from outside the class.
// 2. Create a static method that returns an instance of the class. This method should create a new instance of the class if one doesn't already exist, and return the existing instance if it does.
// 3. Use a private static variable to hold the single instance of the class.

public class Assignment2Q1 {
    private static Assignment2Q1 instance; // 3

    private Assignment2Q1 () {
        // 1
    }

    public static Assignment2Q1 getInstance() {  // 3
        if (instance == null) {
            instance = new Assignment2Q1();
        }
        return instance;
    }
}
//class SingletonInheritanceCheck extends Assignment2Q1  {
//    we cannot create the instance of the singleton class, it will throw an compile time error.
//}
