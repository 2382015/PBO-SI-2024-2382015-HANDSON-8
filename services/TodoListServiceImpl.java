package services;

import entitis.Todolist;
import repositories.TodoListRepository;

public class TodoListServiceImpl implements TodoListService {
    private final TodoListRepository todoListRepository;

    public TodoListServiceImpl(TodoListRepository todoListRepository) {
        this.todoListRepository = todoListRepository;
    }


    @Override
    public Todolist[] getTodolist() {
        return new Todolist[0];
    }

    @Override
    public void addTodolist(String todo) {

    }

    @Override
    public Boolean removeTodoList(Integer number) {
        return null;
    }

    @Override
    public Boolean editTodoList(Integer number, String todo) {
        return null;
    }
}