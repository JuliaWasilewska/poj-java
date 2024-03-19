package Lab5.Ex4;

public class Address {
    String street;
    String city;
    String state;
    String postalCode;
    String country;

    public Address(String street, String city, String state, String postalCode, String country) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address:\n" +
                "\tStreet:\t\t" + street + '\n' +
                "\tCity:\t\t" + city + '\n' +
                "\tState:\t\t" + state + '\n' +
                "\tPostalCode:\t" + postalCode + '\n' +
                "\tCountry:\t" + country + '\n';
    }
}
