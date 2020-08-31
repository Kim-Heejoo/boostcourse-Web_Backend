package kr.or.connect.javaConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextExam03 {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		   
//		Car car = (Car)ac.getBean("car");
		Car car = (Car)ac.getBean(Car.class);
		car.run();
		
		
	}
}