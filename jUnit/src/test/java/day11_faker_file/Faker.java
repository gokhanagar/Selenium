package day11_faker_file;

import org.junit.Test;

public class Faker {

    //fake data = mock data, data is not real
    //fake ssn, fake name, fake address
    //we can use fake data to test
    // we can use faker class while generating fake data


    /*
    Where do you get your test data? Who gives you test data?
    1.BA = Business Analyst
    2.Test Lead
    3.Manual Tester
    4.Tech Lead = Team Tech = Dev Lead
     */

    //We added faker dependency
    @Test
    public void fakerTest() {
        //Create faker object
        com.github.javafaker.Faker faker = new com.github.javafaker.Faker();

        //Generate fake data
        String fName = faker.name().firstName();
        System.out.println(fName);

        String lName = faker.name().lastName();
        System.out.println(lName);

        String fullName = faker.name().fullName();
        System.out.println(fullName);

        String userName = faker.name().username();
        System.out.println(userName);

        String title = faker.name().title();
        System.out.println(title);

        String city = faker.address().city();
        System.out.println(city);

        String state = faker.address().state();
        System.out.println(state);

        String fullAddress = faker.address().fullAddress();
        System.out.println(fullAddress);

        String cellPhone = faker.phoneNumber().cellPhone();
        System.out.println(cellPhone);

        String email = faker.internet().emailAddress();
        System.out.println(email);

        String randomZipCode = faker.number().digits(5);
        System.out.println(randomZipCode);

    }
}
