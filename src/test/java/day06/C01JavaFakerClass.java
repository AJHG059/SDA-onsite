package day06;

import com.github.javafaker.Faker;
import org.junit.Test;

public class C01JavaFakerClass {


    @Test
    public void testFaker() {

        //this cruting random/Fake name/any string
        Faker faker = new Faker();
        String fullname1 = faker.name().fullName();
        String fullname2 = faker.name().fullName();

        System.out.println("fullname1 = " + fullname1);
        System.out.println("fullname2 = " + fullname2);


        //random number you can use limt number by use number between
        System.out.println("faker.number() = " + faker.number().numberBetween(100, 999));

        //you can print to value or mort but you mast save it in object to store
        System.out.println(fullname1 + " + " + fullname2);

        // cruting fake address and full address
        System.out.println("faker.address().fullAddress() = " + faker.address().fullAddress());

        //we can cruting fake intrint like domin name or password in multible condiction you can add any term you want
        System.out.println(faker.internet().password(6, 8, true, true, false));
    }

}
