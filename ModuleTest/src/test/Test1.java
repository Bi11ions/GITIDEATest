package test;

/**
 * @author wangsen
 * @create 2018-09-13 15:59
 */
public class Test1 {

    public static void main(String[] args) {
        getSumByPrimeNum(4);

    }

    public static int getSumByPrimeNum(int num) {
        int sum = 0;
        int[] primeArr = new int[100];
        int index = 0;

        for (int i = 2; i <= num; i++) {
            boolean flag = false;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if(i % j == 0) {
                    flag = true;
                }
            }
            if(!flag) {
                primeArr[index++] = i;
            }
        }

        for (int i = 0; i < index; i++) {
            for (int j = 0; j < index; j++) {
                if(primeArr[i] + primeArr[j] == num && primeArr[i] <= num/2) {
                    sum++;
                }
            }
        }

        return sum;
    }

}
