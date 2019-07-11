public class Person {
    private String name;
    private Mobile mobile;

    public Person(){}

    public Person(String name, Mobile mobile) {
        this.name = name;
        this.mobile = mobile;
    }

    public void call(String message){
        this.mobile.call(message);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Mobile getMobile() {
        return mobile;
    }

    public void changeMobile(Mobile mobile) {
        this.mobile = mobile;
    }
}
