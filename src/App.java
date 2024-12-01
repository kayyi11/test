public class App {
    public static void main(String[] args) throws Exception {
        int countPP = 0;
        int countE = 0;
        int num = 2;

        System.out.println("First 20 Palindromic Primes:");
        while (countPP < 20) {
            if (isPP(num)) {
                System.out.print(num + " ");
                countPP++;
            }
            num++;
        }

        System.out.println("\n\nFirst 20 Emirp Numbers:");
        num = 2;
        while (countE < 20) {
            if (isE(num)) {
                System.out.print(num + " ");
                countE++;
            }
            num++;
        
        }
    }

    public static boolean isPP(int num) {
        return isPrime(num);
    }
    
    //Emirp
    public static boolean isE(int num) {
        if (!isPrime(num)){
            return false;
        }
        int reverse = 0, original = num;
        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        return isPrime(reverse) && reverse != original;
    }

    //Prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) 
                return false;
        }
        return true;
    }

    
    

}
