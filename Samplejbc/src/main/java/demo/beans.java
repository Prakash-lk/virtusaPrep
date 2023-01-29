package demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import sample.Bike;
import sample.Car;
@Configuration
public class beans {
	@Bean(name="ad")
	public Car getCar(){
		return new Car();
	}
	@Bean
	public Bike getBike() {
		return new Bike();
	}
}
