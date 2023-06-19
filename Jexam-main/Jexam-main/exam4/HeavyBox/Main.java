package Asem4.exam4.HeavyBox;
import java.util.function.Consumer;
public class Main {
    public static void main(String[] args) {
        HeavyBox box = new HeavyBox(50);
        Consumer<HeavyBox> shipment = b -> System.out.println("Отгрузили ящик с весом " + b.getWeight());
        Consumer<HeavyBox> delivery = b -> System.out.println("Отправляем ящик с весом " + b.getWeight());
        shipment.andThen(delivery).accept(box);
    }
}
