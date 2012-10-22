package li.test.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

    public static void main(String[] args) {
        // create the default Spring container, and read the bean configured in
        // the applicationContext.xml
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        // get the object by the method TestBean#getService
        TestBean test = (TestBean) context.getBean("testBean");
        test.sayHello();
    }

}
