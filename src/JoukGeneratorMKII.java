import java.util.HashMap;
import java.util.Random;

public class JoukGeneratorMKII {
    private HashMap<Integer, Generator> generator;

    private void initialize() {
        generator = new HashMap<>();
        generator.put(0, new PodMuzsky());
        generator.put(1, new RodZensky());
        generator.put(2, new RodStredni());
        generator.put(3, new Slovesa());
        generator.put(4, new Spojky());
        generator.put(5, new Rod2pad());
        generator.put(6, new Pad3());
        generator.put(7, new Pad4());
        generator.put(8, new Zbitek());
        generator.put(9, new PridJmena());
    }

    public String generate() {
        initialize();
        Random rn = new Random();
        String s = "";
        int next = switch (rn.nextInt(4)) {
            case 0 -> 0;
            case 1 -> 1;
            case 2 -> 2;
            case 3 -> 9;
            default -> 2;
        };
        do {
            s = s + generator.get(next).generate() + " ";
            next = generator.get(next).nextWord();
        } while (next != -1);
        return s;
    }

}
