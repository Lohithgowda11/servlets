package springioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class CarTester 
{
	public static void main(String[] args) 
	{
		
//		ClassPathResource resource = new ClassPathResource("springioc/NewFile.xml");
//		BeanFactory factory = new XmlBeanFactory(resource);
//		
//		Car car = (Car) factory.getBean("car");
//		System.out.println(car);
//		
//		Bike bike = (Bike) factory.getBean("bike");
//		System.out.println(bike);
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("springioc/NewFile.xml");
//		Car car = (Car) context.getBean("car");
//		System.out.println(car);
//		
//		Bike bike = (Bike) context.getBean("bike");
//		System.out.println(bike);
		
//		ClassPathResource resource = new ClassPathResource("springioc/NewFile.xml");
//		BeanFactory factory = new XmlBeanFactory(resource);
//		factory.getBean("car");
//		factory.getBean("bike");
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springioc/NewFile.xml");
		Car car = (Car) context.getBean("car");
		System.out.println(car);
		
		Bike bike=(Bike) context.getBean("bike");
		System.out.println(bike);
		
	}

}
