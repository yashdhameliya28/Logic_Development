<<<<<<< HEAD
public class Lab_2 {
    public static void main(String[] args) {
        printEvenNumBetween2Num(1, 10);
        printFactor(12);
        System.out.println(sumOfDivisor(12));
        System.out.println(GCD(2, 4));
        System.out.println(LCM(8, 12));
        if(isPerfectNum(6)){
            System.out.println("Given number is perfect number");
        }
        else{
            System.out.println("Given number is not perfect number");
        }

        if(isHarshadNum(18)){
            System.out.println("Given number is harshad number");
        }else{
            System.out.println("Given number is not harshad number");
        }

        if(isPrime(5)){
            System.out.println("Given number is prime number");
        }else{
            System.out.println("Given number is not prime number");
        }
    }

    public static void printEvenNumBetween2Num(int n, int m){
        for(int i=n; i<=m; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }

    public static void printFactor(int n){
        for(int i=1; i<=n; i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }

    public static int sumOfDivisor(int n){
        int sum=0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum;
    }

    public static int GCD(int x, int y){
        int GCD = 0;
        int min = (x>y) ? y : x;
        for(int i=1; i<=min; i++){
            if(x%i==0 && y%i==0){
                GCD = i;
            }
        }
        return GCD;
    }

    public static int LCM(int x, int y){
        int LCM = 1; 
        int max = (x>y) ? x :y;
        for(int i=max; i<=(x*y); i++){
            if(i%x==0 && i%y==0){
                LCM = i;
                break;
            }
        }
        return LCM;
    }

    public static boolean isPerfectNum(int n){
        int sum=0;
        for(int i=1; i<n; i++){
            if(n%i==0){
                sum += i;
            }
        }
        if(sum!=n){
            return false;
        }
        return true;
    }

    
    public static boolean isHarshadNum(int n){
        int sum=0, rem=0, temp = n;
        while (temp!=0) {
            rem = temp % 10;
            sum+=rem;
            temp/=10;
        }
        if(n%sum!=0){
            return false;
        }
        return true;
    }

    public static boolean isPrime(int n){
        if(n <= 1) return false;
        for(int i=2; i<=(n/2); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

}
=======
public class Lab_2 {
    public static void main(String[] args) {
        printEvenNumBetween2Num(1, 10);
        printFactor(12);
        System.out.println(sumOfDivisor(12));
        System.out.println(GCD(2, 4));
        System.out.println(LCM(8, 12));
        if(isPerfectNum(6)){
            System.out.println("Given number is perfect number");
        }
        else{
            System.out.println("Given number is not perfect number");
        }

        if(isHarshadNum(18)){
            System.out.println("Given number is harshad number");
        }else{
            System.out.println("Given number is not harshad number");
        }

        if(isPrime(5)){
            System.out.println("Given number is prime number");
        }else{
            System.out.println("Given number is not prime number");
        }
    }

    public static void printEvenNumBetween2Num(int n, int m){
        for(int i=n; i<=m; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }

    public static void printFactor(int n){
        for(int i=1; i<=n; i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }

    public static int sumOfDivisor(int n){
        int sum=0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum;
    }

    public static int GCD(int x, int y){
        int GCD = 0;
        int min = (x>y) ? y : x;
        for(int i=1; i<=min; i++){
            if(x%i==0 && y%i==0){
                GCD = i;
            }
        }
        return GCD;
    }

    public static int LCM(int x, int y){
        int LCM = 1; 
        int max = (x>y) ? x :y;
        for(int i=max; i<=(x*y); i++){
            if(i%x==0 && i%y==0){
                LCM = i;
                break;
            }
        }
        return LCM;
    }

    public static boolean isPerfectNum(int n){
        int sum=0;
        for(int i=1; i<n; i++){
            if(n%i==0){
                sum += i;
            }
        }
        if(sum!=n){
            return false;
        }
        return true;
    }

    
    public static boolean isHarshadNum(int n){
        int sum=0, rem=0, temp = n;
        while (temp!=0) {
            rem = temp % 10;
            sum+=rem;
            temp/=10;
        }
        if(n%sum!=0){
            return false;
        }
        return true;
    }

    public static boolean isPrime(int n){
        if(n <= 1) return false;
        for(int i=2; i<=(n/2); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

}
>>>>>>> f9760b9 (Date:5-11-25)
