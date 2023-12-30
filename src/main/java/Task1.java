import java.util.Scanner;

public class Task1
{
    private static final String TASKS_N = "\nЗАДАНИЕ 1\n";
    private static final String ENTER_NUMBER = "Введите число:";
    private static final String HELLO = "Привет";
    private static final int NUMBER = 7;

    public void task1()
    {
        System.out.println(TASKS_N);
        System.out.println(ENTER_NUMBER);

        Scanner scanner = new Scanner(System.in);

        double number = scanner.nextDouble();

        if (number > NUMBER)
        {
            System.out.println(HELLO);
        }
    }
}
