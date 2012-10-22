package li.test.spring;


public class TestBean {
    private CustomerService service;

    public CustomerService getService() {
        return service;
    }

    public void setService(CustomerService service) {
        this.service = service;
    }

    public void sayHello() {
        System.out.println(service.sayHello());
    }

}
