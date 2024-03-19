package Lab5.Ex2;

public class Shop {
    String address;
    String size;

    public Shop(String address,String size){
        this.address = address;
        this.size = size;
    }

    public String getInformation(){
        return "\nAddress: " + address + "\nSize: " + size;
    }
}
