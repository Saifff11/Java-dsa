public class TowerHanoi {
    static int total = 3;
    public static void toh(char src, char dest, char aux, int n) {
        if(n == 0) return;
        toh(src, dest, aux, n-1);   // ist faith (choti disc source --> extra tower)
        System.out.println((total - n + 1)+ ". disc move from " +src+ " tower to " +dest+ " tower ");

        toh(aux, dest, src, n-1);
    }
    public static void main(String[] args) {
        toh('A', 'C', 'B', 3);
    }
}