import java.util.Scanner;
import ru.netology.service.CustomsService;

public class CalculatorTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добрый день!");
        System.out.print("Введите цену товара (в руб.): ");
        int price = scanner.nextInt();

        System.out.print("Введите вес товара (в кг.): ");
        int weight = scanner.nextInt();

        int result = CustomsService.calc(price, weight);
        System.out.print("Размер пошлины (в руб.) составит: " + result);
    }
}
