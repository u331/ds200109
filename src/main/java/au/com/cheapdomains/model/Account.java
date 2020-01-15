package au.com.cheapdomains.model;

public class Account {
    private String firstName = null;
    private String lastName = null;
    private String address = null;
    private String city = null;
    private String postCode = null;
    private String country = null;
    private String state;
    private String phoneNumber = null;
    private String email = null;
    private String userType = null;
    private String abn = null;
    private String businessName = null;
    private String businessType = null;
    private String businessNumber = null;
    private String userName = null;
    private String password = null;

    public Account() {
    }

    public Account(String firstName, String lastName,
                   String address, String city, String postCode, String country,
                   String state, String phoneNumber, String email,
                   String userType, String abn, String businessName, String businessType,
                   String businessNumber, String userName, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.postCode = postCode;
        this.country = country;
        this.state = state;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.userType = userType;
        this.abn = abn;
        this.businessName = businessName;
        this.businessType = businessType;
        this.businessNumber = businessNumber;
        this.userName = userName;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getCountry() {
        return country;
    }

    public String getState() {
        return state;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getUserType() {
        return userType;
    }

    public String getAbn() {
        return abn;
    }

    public String getBusinessName() {
        return businessName;
    }

    public String getBusinessType() {
        return businessType;
    }

    public String getBusinessNumber() {
        return businessNumber;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public void setAbn(String abn) {
        this.abn = abn;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public void setBusinessNumber(String businessNumber) {
        this.businessNumber = businessNumber;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Account{" +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", postcode='" + postCode + '\'' +
                ", country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", phone_number='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", userType='" + userType + '\'' +
                ", abn='" + abn + '\'' +
                ", businessName='" + businessName + '\'' +
                ", businessType='" + businessType + '\'' +
                ", businessNumber='" + businessNumber + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
