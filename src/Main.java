import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int weight = 1, height = 1;
        boolean weightCheck = true, heightCheck = true;
        BmiService service = new BmiService();
        Scanner console = new Scanner(System.in);
        // Ввод веса с клавиатуры
        while (weightCheck) {
            System.out.print("Введите ваш вес в килограммах: ");
            if (console.hasNextInt()) {
                weight = console.nextInt();
                if (weight < 1 || weight > 300) {
                    System.out.println("Недопустимое значение, попробуйте снова.");
                } else {
                    weightCheck = false;
                }
            } else {
                System.out.println("Пожалуйста, введите целое цисло.");
                console.next();
            }
        }
        // Ввод роста с клавиатуры
        while (heightCheck) {
            System.out.print("Введите ваш рост в сантиметрах: ");
            if (console.hasNextInt()) {
                height = console.nextInt();
                if (height < 1 || height > 300) {
                    System.out.println("Недопустимое значение, попробуйте снова.");
                } else {
                    heightCheck = false;
                }
            } else {
                System.out.println("Пожалуйста, введите целое цисло.");
                console.next();
            }
        }
        console.close();
        // Подсчет и вывод индекса массы тела
        float index = service.calculate(weight, height);
        System.out.println("Ваш индекс массы тела равен : " + index);
    }
}