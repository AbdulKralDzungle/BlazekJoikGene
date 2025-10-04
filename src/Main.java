import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*
        JoukGenerator jg = new JoukGenerator();
        System.out.println(jg.newJoke());
         */
        for(int i = 0; i < 50; i++){
            JoukGeneratorMKII jgmkii = new JoukGeneratorMKII();
            System.out.println(jgmkii.generate());
        }
    }
}