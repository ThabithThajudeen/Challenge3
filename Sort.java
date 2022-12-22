	import java.util.*;
	public class Sort {  
    	static void bubbleSort(int[] arr) {  
     int n = arr.length;  
     int temp = 0;  
     for(int i=0; i < n; i++){  
     for(int j=1; j < (n-i); j++){  
     if(arr[j-1] > arr[j]){  
     //swap elements  
     temp = arr[j-1];  
     arr[j-1] = arr[j];  
    	arr[j] = temp;  
                         }  
                          
                 	}  
         		}  
  
    }  
    public static void main(String[] args) { 
	  Scanner input = new Scanner(System.in);
   	int arr[] ={47,84,75,21,14,14,79};  
                 
                System.out.println("Array Before Bubble Sort");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
                System.out.println();  
                  
                bubbleSort(arr);//sorting array elements using bubble sort  
                 
                System.out.println("Array After Bubble Sort");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }

			System.out.println("Welcome to the menu");	
			System.out.println("What would you like to do");
			System.out.println("1.Median value");
			System.out.println("2.Highest value");
			System.out.println("3.Mode");
			System.out.println("4.Find the prime numbers of the Array and display as a list");

			int choice = input.nextInt();

			switch(choice)
			{
				case 1:
					int median;
        				int len = arr.length;	
					if(len%2 != 0)
            			median = arr[len/2];
        				else // length is even
           			 median = (arr[(len - 1) / 2] + arr[len / 2])/2;
        				System.out.println(median);
					break;
				case 2:
					int max = arr[0];
					for(int i=0;i<arr.length;i++){
					if(arr[i]>max)
						max = arr[i];
					}
					System.out.println("Largest element present in given array:" + max);
					break;
				case 3:
					HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
        				int max2  = 1;        // frequency
        				int max_value = 0;   // max value

        			for(int i = 0; i < arr.length; i++) {
            			if (h.get(arr[i]) != null) {
               			 int current = h.get(arr[i]);
                			current++;
                			h.put(arr[i], current);

                if(current > max2) {
                    max2  = current;
                    max_value = arr[i];
                }
            }
            else
                h.put(arr[i],1);
        }
        System.out.println(max_value);
				break;
				case 4:

					for (int i = 0; i < arr.length; i++) 
					
					{
       				 boolean isPrime = true;
        				if (arr[i] == 1)
            			isPrime = false;
        					else {
            				// check to see if the numbers are prime
            					for (int j = 2; j <= arr[i] / 2; j++) {
                				if (arr[i] % j == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        // print the number
        if (isPrime){
            if (arr[i] == 0){}
            else {
                System.out.print(arr[i] + " , ");
            }
			}

		}	  
   				
        }  
} 
}