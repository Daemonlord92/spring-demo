import entity.Engine;
import entity.V8Engine;
import entity.Vehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Engine engine = new V8Engine();

        Vehicle truck = new Vehicle(engine);

        Vehicle car = new Vehicle(applicationContext.getBean(V8Engine.class));
        car.start();

        Vehicle car2 = applicationContext.getBean(Vehicle.class);

        car2.start();
    }
}
