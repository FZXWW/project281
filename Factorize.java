public class Factorize {

    LinkedList<Integer> listD = new LinkedList<Integer>();
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

        int x = 2, y = 2, d = 1, count = 0, multi = 1;
        boolean status = true;

        while (status) {
            x = gen.generaters(x, n);
            y = gen.generaters(gen.generaters(y, n), n);
            d = gd.gcd(x, y, n);

            if (d % 9 == 0)
                d = d / 9;
            else if (d % 7 == 0)
                d = d / 7;
            else if (d % 5 == 0)
                d = d / 5;
            else if (d % 3 == 0)
                d = d / 3;
            else if (d % 2 == 0)
                d = d / 2;

            // Debugging: print the values of x, y, and gcd
            System.out.println("x: " + x + ", y: " + y + ", gcd: " + d);

            if ((d > 1 && d < n) || multi <= n) {

                if (isPrime(d)) {
                    listD.addLast(d);
                    count++;
                    multi *= d;
                } else {
                    boolean isntZero = true;
                    int i = 2;
                    // d = 32
                    while (isntZero) {
                        if (d % i == 0) { // 24 % 2 =0 //12 % 2 == 0 //6 % 2 == 0 //3 % 3
                            listD.addLast(i); // [2,] //[2,2, ] //[2,2,2,] //[2,2,2,3]
                            d = d / i; // 24/2 = 12 //12 / 2 = 6 //6/2 = 3 // 3/3=1
                            if (d % i != 0)
                                i++; // 12 % 2 != 0 (false) //(false) //(true)i=3
                            if (d == 0 || d == 1)
                                isntZero = false;
                        }
                    }
                }

                if (multi == n)
                    status = false;
            }

            else if (d >= n)
                break;

        }

        System.out.println("Total factors found: " + count);
        listD.display();
        return listD;
    }

}

// ABDULLAH SOLUTION
// public int[] Factorizer(int n) {
// if (n == 0)
// return null;

// boolean loop = true;
// int x = 2, y = 2, d = 0, count = 0;

// while (loop) {
// x = generater(x, n);
// y = generater(generater(y, n), n);

// d = gcd(x, y, n);

// if (d > 1 && d < n) {
// list.insert(d);
// count++;
// }

// if (d >= n)
// loop = false;
// }

// list.findfirst();
// int[] arr = new int[count];

// for (int i = 0; i < count; i++) {
// arr[i] = list.retrieve();
// list.findnext();
// }
// System.out.println(count);
// return arr;
// }
