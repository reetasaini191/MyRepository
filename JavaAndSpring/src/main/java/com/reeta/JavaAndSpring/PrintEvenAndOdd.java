package com.reeta.basics;

public class PrintEvenAndOdd {
    public static void main(String[] args) {

    }

    public static void printEvenAndOdd(int[] arr) {


        int[] oddArr = new int[arr.length];
        int[] evenArr = new int[arr.length];
        // iterate over all element

        for (int elem : arr) {

            // Check even and odd
            if (elem % 2 == 0) {
                System.out.println("This is Even:" + elem);
                // add in even array or list
            } else {
                System.out.println("THis is odd:" + elem);
                // add in odd arr or list
            }

            // merge boht arr in 1 y onr list

            // we want oadd and even left side odd and right side even above logic cna be used
            // in place of printing we can put them in an array each and finally adding all in one array
        }

        // Or usign for
        for (int i = 0; i < arr.length; i++) {
            int elem = arr[i];
//                Check even and odd
            if (elem % 2 == 0) {
                System.out.println("This is Even:" + elem);
            } else {
                System.out.println("THis is odd:" + elem);
            }
        }

        // or using while. We have diff tool to do all diff type of stuff
        //in java. We just have to sue our brain
        int i=0;
        int arrLength = arr.length;

        while (i < arrLength){
            int elem = arr[i];
//                Check even and odd
            if (elem % 2 == 0) {
                System.out.println("This is Even:" + elem);
            } else {
                System.out.println("THis is odd:" + elem);
            }

            // As while dont autopmatically increase i , i have to increase it.
            i++;
        }


    }
}
