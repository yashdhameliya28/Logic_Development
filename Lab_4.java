import java.lang.reflect.Array;
import java.util.Arrays;

public class Lab_4{
    public static void main(String[] args) {
        int[] arr1 = {2,4,6,3,10};
        int[] arr2 = {10,30,20,99,56,20,99,10};
        // sortArray(arr1);
        // secondLargetsElement(arr2);
        // secondSmallestElement(arr2);
        // findDuplicateElement(arr2);
        // removeDuplicate(arr2);
        // mergeArray(arr1, arr2);
        // secondLargetsElementWithoutSort(arr1);
        int[] arr3 = {2,4,6,3,10};
        int[] arr4 = {10,30,20,99,56,20,99,10};
        // unionArr(arr3, arr4);
        
        // printArr(insertElementAtSpecificPos(arr1, 200, 3));
        // printArr(insertElementAtSpecificPosWithoutNewArr(arr2, 200, 3));
        printArr(deleteSpecificElement(arr4, 3));
    }
    
    public static void printArr(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void sortArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static int secondLargetsElement(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-3];
    } 

    public static int secondSmallestElement(int[] arr){
        Arrays.sort(arr);
        return arr[1];
    }

    public static void findDuplicateElement(int[] arr){
        for(int i=0; i<arr.length; i++){
            int count=1, temp=arr[i];
            for(int j=i+1; j<arr.length; j++){
                if(temp == arr[j]){
                    count++;
                }
            }
            if(count!=1){
                System.out.println("duplicate element : "+arr[i]);
            }
        }
    }

    public static void removeDuplicate(int[] arr){
       for(int i=0; i<arr.length; i++){
            int temp=arr[i];
            for(int j=i+1; j<arr.length; j++){
                if(temp == arr[j]){
                    arr[j] = -1;
                }
            }
        } 
        for(int i=0; i<arr.length; i++){
            if(arr[i] != -1){
                System.out.println(arr[i]);
            }
        }
    }

    public static int[] mergeArray(int[] arr1, int[] arr2){
        int newArrLen = arr1.length + arr2.length;
        int[] newArr = new int[newArrLen];
        int k=0; 
        for(int i=0; i<arr1.length; i++){
            newArr[k] = arr1[i];
            k++;
        }
        for(int j=0; j<arr2.length; j++){
            newArr[k] = arr2[j];
            k++;
        }
        return newArr;
    }

    public static int secondLargetsElementWithoutSort(int[] arr){
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(max1 < arr[i]){
                max1 = arr[i];
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] == max1){
                continue;
            }
            else if(max2 < arr[i]){
                max2 = arr[i];
            }
        } 
        return max2;
    }  
    
    public static void intersectionArr(int[] arr1, int[] arr2){
        for(int i=0; i<arr1.length; i++){
            int temp = arr1[i];
            for(int j=0; j<arr2.length; j++){
                if(temp == arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
        }
    }

    public static void unionArr(int[] arr1, int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int maxLen = Math.max(arr1.length, arr2.length);
        for(int i=0; i<maxLen; i++){
           if(arr1[i] == arr2[i]){
            System.out.println(arr1[i]);
           } 
           else{
            System.out.println(arr1[i]);
            System.out.println(arr2[i]);
           }
        }
    }
    
    //with new array insert element
    public static int[] insertElementAtSpecificPos(int[] arr, int k, int pos){
        int[] newArr = new int[arr.length+1];
        for(int i=0; i<pos; i++){
            newArr[i] = arr[i];
        }
        newArr[pos] = k;
        for(int i=pos; i<arr.length; i++){
            newArr[i+1] = arr[i];
        }
        return newArr;
    }

    //without new array insert element
    public static int[] insertElementAtSpecificPosWithoutNewArr(int[] arr, int k, int pos){
        for(int i=arr.length-1; i>pos; i--){
            arr[i] = arr[i-1];
        }
        arr[pos-1] = k;
        return arr;
    }

    //without new array delete specific postion element
    public static int[] deleteSpecificElementWithoutNewArr(int[] arr, int pos){
        for(int i=pos-1; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        } 
        return arr;
    }

    //with new array delete specific postion element
    public static int[] deleteSpecificElement(int[] arr, int pos){
        int[] newArr = new int[arr.length-1];
        for(int i=0; i<pos; i++){
            newArr[i] = arr[i];
        }
        for(int i=pos-1; i<newArr.length; i++){
            newArr[i] = arr[i+1];
        }
        return newArr;
    } 

    public static int[] shiftArrayElement(int[] arr){
        int temp = arr[arr.length-1];
        for(int i=arr.length-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        return arr;   
    }
}