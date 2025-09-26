public class DivideAndConquer {
    /*public static void mergeSort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,ei);
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }

        //left
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        for(k=0, i=si;k<temp.length;k++, i++){
            arr[i]=temp[k];
        }
    }*/
    /*public static void quickSort(int arr[], int si,int ei){
        if(si>=ei){
            return;
        }
        int pIdx=partition(arr,si,ei);
        quickSort(arr,si,pIdx-1);
        quickSort(arr,pIdx+1,ei);
    }
    public static int partition(int arr[], int si, int ei){
        int pivot=arr[ei];
        int i=si-1;

        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;

    }*/
   

    // Merge sort: sorts subarray arr[lo..hi] and returns a NEW sorted array
    /*public static String[] mergeSort(String[] arr, int lo, int hi) {
        // base case: subarray of length 1
        if (lo == hi) {
            String[] A = { arr[lo] };
            return A;
        }

        // safe midpoint calculation to avoid overflow
        int mid = lo + (hi - lo) / 2;

        // recursively sort left half arr[lo..mid]
        String[] arr1 = mergeSort(arr, lo, mid);

        // recursively sort right half arr[mid+1..hi]
        String[] arr2 = mergeSort(arr, mid + 1, hi);

        // merge two sorted halves into one sorted array
        String[] arr3 = merge(arr1, arr2);
        return arr3;
    }

    // Merge two sorted String arrays arr1 and arr2 into one sorted array
    static String[] merge(String[] arr1, String[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        String[] arr3 = new String[m + n]; // result array

        int idx = 0; // write index into arr3
        int i = 0;   // read index for arr1
        int j = 0;   // read index for arr2

        // pick the smaller (alphabetically earlier) string each time
        while (i < m && j < n) {
            if (isAlphabeticallySmaller(arr1[i], arr2[j])) {
                arr3[idx] = arr1[i];
                i++;
            } else {
                arr3[idx] = arr2[j];
                j++;
            }
            idx++;
        }

        // copy any remaining elements from arr1
        while (i < m) {
            arr3[idx] = arr1[i];
            i++; idx++;
        }

        // copy any remaining elements from arr2
        while (j < n) {
            arr3[idx] = arr2[j];
            j++; idx++;
        }

        return arr3;
    }

    // Return true if str1 comes before str2 lexicographically
    static boolean isAlphabeticallySmaller(String str1, String str2) {
        if (str1.compareTo(str2) < 0) {
            return true;
        }
        return false;
    }*/

    // driver
    /*public static int getInvCount(int arr[]){
        int invCount=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    invCount++;
                }
            }
        }
        return invCount;
    }*/
    public static int merge(int arr[], int left,int mid, int right){
        int invCount=0;
        int i=left, j=mid+1, k=0;
        int temp[]=new int[right-left+1];

        while(i<=mid && j<=right){
            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                invCount+=(mid-i+1);
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=right){
            temp[k++]=arr[j++];
        }

        for(k=0, i=left;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
        return invCount;
    }
    public static int mergeSort(int arr[], int left,int right){
        int invCount=0;
        if(right>left){
            int mid=left+(right-left)/2;
            invCount+=mergeSort(arr,left,mid);
            invCount+=mergeSort(arr,mid+1,right);
            invCount+=merge(arr,left,mid,right);
        }
        return invCount;
    }


    public static void main(String[] args) {
        int arr[]={1,20,6,4,5};
        System.out.println(mergeSort(arr,0,arr.length-1));
        
        /*String[] arr = { "sun", "earth", "mars", "mercury" };
        // handle empty array safely
        if (arr.length == 0) {
            System.out.println("Empty array");
            return;
        }
        String[] a = mergeSort(arr, 0, arr.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }*/
    }


   
        /*int arr[]={6,3,9,5,2,8};
        quickSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }*/

       
   
    
}
