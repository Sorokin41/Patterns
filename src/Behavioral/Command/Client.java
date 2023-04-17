package Behavioral.Command;

public class Client {
    public static void main(String[] args) {
        Database database = new Database();
        Developer developer = new Developer(
                new DeleteCommand(database),
                new InsertCommand(database),
                new UpdateCommand(database),
                new SelectCommand(database));

        developer.insertRecord();
        developer.updateRecord();
        developer.deleteRecord();
        developer.selectRecord();
        developer.updateRecord();
        developer.deleteRecord();
    }

}
