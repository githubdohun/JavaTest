package com.test.question;

public class Q070 {
	public static void main(String[] args) {
		
		int[][] nums = new int[5][5];
	      
	      //데이터 입력 > 문제
	      int n = 1;

	      for (int i=0; i<nums.length; i++) {
	    	  if(i % 2 == 0) {
	          for (int j=0; j<nums[0].length; j++) {
	            nums[i][j] = n;
	            n++;
	        
	          }
	    	  }
	    	   else {
	    	  for (int j=nums[0].length-1; j>=0; j--) {
	            nums[i][j] = n;
	            n++;
	    	  }
	    	  
	      }
     }	
	      
	      for (int i=0; i<nums.length; i++) {
	    	  for (int j=0; j<nums[0].length; j++) {
	    		  
	    		  System.out.printf("%5d", nums[i][j]);
	      }
	      
	    	  System.out.println();
	      }
	      
	   
	         
	    }//main
		
	}


