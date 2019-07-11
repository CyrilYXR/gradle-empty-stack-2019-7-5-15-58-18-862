public class IPhoneRobot {
    private String name;
    private IPhone iPhone;

    public IPhoneRobot(String name, IPhone iPhone) {
        this.iPhone = iPhone;
    }

    public void call(String message){
        this.iPhone.call(message);
    }
}
