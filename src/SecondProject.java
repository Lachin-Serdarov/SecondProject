
import java.util.Scanner;

public class SecondProject {
    public static void main(String[] args) {

        // Dərs 1

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ədəd daxil edin: ");

        int a=scanner.nextInt();

        if (a%2==0) {
            System.out.println(a + " = cüt ədəddir.");
        } else {
            System.out.println(a + " - tək ədəddir.");
        }

        // Dərs 2

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Üç ədəd daxil edin: ");

        int a1=scanner.nextInt();
        int b1=scanner.nextInt();
        int c1=scanner.nextInt();

        int max=a1, min=a1;

        if (b1>max) max=b1;
        if (c1>max) max=c1;

        if (b1<min) min=b1;
        if (c1<min) min=c1;

        System.out.println("Ən bğyük ədəd: " + max + "\nƏn kiçik ədəd: " + min);

        // Dərs 3

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Bal daxil et (0 - 100): ");

        int bal=scanner.nextInt();

        if (bal>=91 && bal<=100) {
            System.out.println("Qiymət: A");
        } else if (bal>=81 && bal<90) {
            System.out.println("Qiymət: B");
        }
            else if (bal>= 71 && bal<=80) {
                System.out.println("Qiymət: C");
            }
                else if (bal>=61 && bal<=70) {
                    System.out.println("Qiymət: D");
                }
                else if (bal>=0 && bal<=60) {
            System.out.println("Qiymət: F (Kəsildiniz)");
                }
                else {
            System.out.println("Səhv bal daxil edilib! Bal 0 ilə 100 arasında olmalıdır.");
                }

        // Dərs 4

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Üç ədəd daxil edin: ");

        double a2=scanner.nextDouble(), b2=scanner.nextDouble(), c2=scanner.nextDouble();
        if ((a2 + b2 > c2) && (a2 + c2 > b2) && (b2 + c2 > a2)) {
            System.out.println("Bu tərəflərlə üçbucaq qurmaq olar.");
        } else {
            System.out.println("Bu tərəflərlə üçbucaq qurmaq OLMAZ.");
        }

        // Dərs 5

        Scanner scanner4 = new Scanner(System.in);
        System.out.println("İki ədəd və bir əməliyyat işarəsi daxil edin: ");

        double a5=scanner.nextDouble(), b5=scanner.nextDouble();

        char h5=scanner.next().charAt(0);

        if (h5 == '+') {
            System.out.println("Nəticə: " + a5 + "+" + b5 + "=" + (a5 + b5));
        }
        else if (h5 == '-') {
            System.out.println("Nəticə: " + a5 + "-" + b5 + "=" + (a5 - b5));
        }
        else if (h5 == '*') {
            System.out.println("Nəticə: " + a5 + "*" + b5 + "=" + (a5 * b5));
        }
        else if (h5 == '/') {
            if (b5 != 0) {
                System.out.println("Nəticə: " + a5 + "/" + b5 + "=" + (a5 / b5));
            } else {
                System.out.println("Xəta: Sıfıra bölmək olmaz!");
            }
        }

        // Dərs 6

        int n=9;
        int m=7;

        n=n+m;
        m=n-m;
        n=n-m;
        System.out.println("n= " + n);
        System.out.println("m= " + m);












        scanner1.close();


    }
}
