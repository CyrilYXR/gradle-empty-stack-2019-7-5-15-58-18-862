public class IPhone extends Mobile {

    private final Integer MESSAGE_LENGTH_LIMIT = 20;

    @Override
    public void call(String message){
        if(message.length()>MESSAGE_LENGTH_LIMIT){
            System.out.println("<iPhone> Message cannot be sent");
            return;
        }
        System.out.print("<iPhone>");
        super.call(message);
    }
}
