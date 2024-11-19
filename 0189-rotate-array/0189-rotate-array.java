class Solution {
    
    static void rotate(int arr[], int d) {
        int n = arr.length;
        

        d = n-d%n; 
        
       
        reverse(arr, 0, d - 1);
        
       
        reverse(arr, d, n - 1);
        
        
        reverse(arr, 0, n - 1);
    }
    
    
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}