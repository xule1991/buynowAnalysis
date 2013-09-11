package designPattern;

public class SmsSenderProducer implements Producer {
    @Override
    public Sender produce() {
        return new SmsSender();
    }


    public static void main(String[] args) {
        Producer producer = new SmsSenderProducer();
        Sender sender = producer.produce();
        sender.send();

    }
}
