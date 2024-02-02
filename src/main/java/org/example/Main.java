package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("1. Реализуйте методы, max(x,y) - для целых, вещественных чисел, и для строк (в \n" +
                "случае строк - возвращает самую длинную)");
        int x = 44;
        int y = 23;
        int z = max(x, y);
        System.out.println("Сумма x + y = " + z);

        double fractionX = Math.PI;
        double fractionY = 2 * Math.PI;
        double fractionZ = max(fractionX, fractionY);
        System.out.println("Сумма трех Рi = " + fractionZ);

        String strX = "Перегрузка";
        String strY = "Методов";
        int strZ = max(strX, strY);
        System.out.println("Длина строк = " + strZ);

        ///////////////////
        System.out.println("2. Реализуйте методы and(boolean x, boolean y), and(boolean x, int y), and(int x, \n" +
                "boolean y), который будет возвращать логическое И. Целые числа равные 0 \n" +
                "трактовать как false, остальные true.");
        boolean xB = true;
        boolean yB = true;
        boolean zB = and(xB, yB);
        System.out.println("Результат xB + yB = " + zB);

            int i = 77;
            boolean b = true;
            boolean c = and(i,b);
        System.out.println(c);

        boolean b1 = true;
        int i1 = 12;
        boolean c1 = and(b1,i1);
        System.out.println(c1);

        /////////////////////
        System.out.println("3. Реализуйте методы join(String s1, String s2), join(String s1, String s2, String s3), …. \n" +
                  "join(String s1, String s2, String s3, String s4) - которые склеивают строки");

    String s1 = "1 Однажды";
    String s2 = " в студеную";
    String s1s2  =  gluingString(s1, s2);
    System.out.println(s1s2);
    ///////////////////////
    String s21 = "2 Однажды";
    String s22 = "в студеную";
    String s23 = " зимнюю";
    String s21s22s23 = gluingString(s21, s22, s23);
        System.out.println(s21s22s23);
    //////////////////////
    String s31 = "3 Однажды";
    String s32 = " в студеную";
    String s33 = " зимнюю";
    String s34 = " пору";
    String s31s32s33s34 = gluingString(s31, s32, s33, s34);
    System.out.println(s31s32s33s34);


        System.out.println("4. Реализуйте методы merge(int[] array1, int[] array2), merge(int[] array1, int[] \n" +
                "array2,int[] array3), merge(int[] array1, int[] array2, int[] array3, int[] array4) -\n" +
                "который возвращает новый массив, в котором он соединяет все предыдущие \n" +
                "(было 3 массива по 10 элементов, станет массив с 20 элементам");
        int[] array1 = new int[]{1, 2, 3, 4, 5};
        int[] array2 = new int[]{5, 7, 8, 9, 10};
        int[] arrayResult = merge(array1, array2);
        int counter = 0;
        for (int j : arrayResult) {
            counter++;
            System.out.print("[" + counter + " : " + j + "], ");
        }
        System.out.println("\n");

        int[] array21 = new int[]{1, 2, 3, 4, 5};
        int[] array22 = new int[]{6, 7, 8, 9, 10};
        int[] array23 = new int[]{11, 12, 13, 14, 15};
        int[] arrayResult2 = merge(array21, array22, array23);
        int counter2 = 0;
        for (int j : arrayResult2) {
            counter2++;
            System.out.print("[" + counter2 + " : " + j + "], ");
        }
        System.out.println("\n");

        int[] array31 = new int[]{1, 2, 3, 4, 5};
        int[] array32 = new int[]{6, 7, 8, 9, 10};
        int[] array33 = new int[]{11, 12, 13, 14, 15};
        int[] array34 = new int[]{16, 17, 18, 19, 20};
        int[] arrayResult3 = merge(array31, array32, array33, array34);
        int counter3 = 0;
        for (int j : arrayResult3) {
            counter3++;
            System.out.print("[" + counter3 + " : " + j + "], ");
        }

    }


    private static int[] merge(int[] array31, int[] array32, int[]array33, int[]array34) {
        int[] arrayResult3 = new int[array31.length + array32.length + array33.length + array34.length];
        int index3 = 0;
        for (int item : array31) {
            arrayResult3[index3++] = item;}
        for (int item : array32) {
            arrayResult3[index3++] = item;}
        for (int item : array33) {
            arrayResult3[index3++] = item;}
        for (int item : array34) {
            arrayResult3[index3++] = item;}
        return arrayResult3;
    }
    private static int[] merge(int[] array21, int[] array22, int[]array23) {
        int[] arrayResult2 = new int[array21.length + array22.length + array23.length];
        int index2 = 0;
        for (int item: array21){
            arrayResult2[index2++] = item;}
        for (int item: array22){
            arrayResult2[index2++] = item;}
        for (int item: array23){
            arrayResult2[index2++] = item;}
        return arrayResult2;
    }

        private static int[] merge(int[] array1, int[] array2) {
            int[] arrayResult = new int[array1.length + array2.length];
            int index = 0;
            for (int item: array1){
                arrayResult[index++] = item;}
            for (int item: array2){
                arrayResult[index++] = item;}
            return arrayResult;
        }


    private static String gluingString(String s21, String s22, String s23) {
        return s21 + s22 + s23;
    }
    private static String gluingString(String s31, String s32, String s33, String s34) {
        return s31 + s32 + s33 + s34;}
    private static String gluingString(String s1, String s2) {
        return s1 + s2;
    }


    static boolean and(boolean b1, int i1) {
        return and(i1 != 0, b1);
    }
    static boolean and(int i, boolean b) {return and(i != 0, b);}
    private static boolean and(boolean xB, boolean yB) {
        boolean zB = xB == yB;
        return zB;}


    private static double max(double fractionX, double fractionY) {
      double fractionZ = fractionX + fractionY;
      return fractionZ;}
    private static int max(int x, int y) {
        int z = x + y;
        return z;}
    private static int max(String strX, String strY) {
        int strZ = strX.length() + strY.length();
        return strZ;}


}