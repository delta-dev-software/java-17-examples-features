import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class RandomExample {
    public static void main(String[] args) {
        RandomGenerator rng = RandomGeneratorFactory.of("Xoshiro256PlusPlus").create();

        // Generate random numbers
        System.out.println("Random int: " + rng.nextInt());
        System.out.println("Random double: " + rng.nextDouble());
    }
}
