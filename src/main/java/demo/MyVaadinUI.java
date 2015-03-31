package demo;

import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

@SpringUI
public class MyVaadinUI extends UI {

    private HelloService helloService;

    public MyVaadinUI(HelloService helloService) {

        this.helloService = helloService;
    }

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        //setContent(new Label("Hello! I'm the root UI!"));

        String hello = helloService.sayHello();

        setContent(new Label(hello));
    }
}
