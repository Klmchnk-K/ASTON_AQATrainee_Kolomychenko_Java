import java.util.Scanner;

public class Task3
{
    private static final String TASKS_N = "\nЗАДАНИЕ 3\n";
    private static final String ENTER_NUMBERS = "Введите числовой массив:";
    private static final int DIVIDER = 3;

    public void task3()
    {
        System.out.println(TASKS_N);
        System.out.println(ENTER_NUMBERS);

        Scanner scanner = new Scanner(System.in);

        double number;

        while (scanner.hasNext())
        {
            number = scanner.nextDouble();

            if (number % DIVIDER == 0)
            {
                System.out.println((int)number);
            }
        }
    }
}
