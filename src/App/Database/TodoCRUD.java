package App.Database;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/*
* A static class that will be used to execute all the queries that refers to the app
*       -Create a Todo
*       -Read a Todo by its ID
*       -Modify and update a Todo by providing its ID
*       -Delete a Todo by its ID
* Needs a Database connection
*/
public class TodoCRUD {
    private final Connection connection = ConnectionDB.getConnectionInstance();

    public static List<Todo> allTodos(){
        return new ArrayList<Todo>();
    }

    public static int createTodo(/*TODO*/){
        return 0;
    }

    public static int updateTodo(/*TODO.id, TODO.infos*/){
        return 0;
    }

    public static int deleteTodo(int id){
        return 0;
    }
}
