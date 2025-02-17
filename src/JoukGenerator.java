import java.util.Random;

public class JoukGenerator {
    Random rn = new Random();
    String[] podsJm = new String[]{"flašky", "stole", "stůl", "LED dioda", "ANYONY", "anion", "rašek", "péro", "spikiball", "teta", "tety", "babička", "nábitek", "flammenwerfer", "noha", "ledvina", "ichtil", "ABDUL", "Démosténes Kreténes", "král", "džungle", "černoch"};
    String[] slovesa = new String[]{"sedí", "je", "chodí", "jí", "stojí"};
    String[] spojky = new String[]{"na", "pod", "v", "mozi", "a", "velde", "nad", "blízko", "s", "u",};
    String[] přJm = new String[]{"velmi", "1,5", "černý", "humorný", "svítivý", "sigma", "Led", "tlustý", "málo", "holohlavé",};

    public String newJoke() {
        String s = "";
        for (int i = 0; i < rn.nextInt(10); i++) {
            s += switch (rn.nextInt(5)) {
                default -> podsJm[rn.nextInt(podsJm.length)] +
                        slovesa[rn.nextInt(slovesa.length)] +
                        spojky[rn.nextInt(spojky.length)] +
                        podsJm[rn.nextInt(podsJm.length)];
            };
        }
        return s;
    }
}
