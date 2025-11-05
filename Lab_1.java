<<<<<<< HEAD
public class Lab_1{
    public static void main(String[] args) {
        System.out.println(sumOf10Num());
        System.out.println(factorial(5));
        System.out.println(sumOfSeries(5));
        printInReverse(123);
        System.out.println(sumOfDigits(123));
        System.out.println(multiplactionWithoutSign(2, 3));
        System.out.println(power(2, 3));
        
    }

    public static int sumOf10Num(){
        int sum=0;
        for(int i=1; i<=10; i++){
            sum+=i;
        }
        return sum;
    }

    public static int factorial(int n){
        int ans = 1;
        for(int i=1; i<=n; i++){
            ans *= i;
        }
        return ans;
    }

    public static int sumOfSeries(int n){
        int ans = 0;
        for(int i=1; i<=n; i++){
            ans += (i*i);
        }
        return ans;
    }

    public static void printInReverse(int n){
        int rem = 0 ;
        while (n != 0) {
            rem = n % 10;
            System.out.println(rem);
            n = n / 10;
        }
    }

    public static int sumOfDigits(int n){
        int ans=0, rem=0;
        while (n != 0) {
            rem = n % 10;
            ans += rem;
            n = n / 10;
        }
        return ans;
    }

    public static int multiplactionWithoutSign(int n, int m){
        int ans = 0;
        for(int i=1; i<=m; i++){
            ans += m;
        } 
        return ans;
    }

    public static int power(int x, int y){
        int ans = 1;
        for(int i=1; i<=y; i++){
            ans *= x;
        }
        return ans;
    }
=======
public class Lab_1{
    public static void main(String[] args) {
        System.out.println(sumOf10Num());
        System.out.println(factorial(5));
        System.out.println(sumOfSeries(5));
        printInReverse(123);
        System.out.println(sumOfDigits(123));
        System.out.println(multiplactionWithoutSign(2, 3));
        System.out.println(power(2, 3));
        
    }

    public static int sumOf10Num(){
        int sum=0;
        for(int i=1; i<=10; i++){
            sum+=i;
        }
        return sum;
    }

    public static int factorial(int n){
        int ans = 1;
        for(int i=1; i<=n; i++){
            ans *= i;
        }
        return ans;
    }

    public static int sumOfSeries(int n){
        int ans = 0;
        for(int i=1; i<=n; i++){
            ans += (i*i);
        }
        return ans;
    }

    public static void printInReverse(int n){
        int rem = 0 ;
        while (n != 0) {
            rem = n % 10;
            System.out.println(rem);
            n = n / 10;
        }
    }

    public static int sumOfDigits(int n){
        int ans=0, rem=0;
        while (n != 0) {
            rem = n % 10;
            ans += rem;
            n = n / 10;
        }
        return ans;
    }

    public static int multiplactionWithoutSign(int n, int m){
        int ans = 0;
        for(int i=1; i<=m; i++){
            ans += m;
        } 
        return ans;
    }

    public static int power(int x, int y){
        int ans = 1;
        for(int i=1; i<=y; i++){
            ans *= x;
        }
        return ans;
    }
>>>>>>> f9760b9 (Date:5-11-25)
}