import java.util.Scanner;
class main {
    public static void main(String[] args) {
        int a, s = 123;

        Calculator calc = new Calculator();
        char prognum;

        String haslop = "1";

        System.out.println("Witaj.Jak się nazywasz?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        do {

            System.out.println("Wprowadz hasło?");
            String haslo = sc.nextLine();
            System.out.println("Witaj" +" "+ name + " "+ "w systemie catdroid");

            if (haslo.equalsIgnoreCase(haslop)) {
                System.out.println("Wybierz program ");
                System.out.println("Kalkulator     -1 ");
                System.out.println("Bank           -2 ");
                System.out.println("Wyłącz telefon -3 ");



                prognum = sc.next().charAt(0);
                switch(prognum) {

                    case '1': {
                        calc.start();


                    }
                    case '2': {
                        bank.start();


                    }

                    case'3':{System.out.println("Pa PA" + " "+ name);
                        System.exit(0);}
                }

                Scanner appScan = new Scanner(System.in);
                String application = sc.nextLine();
                do {




                } while (application.isEmpty());
            } else{ System.out.println("Złe hasło");}

        } while (true);
    }
}
