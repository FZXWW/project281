public class GCD {

    public int gcd(int x , int y , int n ){

        int sub = Math.abs(x - y); // to make sure the number is positive 

        if( sub == 0  ) return n;


        while ( sub != 0 ){ //Euclidean
            int temp = sub;
            sub = n % sub;
            n = temp;
        }
        return n;
    }


    
}
