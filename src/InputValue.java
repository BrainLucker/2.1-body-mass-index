import java.util.Scanner;

public class InputValue {
    Scanner console = new Scanner(System.in);
    public int keyboard(String parameter) {
        String msg;
        switch (parameter) { // Подготовка сообщения для запроса данных
            case "weight":
                msg = "Введите ваш вес в килограммах: ";
                break;
            case "height":
                msg = "Введите ваш рост в сантиметрах: ";
                break;
            default:
                msg = "Что-то пошло не так.";
                break;
        }
        int value = 0;
        boolean valueCheck = true;
        while (valueCheck) {
            System.out.print(msg);
            if (console.hasNextInt()) { // Проверка на ввод целого числа
                value = console.nextInt();
                if (value < 1 || value > 300) { // Проверка на ввод валидного значения
                    System.out.println("Недопустимое значение, попробуйте снова.");
                } else {
                    valueCheck = false; // Выход из цикла
                }
            } else {
                System.out.println("Пожалуйста, введите целое число.");
                console.next();
            }
        }
        return value;
    }

    public void end() { // Закрытие сканера
        console.close();
    }
}