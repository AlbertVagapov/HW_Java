public class t1 {
    public static void main(String[] args) {
        System.out.println(buildString(12, 'C', 'D'));
    }

    private static String buildString(int n, char first, char second) {

        String N = new String();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                N += first;
            } else {
                N += second;
            }
        }
        return N;
    }

}