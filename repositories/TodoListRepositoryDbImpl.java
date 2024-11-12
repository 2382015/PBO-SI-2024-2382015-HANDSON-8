package repositories;

import config.Database;
import entitis.Todolist;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TodoListRepositoryDbImpl implements TodoListRepository {
    private final Database database;

    public TodoListRepositoryDbImpl(Database database) {
        this.database = database;
    }


    @Override
    public Todolist[] getAll() {
        Connection connection = database.getConnection();
        String sqlStatement = "SELECT * FROM todos";
        List<Todolist> todolists = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlStatement);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Todolist todolist = new Todolist();
                int id = resultSet.getInt(1);
                String todo = resultSet.getString(2);
                todolist.setId(id);
                todolist.setTodo(todo);
                todolists.add(todolist);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return todolists.toArray(Todolist[]::new);
    }

    @Override
    public void add(Todolist todolist) {

    }

    @Override
    public Boolean remove(Integer id) {
        return null;
    }

    @Override
    public Boolean edit(Todolist todolist) {
        return null;
    }
}
