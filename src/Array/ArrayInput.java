package Array;

import java.util.Scanner;
public class ArrayInput {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//     Scanner sc=new Scanner(System.in); //for input from console or keyboard
//     System.out.println("Ēnter Number of input");
//     int num=sc.nextInt();   //input no of array
//     int arr[]=new int[100];  //array declare + initialize
//     System.out.println("Ēnter Array of element");
//     for(int i=0;i<num;i++)  //Array input
//     {
//    	 arr[i]=sc.nextInt();
//     }
//     System.out.println("Ēnter Array are");
//     for(int i=0;i<num;i++)  //Array input
//     {
//    	 System.out.println(arr[i]);
//     }
		
		// TODO Auto-generated method stub
		int avg=0;
		int sum=0;
	     Scanner sc=new Scanner(System.in); //for input from console or keyboard
	     System.out.println("Ēnter Number of input");
	     int num=sc.nextInt();   //input no of array
	     int arr[]=new int[100];  //array declare + initialize
	     System.out.println("Ēnter Array of element");
	     for(int i=0;i<num;i++)  //Array input
	     {
	    	 arr[i]=sc.nextInt();
	    	 sum=sum+arr[i];
	     }
	     System.out.println("Ēnter Array are");
	     for(int i=0;i<num;i++)  //Array input
	     {
	    	 System.out.println(arr[i]);
	     }
	     System.out.println("Sum="+sum);
	     avg=sum/num;
	     System.out.println(avg);
	}

}
