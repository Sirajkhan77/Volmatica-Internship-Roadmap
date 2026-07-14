package Week2.Day1;

public class Address {
    private String street;
    private String city;
    private String zipCode;

    public Address(String street, String city, String zipCode) {
        setStreet(street);
        setCity(city);
        setZipCode(zipCode);
    }

    public String getStreet() { return street; }

    public void setStreet(String street) {
        if (street == null || street.trim().isEmpty()) {
            throw new IllegalArgumentException("Street cannot be null or empty.");
        }
        this.street = street;
    }

    public String getCity() { return city; }

    public void setCity(String city) {
        if (city == null || city.trim().isEmpty()) {
            throw new IllegalArgumentException("City cannot be null or empty.");
        }
        this.city = city;
    }

    public String getZipCode() { return zipCode; }

    public void setZipCode(String zipCode) {
        if (zipCode == null || !zipCode.matches("\\d{5}")) { // Example: exactly 5 digits
            throw new IllegalArgumentException("Zip code must be exactly 5 digits.");
        }
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Address{");
        sb.append("street='").append(street).append('\'');
        sb.append(", city='").append(city).append('\'');
        sb.append(", zipCode='").append(zipCode).append('\'');
        sb.append('}');
        return sb.toString();
    }
}