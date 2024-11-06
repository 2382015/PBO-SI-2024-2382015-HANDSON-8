package repositories;

import entitis.Todolist;

public interface TodoListRepository {
    Todolist[] getAll();
    void add(Todolist todolist);
    Boolean remove(Integer id);
    Boolean edit(Todolist todolist);
}




