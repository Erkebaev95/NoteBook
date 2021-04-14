import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NoteBook {
    private static List<String> list = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        before:
        while (true) {
            System.out.println("Выберите действие: " +
                    "\n1. Добавить задачу" +
                    "\n2. Вывести список задач" +
                    "\n3. Удалить задачу " +
                    "\n0. Выход ");
            Scanner scanner = new Scanner(System.in);
            int task = scanner.nextInt();
            switch (task) {
                case 1:
                    addTask(list);
                    break;
                case 2:
                    taskList();
                    //System.out.println(list);
                    break;
                case 3:
                    removeTask();
                    break;
                case 0:
                    break before;
                default:
                    System.out.println("Попробуйте ещё раз");
                    break;
            }
        }
    }

    public static void addTask(List<String> list) {
        while (true) {
            System.out.println("Введите название задачи (для завершение введите end)");
            Scanner scanner = new Scanner(System.in);
            String task = scanner.next();
            if ("end".equalsIgnoreCase(task)) {
                break;
            } else {
                list.add(task);
            }
        }
    }

    private static void taskList() {
        System.out.println("Список задач:");
        for(int i = 0; i < list.size(); i++){
            System.out.println(i + 1 + ". " + list.get(i));
        }
    }
    private static void removeTask() {
        System.out.println("Введите номер задачи для удаления: ");
        int position = Integer.parseInt(scanner.nextLine());
        list.remove(position - 1);
    }
}