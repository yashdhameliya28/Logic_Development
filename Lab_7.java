import java.util.Arrays;

public class Lab_7 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        Lab_4 lab4 = new Lab_4();
        // lab4.printArr(rotateArr(arr, 3));
        // int max = lab4.secondLargetsElement(arr);
        // int min = lab4.secondSmallestElement(arr);
        // System.out.println(diffBetween2LargestEleEnd2SmallestEle(min, max));
        int[] digits = { 1, 1, 3 };
        System.out.println(formANumIsDivideBy3(digits));
        // System.out.println(decodePattern("2a2"));
    }

    public static int[] rotateArr(int[] arr, int k) {
        int temp = 0;
        for (int i = 0; i < k; i++) {
            temp = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;
        }
        return arr;
    }

    public static void reverseArr(int[] arr) {
        for (int i = 0; i < (arr.length) / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Reverse array " + arr[i]);
        }
    }

    // n = rupees
    // m = chocolates
    // k = 1 chocolates per k wrappers
    public static int chocolateProblem(int n, int m, int k) {
        int chocolates = n / m;
        int wrappers = chocolates;
        while (wrappers >= k) {
            int extra = wrappers / k;
            chocolates += extra;
            wrappers = (wrappers % k) + extra;
        }
        return chocolates;
    }

    public static int diffBetween2LargestEleEnd2SmallestEle(int min, int max) {
        return Math.abs(min - max);
    }

    public static int sumOfAllElementInArray(int[] arr) {
        int sum = 0;
        for (int n : arr) {
            sum += n;
        }
        return sum;
    }

    public static String formANumIsDivideBy3(int[] arr) {
        Arrays.sort(arr);
        boolean oneRemove = false;
        int sum = sumOfAllElementInArray(arr);
        int rem = sum % 3;
        if (sum % 3 == 0) {
            StringBuilder sb = new StringBuilder();
            for (int n : arr) {
                sb.append(n);
            }
            sb.reverse();
            return sb.toString();
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 3 == rem) {
                    oneRemove = true;
                    arr[i] = -1;
                    break;
                }
            }
        }
        if (!oneRemove) {
            boolean pairRemove = false;
            for (int i = 0; i < arr.length && !pairRemove; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (((arr[i] + arr[j]) % 3 == rem)) {
                        arr[i] = -1;
                        arr[j] = -1;
                        pairRemove = true;
                        break;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int n : arr) {
            if (n != -1) {
                sb.append(n);
            } else {
                continue;
            }
        }
        sb.reverse();
        return sb.toString();
    }

    public static String decodePattern(String str) {
        String newStr = "";
        int count = 0;
        char[] strArr = str.toCharArray();
        if (!Character.isDigit(strArr[strArr.length - 1])) {
            for (int i = 0; i < strArr.length; i++) {
                if (Character.isDigit(strArr[i])) {
                    count = Integer.parseInt(String.valueOf(strArr[i]));
                    for (int j = 1; j < count; j++) {
                        newStr += strArr[i + 1];
                    }
                } else {
                    newStr += strArr[i];
                }
            }
        } else {
            System.out.println("Enter valid string...");
        }
        return newStr;
    }

}
