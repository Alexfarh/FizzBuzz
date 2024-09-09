public class Reduce {
    public static int main(String[] args) {
       return howManyTillReduce(100);
    }

    public static int howManyTillReduce(int n){
        int count = 0;
        while (n > 0){
            if (n%2 ==0){
                n = n/2;
            }
            else{
                n--;
            }
            count ++;
        }
        return count;
    }
}
