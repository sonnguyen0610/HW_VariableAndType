package exercise;

import java.util.Scanner;

public class TestArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("n= ");
        int n=sc.nextInt();

        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("["+i+"] =");
            arr[i]=sc.nextInt();
        }
        sortArrAsc(arr);
        printArray(arr);
        System.out.println(sumElement(arr));
    }
    public static void printArray(int []arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }
    public static int sumElement(int[]arr){
        int res=0;
        for(int ele:arr){
            res+=ele;
        }
        return res;
    }
    //Sắp xếp: interChangeSort
    public static void sortArrAsc(int[]arr){
        for (int i=0;i<=arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
