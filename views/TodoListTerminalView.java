package views;

import entitis.Todolist;
import services.TodoListService;
import services.TodoListServiceImpl;

public class TodoListTerminalView implements TodoListView {
    public static Scanner scanner = new Scanner(System.in);
    private final TodoListService todoListService;

    public TodoListTerminalView(final TodoListService todoListService) {
        this.todoListService = todoListService;
    }

    public static String input(String info) {
        System.out.print(info + " : ");
        var data = scanner.nextLine();
        return data;
    }

    public static void showTodoList() {
        System.out.println("TODO LIST");
        Todolist[] todos = TodoListService,getTodoList();
        for (var i = 0; i < todos.length; i++) {
            var todo = todos[i];
            if (todo != null) {
                System.out.println((i + 1) + ". " + todo.getTodo());
            }
        }
    }


    public static void showMainMenu() {
        // infinite loop so the program will always run
        boolean isRunning = true;
        while (isRunning) {
            showTodoList();
            System.out.println("MENU : ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("3. Edit");
            System.out.println("4. Keluar");
            // input untuk menerima input dari user
            String selectedMenu = input("Pilih");
            public static void showTodoList() {
                System.out.println("TODO LIST");
                for (var i = 0; i < todos.length; i++) {
                    var todo = todos[i];
                    if (todo != null) {
                        System.out.println((i + 1) + ". " + todo);
                    }
                }
            }
            switch (selectedMenu) {
                case "1":
                    showMenuAddTodoList();
                    break;
                case "2":
                    showMenuRemoveTodoList();
                    break;
                case "3":
                    showMenuEditTodoList();
                    break;

                case "4":
                    isRunning = false;
                    break;
                default:
                    System.out.println("Pilih menu dengan benar");
            }
        }
    }
    public static void showMenuAddTodoList() {
        System.out.println("MENAMBAH TODO LIST");
        var todo = input("Todo (x jika batal)");
        if (todo.equals("x")) {
            // batal
        } else {
            addTodoList(todo);
        }
    }

    @Override
    public void run() {
        showMainMenu();
    }
}

