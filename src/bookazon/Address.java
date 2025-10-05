package bookazon;

public class Address {
    private String line1;
    private String line2;
    private String city;
    private String state;
    private String zip;
    private String country;

    public Address(String line1, String line2, String city, String state, String zip, String country) {
        this.line1 = line1;
        this.line2 = line2;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
    }

    @Override
    public String toString() {
        return line1 + ", " + line2 + ", " + city + ", " + state + ", " + zip + ", " + country;
    }

    public static void validateAddress(Address address) {
        if (address == null) {
            throw new IllegalArgumentException("Invalid Address!");
        }
    }
}
