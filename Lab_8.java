import java.util.ArrayList;
import java.util.Arrays;

public class Lab_8 {
    public static void main(String[] args) {
        // System.out.println(earliestRepeatedChar("geeksforgeeks"));
        // System.out.println(leastNumOfSquare(12));
        // int[] arr = { 1, 3, 5, 33, 2, 45 };
        // if (isInArray(arr, 45, 0, arr.length - 1) != 0) {
        // System.out.println(isInArray(arr, 45, 0, arr.length));
        // } else {
        // System.out.println("Key not found!!!");
        // }

        // if (isAnagram("geeks", "kseeg")) {
        // System.out.println("Given string is anagram");
        // } else {
        // System.out.println("Given string not is anagram");
        // }
        int[] arr = { 1, 1, 1, 2, 2, 2 };
        System.out.println(binaryToDecimal("101.110"));
        // System.out.println(secondLargetsElementWithoutSort(arr));
        // if (isNonDecreasingArray(arr)) {
        // System.out.println("Given array is non-decreasing array");
        // } else {
        // System.out.println("Given array is not non-decreasing array");
        // }

        // System.out.println(findPairsWhoseSumIsK(arr, 6));

        // if (checkConditionOnArray(arr) == 1) {
        // System.out.println("Given array is full-fil all condotion");
        // } else {
        // System.out.println("Given array is not full-fil all condotion");
        // }

        int[] a = { 1, 12, 15, 26, 38 };
        int[] b = { 2, 13, 17, 30, 45 };
        // System.out.println(findMedian(a, b));
        // System.out.println(myAtoi(" -042"));
    }

    public static String earliestRepeatedChar(String str) {
        char[] ch = str.toCharArray();
        char temp = ' ';
        boolean flag = false;
        for (int i = 0; i < ch.length && !flag; i++) {
            temp = ch[i];
            for (int j = i + 1; j < ch.length; j++) {
                if (temp == ch[j]) {
                    if (Math.abs(i - j) <= 1) {
                        flag = true;
                        break;
                    }
                }
            }
        }
        if (flag) {
            return String.valueOf(temp);
        } else {
            return "No repeated character";
        }
    }

    public static int isInArray(int[] arr, int k, int low, int high) {
        Arrays.sort(arr);
        int mid = (low + high) / 2;
        if (arr[mid] == k) {
            return mid;
        } else if (arr[mid] > k) {
            return isInArray(arr, k, low, mid - 1);
        } else if (arr[mid] < k) {
            return isInArray(arr, k, mid + 1, high);
        } else {
            return 0;
        }
    }

    public static boolean isAnagram(String str1, String str2) {
        boolean flag = true;
        int count = 0;
        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                for (int j = 0; j < str2.length(); j++) {
                    if (str1.charAt(i) == str2.charAt(j)) {
                        continue;
                    }
                }
            }
        } else
            flag = false;
        if (count != 0) {
            flag = false;
        }
        return flag;
    }

    public static double binaryToDecimal(String binaryNum) {
        String[] parts = binaryNum.split("\\.");
        String integerPart = parts[0];
        
        String fractionPart = parts[1];
        
        double intSum = 0, fracSum = 0, intCount=0, fracCount=-1;
        for(int i=integerPart.length()-1; i>=0; i--){
            intSum = intSum + Character.getNumericValue(integerPart.charAt(i)) * (Math.pow(2, intCount));
            intCount++;
        }
        for(int i=0; i<fractionPart.length(); i++){
            fracSum += Character.getNumericValue(fractionPart.charAt(i)) * (Math.pow(2, fracCount));
            fracCount--;
        }
        return intSum + fracSum;
    }

    public static int secondLargetsElementWithoutSort(int[] arr) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max1 <= arr[i]) {
                max1 = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != max1 && max2 < arr[i]) {
                max2 = arr[i];

            }
        }
        if (max1 == max2)
            return -1;
        return max2;
    }

    public static boolean isNonDecreasingArray(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1])
                count++;
        }
        if (count != 1)
            return false;
        return true;
    }

    public static int findPairsWhoseSumIsK(int[] arr, int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) == k)
                    count++;
            }
        }
        return count;
    }

    public static int checkConditionOnArray(int[] arr) {
        Arrays.sort(arr);

        return 1;
    }

    public static int findMedian(int[] a, int[] b) {
        int midA = 0, midB = 0;
        int lena = a.length - 1, lenb = b.length - 1;
        if (a.length % 2 == 0) {
            midA = (a[lena / 2] + a[(lena / 2) + 1]) / 2;
        } else {
            midA = a[(lena + 1) / 2];
        }
        if (b.length % 2 == 0) {
            midB = (b[lenb / 2] + b[(lenb / 2) + 1]) / 2;
        } else {
            midB = b[(lenb + 1) / 2];
        }
        return (midA + midB) / 2;
    }

    public static String myAtoi(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ' && str.charAt(i) != '0') {
                newStr += str.charAt(i);
            }
        }
        return newStr;
    }

    public static int diskProblem(int disk) {
        return (int) (Math.pow(disk, 2)) - 1;
    }

    public static int childHopProblem(int n) {
        return n / 3 + 1;
    }
}
