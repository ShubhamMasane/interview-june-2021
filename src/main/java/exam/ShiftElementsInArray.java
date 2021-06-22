package exam;

public class ShiftElementsInArray {

 public static void main(String[] args) {              
           
           int element;  
           int n = 1; 
            Scanner sc=new Scanner(System.in);  
            System.out.print("Enter the number of elements you want to store: ");  
             
            element=sc.nextInt();  
            int[] arr = new int[element];  

            System.out.println("Enter the elements of the array: ");  
            for(int i=0; i<element; i++)  
            {  
               
            arr[i]=sc.nextInt();  
            }  
              
              
           System.out.println("Original array: ");    
           for (int i = 0; i < arr.length; i++) {     
               System.out.print(arr[i] + " ");     
           }      
               
              
           for(int i = 0; i < n; i++){    
               int j, last;    
                   
               last = arr[arr.length-1];    
               
               for(j = arr.length-1; j > 0; j--){    
                       
                   arr[j] = arr[j-1];    
               }    
               arr[0] = last;    
           }    
           
           System.out.println();    
               
           System.out.println("Array after right rotation: ");    
           for(int i = 0; i< arr.length; i++){    
               System.out.print(arr[i] + " ");    
           }    
       }    


}
