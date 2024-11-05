package services;

import entitis.Todolist;

public interface TodoListService {
    TodoList[] getTodolist();
    void addTodolist(String todo);
    Boolean removeList(Integer number);

    Boolean editTodoList(Integer number, String todo);
}
