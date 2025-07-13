package car.example.autowiring.name;

public class Car {//class is dependent on specification
    private Specification specification;

    public void setSpecification(Specification specification) {
    this.specification = specification;
    }
    public void displayDetails(){
        System.out.println("Car Details" + specification.toString());
    }
}