import java.util.Scanner;

public class Task3
{
    private static final String TASKS_N = "\nЗАДАНИЕ 3\n";
    private static final String ENTER_NUMBERS = "Введите числа через пробел:";
    private static final int DIVIDER = 3;

    public void task3()
    {
        System.out.println(TASKS_N);
        System.out.println(ENTER_NUMBERS);

        Scanner scanner = new Scanner(System.in);

        String[] enteredNumbers = scanner.nextLine().split(" ");

        for (String e: enteredNumbers)
        {
            double currentNumber = Double.parseDouble(e);

            if (currentNumber % DIVIDER == 0)
            {
                System.out.print((int)currentNumber + " ");
            }
        }
    }
}