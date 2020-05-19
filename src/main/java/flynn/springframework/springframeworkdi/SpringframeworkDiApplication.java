package flynn.springframework.springframeworkdi;

import flynn.springframework.springframeworkdi.controllers.ConstructorInjectedController;
import flynn.springframework.springframeworkdi.controllers.MyController;
import flynn.springframework.springframeworkdi.controllers.PropertyInjectedController;
import flynn.springframework.springframeworkdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringframeworkDiApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(SpringframeworkDiApplication.class, args);

        MyController myController = (MyController) ctx.getBean("myController");

        System.out.println("--------- Primary Bean");
        System.out.println(myController.sayHello());

        System.out.println("--------- Property based");

        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("--------- Setter based");

        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");

        System.out.println(setterInjectedController.getGreeting());

        System.out.println("---------- Constructor based");

        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

        System.out.println(constructorInjectedController.getGreeting());
    }

}
