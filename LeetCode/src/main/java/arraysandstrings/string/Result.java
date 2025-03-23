package arraysandstrings.string;

public class Result {
    public static int consecutive(long num) {
        int count = 0;
        for (int k = 1; ; k++) {
            num -= k;
            if(k == 1){
                continue;
            }
            if (num < 0) break;

            long sum = num % k;
            if (num % k == 0) count++;
        }

        return count;
       // int sum = 0;
        /*for (int count = 1; count * (count + 1) < 2 * num; count++) {
            int help = count * (count + 1);
            long help2 = 2 * num;
            float a = (float) ((1.0 * num-(count * (count + 1)) / 2) / (count + 1));
            if (a-(int)a == 0.0)
                sum++;
        }*/
       // return sum;
    }

    public static int consecutive2(long num) {
        int count = 1;
        int result = 0;
        while ((num - count) >= 0) {
            num -= count;
            if (count == 1) {
                count++;
                continue;
            }

            long sum = num % count;
            if (num % count == 0) {
                result++;
            }
            count++;
        }

        return result;
    }
}
