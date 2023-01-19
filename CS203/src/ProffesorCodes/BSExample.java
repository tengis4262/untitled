package ProffesorCodes;

public class BSExample {
    public static void main(String[] args) {
        int[] a= new int[]{};

        int l = 0; //start index
        int r = a.length - 1; // last index
        int target = 3;
        int answer = -1;
        while (l <= r) {// r < l stops
            int m = ( l + r) / 2;
            if (target == a[m]) {
                answer = m;
                break;
            }
            if (a[m] < target) l = m + 1;
            else r = m - 1;
        }
    }
}
