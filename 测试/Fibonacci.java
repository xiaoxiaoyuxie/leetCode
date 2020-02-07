import javax.management.ListenerNotFoundException;

public class Fibonacci {
    // 0,1,1,2,3,5,8,13,21,34,55,89,144,233,370...
    static int count = 0;
    public int fib (int n){
        count++;
        if (n <= 1 ) {
            return n;
        }
        System.out.println("现在是"+n);
        return fib(n-1) + fib(n-2);
    }

    public int fib2 (int n){
        int cun = 0;
        int next = 1;
        for (int i = 2; i < n ; i++) {
            int temp = next;
            next = cun +next;
            cun = temp;
        }
        return cun + next;
    }

    public int Test1 (int n){
        int res = 1;    
        for (int i = 0; i < n; i++) {
            res = res *2;
        }
        return res;
    }

    public static void main(String[] args) {
        Fibonacci test = new Fibonacci();
        // int aa = test.Test1(30);
        int aa = test.fib2(10);
        // test.hahList(null);
        // System.out.println("总共"+count +"次");
        System.out.println(aa);
    }
}