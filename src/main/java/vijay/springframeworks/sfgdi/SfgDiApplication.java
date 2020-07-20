package vijay.springframeworks.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import vijay.springframeworks.sfgdi.controller.ConstructoreInjectorController;
import vijay.springframeworks.sfgdi.controller.MyController;
import vijay.springframeworks.sfgdi.controller.PropertyInjectedController;
import vijay.springframeworks.sfgdi.controller.SetterInjectorController;

import java.util.Arrays;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		MyController controller = (MyController)ctx.getBean("myController");

		System.out.println(controller.sayHello());
		//System.out.println(.);
		//String [] names = ctx.getBeanDefinitionNames();
	//	ctx.
		Arrays.stream(ctx.getBeanDefinitionNames())
				.sorted()
				.forEach(e -> System.out.println("Bean Names   :  " + e));


		PropertyInjectedController ctlr = (PropertyInjectedController)ctx.getBean("propertyInjectedController");
		System.out.println(ctlr.getGreeting());

		SetterInjectorController sctlr = (SetterInjectorController)ctx.getBean("setterInjectorController");
		System.out.println(sctlr.getGreeting());

		ConstructoreInjectorController cctlr = (ConstructoreInjectorController)ctx.getBean("constructoreInjectorController");
		System.out.println(cctlr.getGreeting());
	}

}
