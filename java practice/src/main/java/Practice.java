import java.io.*;

class Practice{
public static void main(String[]args) {
	int count=0;
	int [] arr= {1,2,3,4,5};
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2==0) {
			count=count+1;
			
		}
		 else if(arr[i]==5){
		    	count=count+5;
		    	
		    }
		 else {
			count=count+3;
			
			
		}
	    
		System.out.println(count);  
	}
	
}
}



