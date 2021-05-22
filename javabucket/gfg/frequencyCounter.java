// { Driver Code Starts
    import java.io.*;
    import java.util.*;
    
    class frequencyCounter {
        
        public static void main (String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            //testcases
            int t = Integer.parseInt(br.readLine().trim()); 
            while(t-->0){
                
                //size of array
                int n = Integer.parseInt(br.readLine().trim()); 
                int arr[] = new int[n];
                String inputLine[] = br.readLine().trim().split(" ");
    
                //adding elements to the array
                for(int i=0; i<n; i++){
                    arr[i]=Integer.parseInt(inputLine[i]); 
                }
                
                //calling frequncycount() function
                Solution ob = new Solution();
                ob.frequencycount(arr, n); 
                
                //printing array elements
                for(int i=0; i<n; i++)
                    System.out.print(arr[i] + " " );
                System.out.println();
            }
        }
    }
    
    
    
    // } Driver Code Ends
    
    
    
    class Solution{
        //Function to count the frequency of all elements from 1 to N in the array.
        public static void frequencycount(int arr[], int n)
        {
            // code here
            int i = 0;
            
            while(i < n) {
                if(arr[i] <= 0) {
                    i++;
                    continue;
                }
                
                int index = arr[i]-1;
                
                if(arr[index] > 0) {
                    arr[i] = arr[index];
                    arr[index] = -1;
                }else {
                    arr[index]--;
                    arr[i] = 0;
                    i++;
                }
            }
            
            for(int j = 0; j < n; j++) {
                arr[j] = Math.abs(arr[j]);
            }
            
        }
    }
    