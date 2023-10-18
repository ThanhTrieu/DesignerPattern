public class SingletonDP {
    // create an object of SingletonDP
    private static SingletonDP instance = new SingletonDP();
    // make the constructor private, so that this class cannot instantiated
    private SingletonDP(){}

    // Get only object available
    public static SingletonDP getInstance(){
        return instance;
    }

    // create method test
    public void showMessage(){
        System.out.println(" Singleton Designer pattern");
    }

}
