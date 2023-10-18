public class Singleton {
    private static Singleton singletonInstance = null;
    public String myString;
    // make constructor
    private Singleton(){
        this.myString = "String part of Singleton class";
    }

    // Thread safe singleton
    public static synchronized Singleton getInstance(){
        // synchronized: tat cac thread(luong) cua cac ung dung khac phai doi cho den khi method thuc thi xong
        if(Singleton.singletonInstance == null){
            singletonInstance = new Singleton();
        }
        return singletonInstance;
    }

    //Lazy initialization singleton
    public static Singleton myGetInstance(){
        if(Singleton.singletonInstance == null){
            singletonInstance = new Singleton();
        }
        return singletonInstance;
    }
}
