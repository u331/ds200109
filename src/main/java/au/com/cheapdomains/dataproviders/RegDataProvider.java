package au.com.cheapdomains.dataproviders;

import au.com.cheapdomains.model.Account;
import au.com.cheapdomains.model.AccountBuilder;
import org.testng.annotations.DataProvider;

public class RegDataProvider {

    Account busAU;
    Account persAU;
    Account persJP;
    Account busUA;
    Account busUS;
    Account persGB;

    public RegDataProvider() {
        busAU = new AccountBuilder()
                .withFirstName("Angus")
                .withLastName("Young")
                .withAddress("3rd Builders str.")
                .withCity("Melbourne")
                .withPostCode("12345")
                .withCountry("Australia")
                .withState("Victoria")
                .withPhoneNumber("(777)555-1234")
                .withEmail("angusyoung@gmail.com")
//                .withUserType("personal")
                .withUserType("business")
//                .withAbn("123-456-789")
                .withBusinessName("AC/DC")
                .withBusinessType("ACN")
                .withBusinessNumber("987-654-321")
                .withUserName("angus")
                .withPassword("young")
                .build();
        persAU = new AccountBuilder()
                .withFirstName("Brian")
                .withLastName("Johnson")
                .withAddress("Lizukova str.")
                .withCity("Adelaide")
                .withPostCode("12345")
                .withCountry("Australia")
                .withState("South Australia")
                .withPhoneNumber("(777)555-1234")
                .withEmail("brianjohnson@gmail.com")
                .withUserType("personal")
                .withAbn("123-456-789")
                .withUserName("brian")
                .withPassword("johnson")
                .build();
        persJP = new AccountBuilder()
                .withFirstName("Akira")
                .withLastName("Kurosawa")
                .withAddress("Shinagawa-juku, Tōkaidō")
                .withCity("Tokyo")
                .withPostCode("12345")
                .withCountry("Japan")
                .withState("Tokyo")
                .withPhoneNumber("(777)555-1234")
                .withEmail("akirakurosawa@gmail.com")
                .withUserType("personal")
                .withAbn("123-456-789")
                .withUserName("akira")
                .withPassword("kurosawa")
                .build();
        busUA = new AccountBuilder()
                .withFirstName("Andriy")
                .withLastName("Shevchenko")
                .withAddress("Krschatik str.")
                .withCity("Kiev")
                .withPostCode("12345")
                .withCountry("Ukraine")
                .withState("Kiev Oblast")
                .withPhoneNumber("(777)555-1234")
                .withEmail("andriyshevchenko@gmail.com")
                .withUserType("business")
                .withBusinessName("Dinamo")
                .withBusinessNumber("987-654-321")
                .withUserName("andriy")
                .withPassword("shevchenko")
                .build();
        busUS = new AccountBuilder()
                .withFirstName("John")
                .withLastName("Travolta")
                .withAddress("Krschatik str.")
                .withCity("Englewood")
                .withPostCode("12345")
                .withCountry("United States")
                .withState("New Jersey")
                .withPhoneNumber("(777)555-1234")
                .withEmail("johntravolta@gmail.com")
                .withUserType("business")
                .withBusinessName("Columbia Pictures")
                .withBusinessNumber("987-654-321")
                .withUserName("john")
                .withPassword("travolta")
                .build();
        persGB = new AccountBuilder()
                .withFirstName("Adele")
                .withLastName("Adkins")
                .withAddress("River str., Tottenham")
                .withCity("London")
                .withPostCode("12345")
                .withCountry("United Kingdom")
                .withState("London")
                .withPhoneNumber("(777)555-1234")
                .withEmail("adeleadkins@gmail.com")
                .withUserType("personal")
                .withAbn("123-456-789")
                .withUserName("adele")
                .withPassword("adkins")
                .build();
    }

    @DataProvider
    public Object[][] regUsers() {
        return new Object[][]{
                {busAU},
                {persAU},
                {persJP},
                {busUA},
                {busUS},
                {persGB}
        };
    }

}
