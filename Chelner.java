public class Chelner extends Om {


    public Chelner(String Nume){
        super(Nume);
    }

    public void intalnesteClient(){
        System.out.println("Buna ziua, numele meu este " + nume + ", astazi voi fi chelnerul dumneavoastra");
    }

    public void showMeniu(){
        System.out.println("Avem 2 meniuri pentru dumneavoastra: Bar si Bufet, iar daca doriti avem si Kalean. Care vreti sa il vedeti?\n");
    }

    public void comanda(){
        System.out.println("Aici este comanda dumneavoastra, pofta buna!\n");
    }
}