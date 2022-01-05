public class Main {
    public static void main(String[] args) {
        // Ввод данных в консоль с клавиатуры
        InputValue input = new InputValue();
        int weight = input.keyboard("weight");
        int height = input.keyboard("height");
        input.end();
        // Подсчет и вывод индекса массы тела
        BmiService service = new BmiService();
        float index = service.calculate(weight, height);
        System.out.println("Ваш индекс массы тела равен: " + index);
    }
}