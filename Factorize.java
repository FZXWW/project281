public class Factorize {

    LinkedList<Integer> listD = new LinkedList<Integer>();
    LinkedList O = new LinkedList();

    generater gen = new generater();
    GCD gd = new GCD();

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // If divisible by any number other than 1 and itself, it's not prime
            }
        }
        return true; // If no divisors were found, it's prime
    }


    

    public LinkedList<Integer> Factorizer(int n) {

        int d=1 ,  x = 2, y = 2;

        int i = 1; // avoid Infinit Loop

        int maxIteration = 30;

        while(i < maxIteration){

            d = 1;

        while( (d == 1 || d == n) ){
            x = gen.generaters(x, n);
            y = gen.generaters(gen.generaters(y, n), n);

            d = gd.gcd(Math.abs(x - y), n);


        }
        


        if(isPrime(d))
            listD.addLast(d);


        else if (d % 9 == 0){
            d = d / 9;
            listD.addLast(d);
            listD.addLast(d);

        }
         else if (d % 7 == 0){
            d = d / 7;
            listD.addLast(d);
            listD.addLast(d);

        }
        else if (d % 5 == 0){
            d = d / 5;
            listD.addLast(d);
            listD.addLast(d);

        }
        else if (d % 3 == 0){
            d = d / 3;
            listD.addLast(d);
            listD.addLast(d);

        }
    //    else if(!isPrime(d)){ 
    //     for(int s = 3 ; i < Math.sqrt(d) ; s = s + 2 ){
    //         d = d/s;
    //         listD.addLast(d);
    //         listD.addLast(d);

    //     }
    //}
        
        else if (d % 2 == 0){
            d = d / 2;
            listD.addLast(d);
            listD.addLast(d);

        }

       

         else gen.c++;

         @SuppressWarnings("unchecked")
        int multi = O.myltiplyALL(listD);

        if(multi == n)
            break;

         i++;

    }
        
             listD.display();
            return listD;

    }

}

// mohammad SOLUTION
// public LinkedList<Integer> Factorizer(int n) {

//     int x = 2, y = 2, d = 1, count = 0, multi = 1;
//     boolean status = true;

//     while (status) {
        
//         x = gen.generaters(x, n);
//         y = gen.generaters(gen.generaters(y, n), n);

//         d = gd.gcd(Math.abs(x - y), n);

//         int mx = 1; // avoid Infinit Loop
//         int maxIteration = 10;

//         if (d % 9 == 0)
//             d = d / 9;
//         else if (d % 7 == 0)
//             d = d / 7;
//         else if (d % 5 == 0)
//             d = d / 5;
//         else if (d % 3 == 0)
//             d = d / 3;
//         else if (d % 2 == 0)
//             d = d / 2;

//         // Debugging: print the values of x, y, and gcd
//         System.out.println("x: " + x + ", y: " + y + ", gcd: " + d);

        

//         if ((d > 1 && d < n) || multi == n) {

//             if (isPrime(d)) {
//                 listD.addLast(d);
//                 count++;
//                 multi *= d;
//             } 

//             if (multi == n)
//                 status = false;
//         }

//         else if (d >= n)
//             break;

//     }

//     System.out.println("Total factors found: " + count);
//     listD.display();
//     return listD;
// }