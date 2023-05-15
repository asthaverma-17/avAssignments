//1• If any class has any of its method abstract then you must declare entire class abstract.
//2• Abstract class cannot be instantiated.
//3• When we extend an abstract class, we must either override all the abstract methods in subclass or declare subclass as abstract.
//4• Abstract class cannot be private.
//5• Abstract class cannot be final.
//6• You can declare a class abstract without having any abstract method.


abstract class checkAbstractProperties{  // point 1
    abstract int calculateArea(); // abstract method
    abstract double calculateVolume();
    public int calculatePerimeter(){ // non-abstract method
        // code here
        return 0;
    }
}

abstract class checkAbstractWithNonAbstract{ // point 6
    public void noOfPlanets(){
        System.out.println("8 planets in solar system");
    }
    public void ourGalaxy(){
        System.out.println("Milky way s our home");
    }
}
//private abstract class checkPrivateAbstract{  point 4
    // compile time error --> Modifier 'private' not allowed here.
//}

//final abstract class checkFinalAbstract{  point 5
// compile time error --> illegal combination of final and abstract
//}

abstract class childAbstract1 extends checkAbstractProperties{}  // make the subclass abstract

// or
class childAbstract2 extends checkAbstractProperties{ // implement all the abstract methods of parent class in subclass
    @Override
    int calculateArea() {
        return 0;
    }
    @Override
    double calculateVolume() {
        return 0;
    }
}


public class Assignment2Q4 {
    public static void main(String[] args) {
//        checkAbstractProperties obj=new checkAbstractProperties(); point 2
        // throwing compile time error--> 'checkAbstractProperties is abstract; cannot be instantiated'


    }
}