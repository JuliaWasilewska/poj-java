package Lab6.Ex1;

public class Firma {
    Pracownik[] workers;

    public Firma(Pracownik... workers){
        this.workers = workers;
    }

    public int obliczMiesiecznyKosztFirmy(){
        int cost = 0;
        for (Pracownik a: workers){
            cost += a.getDailypay() * 20;
        }
        return cost;
    }

    public int obliczRocznyKosztFirmy(){
        int cost = 0;
        for (Pracownik a: workers){
            cost += a.getDailypay() * 240;
        }
        return cost;
    }

    public int obliczKosztFirmy(Czas x,int krotnosc){
        int cost = 0;
        for (Pracownik a: workers){
            cost += a.getDailypay() * x.getValues() * krotnosc;
        }
        return cost;
    }
}
