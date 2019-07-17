import java.util.Scanner;

public class Calculator {

    public void start() {

        int cal , end = -1;
        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("Co chcesz zrobić ");

            System.out.println("Dodawanie   -1"  );
            System.out.println("Odejmowanie -2"  );
            System.out.println("Mnożenie    -3"  );
            System.out.println("Dzielenie   -4"  );
            System.out.println("Zakończ     -5"  );



            cal = sc.nextInt();
            switch (cal) {


                case 1: {


                    Scanner sc2 = new Scanner(System.in);
                    System.out.println("Podaj pierwsza liczbe:  ");
                    int fn = sc2.nextInt();
                    System.out.println("Podaj druga liczbe:  " );
                    int sn = sc2.nextInt();


                    System.out.println(fn + sn);
                    break;


                }
                case 2: {


                    Scanner sc2 = new Scanner(System.in);
                    System.out.println("Podaj pierwsza liczbe:  ");
                    int fn = sc2.nextInt();
                    System.out.println("Podaj druga liczbe:  ");
                    int sn = sc2.nextInt();


                    System.out.println(fn - sn);
                    break;

                }


                case 3: {


                    Scanner sc2 = new Scanner(System.in);
                    System.out.println("Podaj pierwsza liczbe:  ");
                    int fn = sc2.nextInt();
                    System.out.println("Podaj druga liczbe:  ");
                    int sn = sc2.nextInt();


                    System.out.println(fn * sn);
                    break;

                }


                case 4: {


                    Scanner sc2 = new Scanner(System.in);
                    System.out.println("Podaj pierwsza liczbe:  ");
                    int fn = sc2.nextInt();
                    System.out.println("Podaj druga liczbe:  ");
                    int sn = sc2.nextInt();


                    System.out.println(fn / sn);
                    break;

                }
                case 5: {
                    end = 0;




                    break;

                }
            }
        } while(end != 0);


    }
}







