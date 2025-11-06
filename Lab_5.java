public class Lab_5 {
    public static void main(String[] args) {
        // if(isPronic(13)){
        //     System.out.println("Given number is pronic");
        // }
        // else{
        //     System.out.println("Given number not is pronic");
        // }

        // if(isArtomorphic(76)){
        //     System.out.println("Given number is Artomorphic");
        // }
        // else{
        //     System.out.println("Given number not is Artomorphic");
        // }

        System.out.println(decimalToOcatl(25));
    }

    public static boolean isUgly(int n){
        int flag = 0;
        while (n != 1) {
            if(n%2 == 0){
                n = n/2;
            }
            else if(n%3 == 0){
                n = n/3;
            }
            else if(n%5 == 0){
                n = n/5;
            }
            else{
                flag = 1;
            }
        }
        if(flag != 0){
            return false;
        }
        return true;
    }

    public static boolean isPronic(int n){
         int flag = 0; 
        for(int i=1; i<=n; i++){
            if(i * (i+1) == n){
                flag = 1;
                break; 
            }
        }
        if(flag == 1){
            return true;
        }
        return false;
    }

    public static boolean isArtomorphic(int n){
        int temp = n, count=0;
        while (temp != 0) {
            count++;
            temp = temp / 10; 
        }
        int square = n * n;
        int rem = (int) (square % Math.pow(10, count));
        if(n != rem){
            return false;
        }
        return true;
    }

    public static int decimalToOcatl(int n){
        int oct=0, place=1, count=0;
        while (n != 0) {
            int rem = n%8;
            count++;
            oct = oct + (rem * place);
            place = place * (int) (Math.pow(10, count));
            n = n / 8; 
        }
        return oct;
    }
}
