package javabasedconfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext ctx = 
      new AnnotationConfigApplicationContext(HelloWorldConfig.class);
   
      HelloWorld h = ctx.getBean(HelloWorld.class);

      h.setMessage("Hello World!");
      h.getMessage();
   }
}
