package Lab5.Ex2;

import java.util.Arrays;

public class Bakery extends Shop{
    String[] products = {"Bread","Buns"};

    public Bakery(String address,String size){
        super(address,size);
    }

    @Override
    public String getInformation() {
        return super.getInformation() + "\nProducts: " + Arrays.toString(products);
    }
}
