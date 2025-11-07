public class Lab_6 {
    public static void main(String[] args) {
        patterrn1(4);
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

    //1
    //1*1
    //1*3*1
    //1*3*5*3*1
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
    //   *        *
    //     *   *
    //       * 
    //     *    *
    //   *        *
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

        //     1
        //    212
        //    32123
        //   4321234
        //    32123
        //     212
        //      1

    public static void pattern14(){
         int n = 4;   
        for(int i = 1; i <= n; i++){
            for(int s = n; s > i; s--){
                System.out.print(" ");
            }
            for(int j = i; j >= 1; j--){
                System.out.print(j);
            }
            for(int j = 2; j <= i; j++){
                System.out.print(j);
            }

            System.out.println();
        }
        for(int i = n-1; i >= 1; i--){
            for(int s = n; s > i; s--){
                System.out.print(" ");
            }
            for(int j = i; j >= 1; j--){
                System.out.print(j);
            }
            for(int j = 2; j <= i; j++){
                System.out.print(j);
            }

            System.out.println();
        }
    }

//     1
//     1 2 1
//     1 * 3 * 1
//     1 * * 4 * * 1
//     1 * * * 5 * * * 1
//     1 * * * * 6 * * * *1
    public static void pattern15(){
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
}
