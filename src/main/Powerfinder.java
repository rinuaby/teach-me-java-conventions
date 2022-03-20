package powerpackage;

public class Powerfinder {
    public static int oF(int base, int power) {
        int res = 1;
        for (int i = 0; i<power; i++) {
            res*= base;
        }
        return res;
    }
}