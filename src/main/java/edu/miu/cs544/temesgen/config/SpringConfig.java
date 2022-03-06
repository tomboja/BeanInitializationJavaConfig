package edu.miu.cs544.temesgen.config;

import edu.miu.cs544.temesgen.service.Bike;
import edu.miu.cs544.temesgen.service.Car;
import edu.miu.cs544.temesgen.service.Game;
import edu.miu.cs544.temesgen.service.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ProjectName: BeanInitializationJavaConfig
 * @Author: Temesgen D.
 * @Date: 3/6/22
 */

@Configuration
public class SpringConfig {

    @Bean
    public Car car() {
        return new Car(2020, "Toyota", "Prius", 5000);
    }

    @Bean
    public Bike bike() {
        return new Bike();
    }

    @Bean
    public Game game(Vehicle bike) {
        return new Game(bike);
    }

//    @Bean
//    public Game game(Vehicle bike) {
//        return new Game(bike);
//    }
}
