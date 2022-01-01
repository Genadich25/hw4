package ru.lookBag;

public class Main {

    public static void main(String[] args) {

    //Первая задача

        int[] intArray = new int[] {1, 2, 3};
        double[] doubleArray = new double[] {1.57, 7.654, 9.986};
        int[] coolArray = new int[] {25, 34, 555, -2, 668, -61};

        int lastIndexIntArray = intArray.length - 1;
        int lastIndexDoubleArray = doubleArray.length - 1;
        int lastIndexCoolArray = coolArray.length - 1;

    //Вторая задача

        for (int i = 0; i < lastIndexIntArray + 1; i++) {
            if (i < lastIndexIntArray ) {
                System.out.print(intArray[i] + ", ");
            } else {
                System.out.println(intArray[i]);
            }
        }

        for (int i = 0; i < lastIndexDoubleArray + 1; i++) {
            if (i < lastIndexDoubleArray) {
                System.out.print(doubleArray[i] + ", ");
            } else {
                System.out.println(doubleArray[i]);
            }
        }

        for (int i = 0; i < lastIndexCoolArray + 1; i++) {
            if (i < lastIndexCoolArray) {
                System.out.print(coolArray[i] + ", ");
            } else {
                System.out.println(coolArray[i]);
            }
        }

        System.out.println();

    //Третья задача

        for (int i = lastIndexIntArray; i >= 0; i--) {
            if (i > 0) {
                System.out.print(intArray[i] + ", ");
            } else {
                System.out.println(intArray[i]);
            }
        }

        for (int i = lastIndexDoubleArray; i >= 0; i--) {
            if (i > 0) {
                System.out.print(doubleArray[i] + ", ");
            } else {
                System.out.println(doubleArray[i]);
            }
        }

        for (int i = lastIndexCoolArray; i >= 0; i--) {
            if (i > 0) {
                System.out.print(coolArray[i] + ", ");
            } else {
                System.out.println(coolArray[i]);
            }
        }

        System.out.println();

    //Четвертая задача

        for (int i = 0; i < lastIndexIntArray + 1; i++) {
            if (i < lastIndexIntArray ) {
                if (intArray[i] % 2 == 1 || intArray[i] % 2 == -1)
                    intArray[i]++;
                System.out.print(intArray[i] + ", ");
            } else {
                if (intArray[i] % 2 == 1 || intArray[i] % 2 == -1)
                    intArray[i]++;
                System.out.println(intArray[i]);
            }
        }

        for (int i = 0; i < lastIndexCoolArray + 1; i++) {
            if (i < lastIndexCoolArray) {
                if (coolArray[i] % 2 == 1 || coolArray[i] % 2 == -1)
                    coolArray[i]++;
                System.out.print(coolArray[i] + ", ");
            } else {
                if (coolArray[i] % 2 == 1 || coolArray[i] % 2 == -1)
                    coolArray[i]++;
                System.out.println(coolArray[i]);
            }
        }
    }
}
