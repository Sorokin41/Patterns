package Structural.Adapter;

public class Client {
    public static void main(String[] args) {
        Database database = new AdapterJavaObjectToDatabase();
        database.insert();
        database.update();
        database.select();
        database.remove();
    }
}
