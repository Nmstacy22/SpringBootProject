package car.example.autowiring.name;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
     ApplicationContext context = new ClassPathXmlApplicationContext("autowiringByName.xml");

    Car myCar =  (Car) context.getBean("myCar");//get me the bean with the id, myCar from the xml file 
    myCar.displayDetails();
    }
}
