package in.teramatrix.googleservices.model;

/**
 * Author       :   Mohsin Khan
 * Designation  :   Android Developer
 * Description  :   Defined for reverse geo-coding. Google's Geo coded data will be filled in this model.
 */
@SuppressWarnings("unused")
public class Address {
    private String pin;
    private String city;
    private String state;
    private String country;
    private String district;
    private String addressOne;
    private String addressTwo;

    public Address() {

    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getAddressOne() {
        return addressOne;
    }

    public void setAddressOne(String addressOne) {
        this.addressOne = addressOne;
    }

    public void setAddressTwo(String addressTwo) {
        this.addressTwo = addressTwo;
    }


    @Override
    public String toString() {
        return getExactValue(addressOne)
                +getExactValue(addressTwo)
                +getExactValue(city)
                +getExactValue(district)
                +getExactValue(state)
                +getExactValue(country)
                +pin;
    }

    private String getExactValue(String value) {
        if (value != null)
            return (value.equals("null")) ? "" : value + ", ";
        else
            return "";
    }
}
