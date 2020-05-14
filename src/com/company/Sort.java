package com.company;

import java.util.Random;


public class Sort {


    public static class BubbleSort
        {
            public static void bubble_sort( int[] a ) {
                // Your code goes here
                int n = a.length;
                int i;
                int j;
                for (i = 0; i < n - 1; i++)
                    for (j = 0; j < n - i - 1; j++)
                        swap(a, i, j);

            }


            public static void swap( int[] a , int i, int j )
            {
                // Your code goes here
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }


            public static void main( String[] args )
            {
                Random r = new Random();
                int[] arr = new int[5];
                int i;

                // Fill up the array with random numbers
                for ( i=0; i<arr.length; i++ )
                    arr[i] = 1 + r.nextInt(100);

                // Display it
                System.out.print("before: ");
                for ( i=0; i<arr.length; i++ )
                    System.out.print( arr[i] + " " );
                System.out.println();

                // Sort it
                bubble_sort( arr );

                // Display it again to confirm that it's sorted
                System.out.print("after : ");
                for ( i=0; i<arr.length; i++ )
                    System.out.print( arr[i] + " " );
                System.out.println();
        }
    }
}
