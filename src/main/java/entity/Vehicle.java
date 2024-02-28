package entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Vehicle {

    //@Autowired
    private Engine engine;

    public Vehicle(Engine engine){
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }
}
