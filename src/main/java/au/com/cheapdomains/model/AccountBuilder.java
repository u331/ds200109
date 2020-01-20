package au.com.cheapdomains.model;

public class AccountBuilder {
    private String firstName = null;
    private String lastName = null;
    private String address = null;
    private String city = null;
    private String postCode = null;
    private String country = null;
    private String state = null;
    private String phoneNumber = null;
    private String email = null;
    private String userType = null;
    private String abn = null;
    private String businessName = null;
    private String businessType = null;
    private String businessNumber = null;
    private String userName = null;
    private String password = null;

    public AccountBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public AccountBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public AccountBuilder withAddress(String address) {
        this.address = address;
        return this;
    }

    public AccountBuilder withCity(String city) {
        this.city = city;
        return this;
    }

    public AccountBuilder withPostCode(String postCode) {
        this.postCode = postCode;
        return this;
    }

    public AccountBuilder withCountry(String country) {
        this.country = country;
        return this;
    }

    public AccountBuilder withState(String state) {
        this.state = state;
        return this;
    }

    public AccountBuilder withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public AccountBuilder withEmail(String email) {
        this.email = email;
        return this;
    }

    public AccountBuilder withUserType(String userType) {
        this.userType = userType;
        return this;
    }

    public AccountBuilder withAbn(String abn) {
        this.abn = abn;
        return this;
    }

    public AccountBuilder withBusinessName(String businessName) {
        this.businessName = businessName;
        return this;
    }

    public AccountBuilder withBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }

    public AccountBuilder withBusinessNumber(String businessNumber) {
        this.businessNumber = businessNumber;
        return this;
    }

    public AccountBuilder withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public AccountBuilder withPassword(String password) {
        this.password = password;
        return this;
    }

    public Account build() {
        return new Account(firstName, lastName,
                address, city, postCode, country, state, phoneNumber, email,
                userType, abn, businessName, businessType, businessNumber,
                userName, password);
    }
}
