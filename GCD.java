public class GCD {

    public int gcd(int x , int n ){

        if( x == 0  ) return n;
        if(n == 0 ) return x;

        if( x < 1 || n < 1) return 0;


       if(x > n ) return gcd(n , x%n);
       else return gcd(x , n%x );
    }


    
}
