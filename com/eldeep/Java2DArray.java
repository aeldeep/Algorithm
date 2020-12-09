package com.eldeep;

import java.util.Scanner;

public class Java2DArray {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        int sum=0 ;
        int result=-1000;
        for (int i=0; i<4;i++)
        {
            for (int k =0;k<4;k++)
            {
                if (arr[i][k]>-10&& arr[i][k]<10&&arr[i][k+1]>-10&& arr[i][k+1]<10&&arr[i][k+2]>-10&& arr[i][k+2]<10&&arr[i+1][k+1]>-10&& arr[i+1][k+1]<10&&arr[i+2][k]>-10&& arr[i+2][k]<10&&arr[i+2][k+1]>-10&& arr[i+2][k+1]<10&&arr[i+2][k+2]>-10&& arr[i+2][k+2]<10){
                    sum = arr[i][k]+arr[i][k+1]+arr[i][k+2]+arr[i+1][k+1]+arr[i+2][k]+arr[i+2][k+1]+arr[i+2][k+2];
                }else{}

                //System.out.println("Sum --> "+sum);
            //     System.out.println(" i ==> "+i);
                if (sum>=result)
                {
                	result=sum;
                }
            }

        }
        System.out.println(result);
        scanner.close();
    }
}
