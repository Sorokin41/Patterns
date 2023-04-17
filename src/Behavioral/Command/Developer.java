package Behavioral.Command;

public class Developer{
    DeleteCommand deleteCommand;
    InsertCommand insertCommand;
    UpdateCommand updateCommand;
    SelectCommand selectCommand;

    public Developer(DeleteCommand deleteCommand, InsertCommand insertCommand, UpdateCommand updateCommand, SelectCommand selectCommand) {
        this.deleteCommand = deleteCommand;
        this.insertCommand = insertCommand;
        this.updateCommand = updateCommand;
        this.selectCommand = selectCommand;
    }

    public void insertRecord(){
        insertCommand.execute();
    }

    public void deleteRecord(){
        deleteCommand.execute();
    }

    public void updateRecord(){
        updateCommand.execute();
    }

    public void selectRecord(){
        selectCommand.execute();
    }

}
