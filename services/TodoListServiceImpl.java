package services;

import entitis.Todolist;
import repositories.TodoListRepository;
import repositories.TodoListRepositoryImpl;

public class TodoListServiceImpl implements TodoListService {
    private final TodoListRepository todoListRepository;

    public TodoListRepositoryImpl(final TodoListRepository todoListRepository) {
        this.todoListRepository = todoListRepository
    }

    @Override
    public Todolist[] getTodoList() {
        return todoListRepository.getALL();
    }

    @Override
    public void addTodoList(final String todo) {
      if (todo.isEmpty() || todo.isBlank()) {
          System.out.println("Masukkan todo dengan benar");
          return;
      }

      TodoList todoList = new Todolist();
      todoList.setTodo(todo);
      todoListRepository.add(todoList)



    @Override
    public Boolean removeTodoList(final Integer number) {
          return todoListRepository.remove(id:number)
        }

        @Override
        public Boolean editTodoList(final Integer number, final String todo) {
          Todolist todolist = new Todolist();

        }