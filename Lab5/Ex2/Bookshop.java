package Lab5.Ex2;

import java.util.Arrays;

public class Bookshop extends Shop{
    String[] products = {"Harry Potter and the Philosopher's Stone",
            "Harry Potter and the Chamber of Secrets",
            "Harry Potter and the Prisoner of Azkaban",
            "Harry Potter and the Goblet of Fire",
            "Harry Potter and the Order of the Phoenix",
            "Harry Potter and the Half-Blood Prince",
            "Harry Potter and the Deathly Hallows"};

    public Bookshop(String address,String size){
        super(address,size);
    }

    @Override
    public String getInformation() {
        return super.getInformation() + "\nProducts: " + Arrays.toString(this.products);
    }
}
