public class main {
    public static  void Main(String[] args){
        Restaurant res = new Restaurant();
        res.showRestaurant();

        Chelner ch1 = new Chelner("Diana");
        Chelner ch2 = new Chelner("Dumitru");
        Client c1 = new Client("Clientul", 1);
        Client c2 = new Client("Clientul", 3);
        Manager m1 = new Manager("Ion", "Manager General");
        m1.openRestaurnt();

        Bar b1 = new Bar("Bar");
        Bufet bufet1 = new Bufet("Bufet");
        Kalean k1 = new Kalean("Kalean");

        c1.arrClient();
        ch1.intalnesteClient();
        ch1.showMeniu();

        //Random zone
        int min = 1;
        int max = 3;
        int min2 = 1;
        int max2 = 4;
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        int random_int2 = (int)Math.floor(Math.random()*(max2-min2+1)+min2);

        //Client alegeri random
        if(random_int == 1){
            System.out.println("Clientul a ales " + b1.nume + " meniu: ");
            b1.showArticole();
            System.out.println("Clientul a facut comanda");
            ch1.comanda();
            if(random_int2 > 1) {
                c1.payClient();
            }else{
                c1.clientComplaint();
                m1.vorbesteClient();
                c1.clientManager();
                m1.comandaAnulata();
                c1.payClient();
            }
        } else if (random_int == 2) {
            System.out.println("Clientul a ales " + bufet1.nume + " meniu: ");
            bufet1.showArticole();
            System.out.println("Clientul a facut comanda");
            ch1.comanda();
            if(random_int2 > 1) {
                c1.payClient();
            }else{
                c1.clientComplaint();
                m1.vorbesteClient();
                c1.clientManager();
                m1.comandaAnulata();
                c1.payClient();
            }
        }else{
            System.out.println("Clientul a ales " + k1.nume + " meniu: ");
            k1.showArticole();
            System.out.println("Clientul a facut comanda");
            ch1.comanda();
            if(random_int2 > 1) {
                c1.payClient();
            }else{
                c1.clientComplaint();
                m1.vorbesteClient();
                c1.clientManager();
                m1.comandaAnulata();
                c1.payClient();
            }
        }

        //Alt Client
        c2.arrClient();
        ch2.intalnesteClient();
        ch2.showMeniu();



        //Client alegeri random
        if(random_int == 3){
            System.out.println("Clientul a ales " + b1.nume + " meniu: ");
            b1.showArticole();
            System.out.println("Clientul a facut comanda");
            ch2.comanda();
            if(random_int2 == 2) {
                c2.payClient();
            }else{
                c2.clientComplaint();
                m1.vorbesteClient();
                c2.clientManager();
                m1.comandaAnulata();
                c2.payClient();
            }
        } else if (random_int == 1) {
            System.out.println("Clientul a ales " + bufet1.nume + " meniu: ");
            bufet1.showArticole();
            System.out.println("Clientul a facut comanda");
            ch2.comanda();
            if(random_int2 == 4) {
                c2.payClient();
            }else{
                c2.clientComplaint();
                m1.vorbesteClient();
                c2.clientManager();
                m1.comandaAnulata();
                c2.payClient();
            }
        }else{
            System.out.println("Clientul a ales " + k1.nume + " meniu: ");
            k1.showArticole();
            System.out.println("Clientul a facut comanda");
            ch2.comanda();
            if(random_int2 == 1) {
                c2.payClient();
            }else{
                c2.clientComplaint();
                m1.vorbesteClient();
                c2.clientManager();
                m1.comandaAnulata();
                c2.payClient();
            }
        }
        
        m1.closeRestaurant();

    }
}
