package designPattern;

public class SenderFactory {
    public Sender produce(String type) {
        if("mail".equals(type))
            return new MailSender();
        if("sms".equals(type))
            return new SmsSender();
        else return null;
    }

    public static void main (String[] args) {
        SenderFactory senderFactory = new SenderFactory();
        Sender sender = senderFactory.produce("mail");
        sender.send();
    }
}
