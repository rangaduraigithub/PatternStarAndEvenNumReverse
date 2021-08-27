package sam;

import java.util.Scanner;

public class ReverseEvenNumandStar {
	public static void main(String[] args){
	     Scanner sc=new Scanner(System.in);
	     int n=sc.nextInt();
	     int k=1;
	     int arr[][]=new int[n][n];
	     for(int i=0;i<n;i++){
	    	 for(int j=0;j<=i;j++){
	    		 arr[i][j]=k++;
	    	 }
	     }
	    for(int i=0;i<n;i++){
	    	if(i%2!=0){
	    		for(int j=i;j>=0;j--){
	    			System.out.print(arr[i][j]);
	    			if(j>0){
	    				System.out.print("*");
	    			}
	    		}
	    	}
	    	else{
	    		for(int j=0;j<=i;j++){
	    		
	    			System.out.print(arr[i][j]);
	    			if(j<i){
	    				System.out.print("*");
	    			}
	    			
	    		}
	    	}
	    		
	    	System.out.println();
	    }
	     
	}

}
