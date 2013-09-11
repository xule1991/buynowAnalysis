package designPattern;

public class MailSenderProducer implements Producer {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
