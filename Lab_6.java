public class Lab_6 {
    public static void main(String[] args) {
        // patterrn1(4);
        // printPascalTriangle();
        // pattern19();
        int[] arr = { 2, 1, 5, 4 };
        int[] arr1 = { 2, 1, 5, 4 };
        // printArr(insertionSort(arr));
        // printArr(selectionSort(arr1));
        int[] arr2 = {1,2,3,4,5,6,7};
        
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    // if n = 5
    // 1
    // 2 6
    // 3 7 10
    // 4 8 11 13
    // 5 9 12 14 15
    public static void patterrn1(int n) {
        int gap = 0, num = 0;
        for (int i = 0; i <= n; i++) {
            gap = n - 1;
            num = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + num);
                num += gap;
                gap--;
            }
            System.out.println();
        }
    }

    // 1
    // 1*1
    // 1*3*1
    // 1*3*5*3*1
    public static void pattern12() {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (2 * i - 1); j += 2) {
                System.out.print(j);
                if (j < (2 * i - 1))
                    System.out.print("*");
            }
            for (int j = (2 * i - 3); j >= 1; j -= 2) {
                System.out.print("*" + j);
            }
            System.out.println();
        }
    }

    // * * * * * * *
    // * *
    // * *
    // *
    // * *
    // * *
    // * * * * * * * *
    public static void pattern13(int n) {
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (j = i; j <= n; j++) {
                if (j == i || j == n || i == 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        for (i = n - 1; i >= 1; i--) {

            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (j = i; j <= n; j++) {
                if (j == i || j == n || i == 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    // 1
    // 212
    // 32123
    // 4321234
    // 32123
    // 212
    // 1

    public static void pattern14() {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int s = n; s > i; s--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int s = n; s > i; s--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }

    // 1
    // 1 2 1
    // 1 * 3 * 1
    // 1 * * 4 * * 1
    // 1 * * * 5 * * * 1
    // 1 * * * * 6 * * * *1
    public static void pattern15() {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            System.out.print("1 ");
            for (int j = 1; j < i - 1; j++) {
                System.out.print("* ");
            }
            if (i > 1) {
                System.out.print(i + " ");
            }
            for (int j = 1; j < i - 1; j++) {
                System.out.print("* ");
            }
            if (i > 1) {
                System.out.print("1");
            }
            System.out.println();
        }
    }

    public static void printPascalTriangle() {
        int n = 6;
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    public static void pattern19() {
        int n = 5, temp = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(temp + " ");
                }
            } else {

            }
            System.out.println();
        }
    }

    // 4444444
    // 4333334
    // 4322234
    // 4321234
    // 4322234
    // 4333334
    // 4444444
    public static void Patten20() {
        int n = 4;
        int size = 2 * n - 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                int top = i;
                int left = j;
                int right = size - 1 - j;
                int bottom = size - 1 - i;

                int min = Math.min(Math.min(top, bottom), Math.min(left, right));

                System.out.print(n - min);
            }
            System.out.println();
        }
    }

    // 12345
    // 109876
    // 1112131415
    // 1617181920
    // 2122232425
    public static void Patten19() {

        int n = 5;
        int num = 1;
        for (int i = 1; i <= n; i++) {
            int rowStart = num;
            num += n;
            if (i % 2 == 1) {
                for (int j = rowStart; j < rowStart + n; j++) {
                    System.out.print(j + " ");
                }
            } else {
                for (int j = rowStart + n - 1; j >= rowStart; j--) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }

    public static int[] insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && temp < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
        return arr;
    }

    public static int[] selectionSort(int[] arr) {
        for(int i=0; i<arr.length-1; i++){
            int smallest = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
