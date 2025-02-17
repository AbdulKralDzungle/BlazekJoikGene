import java.util.Random;

public class JoukGenerator {
    private Random rn = new Random();
    private String[] podsJm = new String[]{"flašky", "stole", "stůl", "LED dioda", "ANYONY", "anion", "rašek", "péro", "spikiball", "teta", "tety", "babička", "nábitek", "flammenwerfer", "noha", "ledvina", "ichtil", "ABDUL", "Démosténes Kreténes", "král", "džungle", "černoch"};
    private String[] slovesa = new String[]{"sedí", "je", "chodí", "jí", "stojí"};
    private String[] spojky = new String[]{"na", "pod", "v", "mozi", "a", "velde", "nad", "blízko", "s", "u",};
    private String[] přJm = new String[]{"velmi", "1,5", "103,5", "černý", "humorný", "svítivý", "sigma", "Led", "tlustý", "málo", "holohlavé",};

    public String newJoke() {
        String s = "";
        for (int i = 0; i < 9999; i++) {

            s += switch (rn.nextInt(6)) {
                default -> podsJm[rn.nextInt(podsJm.length)] + " " +
                        slovesa[rn.nextInt(slovesa.length)] + " " +
                        spojky[rn.nextInt(spojky.length)] + " " +
                        podsJm[rn.nextInt(podsJm.length)];
                case 0 -> podsJm[rn.nextInt(podsJm.length)] + " " +
                        slovesa[rn.nextInt(slovesa.length)] + " " +
                        spojky[rn.nextInt(spojky.length)] + " " +
                        podsJm[rn.nextInt(podsJm.length)] + ".\n ";
                case 1 -> podsJm[rn.nextInt(podsJm.length)] + ".\n ";
                case 2 -> podsJm[rn.nextInt(podsJm.length)] + " " +
                        slovesa[rn.nextInt(slovesa.length)] + " " +
                        přJm[rn.nextInt(přJm.length)] + " " +
                        spojky[rn.nextInt(spojky.length)] + " " +
                        podsJm[rn.nextInt(podsJm.length)] + ".\n ";
                case 3 -> přJm[rn.nextInt(přJm.length)] + " " +
                        podsJm[rn.nextInt(podsJm.length)] + " " +
                        slovesa[rn.nextInt(slovesa.length)] + " " +
                        přJm[rn.nextInt(přJm.length)] + " " +
                        spojky[rn.nextInt(spojky.length)] + " " +
                        přJm[rn.nextInt(přJm.length)] + " " +
                        podsJm[rn.nextInt(podsJm.length)] + ".\n ";
                case 4 -> přJm[rn.nextInt(přJm.length)] + " " +
                        podsJm[rn.nextInt(podsJm.length)] + " " +
                        slovesa[rn.nextInt(slovesa.length)] + " " +
                        přJm[rn.nextInt(přJm.length)] + " " +
                        spojky[rn.nextInt(spojky.length)] + " " +
                        podsJm[rn.nextInt(podsJm.length)] + " " +
                        přJm[rn.nextInt(přJm.length)] + " " +
                        slovesa[rn.nextInt(slovesa.length)] + " " +
                        přJm[rn.nextInt(přJm.length)] + " " +
                        spojky[rn.nextInt(spojky.length)] + " " +
                        podsJm[rn.nextInt(podsJm.length)] + ".\n ";
                case 5 -> přJm[rn.nextInt(přJm.length)] + " " +
                        podsJm[rn.nextInt(podsJm.length)] + " " +
                        slovesa[rn.nextInt(slovesa.length)] + " " +
                        přJm[rn.nextInt(přJm.length)] + " " +
                        spojky[rn.nextInt(spojky.length)] + " " +
                        slovesa[rn.nextInt(slovesa.length)] + " " +
                        přJm[rn.nextInt(přJm.length)] + " " +
                        spojky[rn.nextInt(spojky.length)] + " " +
                        podsJm[rn.nextInt(podsJm.length)] + " " +
                        přJm[rn.nextInt(přJm.length)] + " " +
                        slovesa[rn.nextInt(slovesa.length)] + " " +
                        přJm[rn.nextInt(přJm.length)] + " " +
                        spojky[rn.nextInt(spojky.length)] + " " +
                        podsJm[rn.nextInt(podsJm.length)] + " " +
                        přJm[rn.nextInt(přJm.length)] + " " +
                        slovesa[rn.nextInt(slovesa.length)] + " " +
                        slovesa[rn.nextInt(slovesa.length)] + " " +
                        přJm[rn.nextInt(přJm.length)] + " " +
                        spojky[rn.nextInt(spojky.length)] + " " +
                        slovesa[rn.nextInt(slovesa.length)] + " " +
                        přJm[rn.nextInt(přJm.length)] + " " +
                        spojky[rn.nextInt(spojky.length)] + " " +
                        podsJm[rn.nextInt(podsJm.length)] + " " +
                        přJm[rn.nextInt(přJm.length)] + " " +
                        přJm[rn.nextInt(přJm.length)] + " " +
                        spojky[rn.nextInt(spojky.length)] + " " +
                        podsJm[rn.nextInt(podsJm.length)] + ".\n ";
            };
        }
        return s;
    }
}
