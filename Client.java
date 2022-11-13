public class Client extends Om{
    public int numar;
    public Client(String Nume,int Numar){
        super(Nume);
        numar = Numar;
    }

    void arrClient(){
        System.out.println(nume + " " + numar + " a ajuns\n");
    }
    void payClient(){
        System.out.println(nume + " " + numar + " a platit si a plecat.\n");
    }
    void clientComplaint(){
        System.out.println("Mancarea are un gust oribil, vreau sa vorbesc cu un Manager.");
    }
    void clientManager(){
        System.out.println("Mancarea are un gust oribil, nu vreau sa achit asa ceva");
    }

}