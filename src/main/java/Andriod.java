public class Andriod extends Mobile {
    private final Integer MESSAGE_LENGTH_LIMIT = 25;

    @Override
    public void call(String message){
        if(message.length()>MESSAGE_LENGTH_LIMIT){
            System.out.println("<Andriod> Message cannot be sent");
            return;
        }
        System.out.print("<Andriod>");
        super.call(message);
    }
}
