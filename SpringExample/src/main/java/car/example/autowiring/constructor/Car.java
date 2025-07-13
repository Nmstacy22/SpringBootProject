package car.example.autowiring.constructor;

public class Car {//class is dependent on specification
    private Specification specification;

    
    
    public Car(Specification specification) {
        this.specification = specification;
    }



    public void displayDetails(){
        System.out.println("Car Details" + specification.toString());
    }
}