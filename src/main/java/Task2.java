import java.util.Scanner;

public class Task2
{
    private static final String TASKS_N = "\nЗАДАНИЕ 2\n";
    private static final String ENTER_NAME = "Введите имя:";
    private static final String NAME_VYACHESLAV = "Вячеслав";
    private static final String HELLO_VYACHESLAV = "Привет, Вячеслав";
    private static final String NO_SUCH_NAME = "Нет такого имени";

    public void task2()
    {
        System.out.println(TASKS_N);
        System.out.println(ENTER_NAME);

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        if (name.equals(NAME_VYACHESLAV))
        {
            System.out.println(HELLO_VYACHESLAV);
        }
        else
        {
            System.out.println(NO_SUCH_NAME);
        }
    }
}
