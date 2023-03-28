
public class Review02 {

    public static void main(String[] args) {
        // iの値が0から100より小さい間、処理を繰り返す
        for (int i = 1; i <= 100; i++) {

                // iの値が3で割り切れかつ5で割り切れるなら
             if(i % 3 == 0 && i % 5 ==0) {
                // "FizzBuzz" と表示する
                System.out.println("FizzBuzz");

             // iの値が3で割り切れるとき
            }else if (i % 3 == 0) {
                // "Fizz" と表示する
                System.out.println("Fizz");

                // iが5で割り切れるとき
            } else if (i % 5 == 0) {
                // "Buzz" と表示する
                System.out.println("Buzz");



            } else {
                System.out.println( i );
            }
        }
    }
}



