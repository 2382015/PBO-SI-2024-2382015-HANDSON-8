package services;

import entitis.Todolist;

public interface TodoListService {
    Todolist[] getTodolist();
    void addTodolist(String todo);
    Boolean removeTodoList(Integer number);
    Boolean editTodoList(Integer number, String todo);
}
