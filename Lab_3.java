<<<<<<< HEAD
public class Lab_3 {
    public static void main(String[] args) {
        System.out.println(sumOfSequence(3));
        // System.out.println(powerWithoutMiltiplaction(2, 3));
    }   
    
    public static int sumOfSequence(int n){
        int sum=0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                sum+=j;
            }
        }
        return sum;
    }

    public class PowerWithoutMulti {
    public static void main(String[] args) {
        int x = 3;
        int y = 3;
        int ans = 1;

        for (int i = 0; i < y; i++) {
            ans = multiply(ans, x);
        }

        System.out.println("Power is: " + ans);
    }

    static int multiply(int a, int b) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            result += a;
        }
        return result;
    }
}


    public static int findLargestElement(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    } 

    public static int findSmallestElement(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    public static int FindElementInArr(int[] arr, int k){
        if(arr.length == 0) return 0; 
        for(int i=0; i<arr.length; i++){
            if(arr[i] == k){
                return 1;
            }
        }
        return 0;
    }

    public static void reverseArr(int[] arr){
        for(int i=0; i<(arr.length)/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp; 
        }
        for(int i=0; i<arr.length; i++){
            System.out.print("Reverse array "+arr[i]);
        }
    }

    public static void printElement(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            if((arr[i]+arr[i+1])%2 == 0){
                System.out.println(i + " " + (i+1));
            }
        }
    }

    public static void findDuplicateElement(int[] arr){
        int dcount=0;
        for(int i=0; i<arr.length; i++){
            int temp=arr[i];
            for(int j=1; j<arr.length; j++){
                if(temp == arr[j]){
                    dcount++;
                }
            }
            if(dcount!=1){
                System.out.println("duplicate element : "+arr[i]);
            }
        }
    }

    public static void primeNumBetweenTwoNum(int n, int m){
       for(int i=n; i<=m; i++){
            int temp = i;
            for(int j=2; j<=(temp)/2; j++){
                if(temp%i==0){
                    System.out.println(temp+"is not prime number");
                }
                else{
                    System.out.println(temp+"is prime number");
                }
            }
       } 
    }

    public static void frequencyOfEachElement(int[] arr){
        for(int i=0; i<arr.length; i++){
            int count=0;
            int temp=arr[i];
            for(int j=1; j<arr.length; j++){
                if(temp == arr[i]) count++;
            }
            System.out.println("Element is"+arr[i]+"and it's frequency is"+count);
        }
    }

    public static void findSecondLargestElement(int[] arr){
        
    }
}
=======
public class Lab_3 {
    public static void main(String[] args) {
        System.out.println(sumOfSequence(3));
        // System.out.println(powerWithoutMiltiplaction(2, 3));
    }   
    
    public static int sumOfSequence(int n){
        int sum=0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                sum+=j;
            }
        }
        return sum;
    }

    public class PowerWithoutMulti {
    public static void main(String[] args) {
        int x = 3;
        int y = 3;
        int ans = 1;

        for (int i = 0; i < y; i++) {
            ans = multiply(ans, x);
        }

        System.out.println("Power is: " + ans);
    }

    static int multiply(int a, int b) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            result += a;
        }
        return result;
    }
}


    public static int findLargestElement(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    } 

    public static int findSmallestElement(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    public static int FindElementInArr(int[] arr, int k){
        if(arr.length == 0) return 0; 
        for(int i=0; i<arr.length; i++){
            if(arr[i] == k){
                return 1;
            }
        }
        return 0;
    }

    public static void reverseArr(int[] arr){
        for(int i=0; i<(arr.length)/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp; 
        }
        for(int i=0; i<arr.length; i++){
            System.out.print("Reverse array "+arr[i]);
        }
    }

    public static void printElement(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            if((arr[i]+arr[i+1])%2 == 0){
                System.out.println(i + " " + (i+1));
            }
        }
    }

    public static void findDuplicateElement(int[] arr){
        int dcount=0;
        for(int i=0; i<arr.length; i++){
            int temp=arr[i];
            for(int j=1; j<arr.length; j++){
                if(temp == arr[j]){
                    dcount++;
                }
            }
            if(dcount!=1){
                System.out.println("duplicate element : "+arr[i]);
            }
        }
    }

    public static void primeNumBetweenTwoNum(int n, int m){
       for(int i=n; i<=m; i++){
            int temp = i;
            for(int j=2; j<=(temp)/2; j++){
                if(temp%i==0){
                    System.out.println(temp+"is not prime number");
                }
                else{
                    System.out.println(temp+"is prime number");
                }
            }
       } 
    }

    public static void frequencyOfEachElement(int[] arr){
        for(int i=0; i<arr.length; i++){
            int count=0;
            int temp=arr[i];
            for(int j=1; j<arr.length; j++){
                if(temp == arr[i]) count++;
            }
            System.out.println("Element is"+arr[i]+"and it's frequency is"+count);
        }
    }

    public static void findSecondLargestElement(int[] arr){
        
    }
}
>>>>>>> f9760b9 (Date:5-11-25)
