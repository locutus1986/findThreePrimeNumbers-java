public class isPrime {
    public static void main(String[] args) {
        int numberOfPrimeNumber = 1;
        for(int i = 10; numberOfPrimeNumber <= 3; i++){
              if(isPrime(i)){
                System.out.println(i + " is a prime number");
                  System.out.println(numberOfPrimeNumber);
                numberOfPrimeNumber++;
            }
        }
    }

    public static boolean isPrime(int n){

        boolean result = false;

        if(n==1){
            return result;
        }
        for(int i=2; i <= n/2; i++){
            if(n % i == 0){
                return result;
            }
        }
        result = true;
        return result;
    }
}
