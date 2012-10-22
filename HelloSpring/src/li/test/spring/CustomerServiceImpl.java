package li.test.spring;

public class CustomerServiceImpl implements CustomerService {

    @Override
    public String sayHello() {
        return "Hello Spring! This is " + this.getClass().getName();
    }

}
