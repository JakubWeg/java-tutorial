import java.util.Scanner;

public class bank {


    public static void start() {

        int cmoney =0 ,bmenu,mon, mn=0;



        Scanner my = new Scanner(System.in);
        System.out.println("Witaj w aplikacji PKO.");
        do{


        System.out.println("Twoje saldo konta to :" + cmoney);


        System.out.println("Co chcesz zrobić ");

        System.out.println("Wpłacić pieniądze    -1"  );
        System.out.println("Wypłacić             -2"  );
        System.out.println("Zakończ              -3"  );
        bmenu = my.next().charAt(0);
        switch(bmenu) {

            case '1': {
                System.out.println("Ile chcesz wpłacić pieniędzy ? " );
                int addm = my.nextInt();

                cmoney =   addm + cmoney;
                System.out.println("Tranzakcja przyjęta " );
                break;


            }
            case '2': {
                System.out.println("Ile chcesz wypłacić pieniędzy ? ");

                int offm = my.nextInt();
                if (offm > cmoney) {
                    System.out.println("Tranzakcja nie  przyjęta ");

                    System.out.println("Nie masz wystarczająco pieniędzy  ");
                    break;

                } else {
                    System.out.println("Tranzakcja przyjęta ");

                    cmoney = cmoney - offm;
                    break;


                }


            }
            case'3':{
                mn++;





            }
        }
        }while(mn==0);
































    }

    }

