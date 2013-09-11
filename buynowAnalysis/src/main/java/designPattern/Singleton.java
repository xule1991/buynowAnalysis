package designPattern;

public class Singleton {
    private static Singleton instance = null;
    private Singleton(){
    }
    public static synchronized Singleton getInstance(){
        if (instance == null){
            return new Singleton();
        }else {
            return instance;
        }
    }

}
