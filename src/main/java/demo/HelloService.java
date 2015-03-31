package demo;

import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.UIScope;

@SpringComponent
@UIScope
public class HelloService {

    public String sayHello() {
        return "Hello world!";
    }
}
