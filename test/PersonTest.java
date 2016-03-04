import org.junit.Test;
import org.junit.Assert;

public class PersonTest {

    @Test
    public void testGetAddressGivesRepresentationOfAddress() throws Exception {
        Name name = new Name("Rasool", "Pookuty");
        Address address = new Address("Thrissur", "Kerala", "India");
        Person rasool = new Person(name, address, 32);
        String expected = "Rasool Pookuty\nThrissur, Kerala, India";
        Assert.assertEquals(expected, rasool.getAddress());

    }

    @Test
    public void testGetAddressWithOptionsGiven() throws Exception {
        Name name = new Name("Rasool", "Pookuty");
        Address address = new Address("Thrissur", "Kerala", "India");
        Person rasool = new Person(name, address, 32);
        String expected = "Rasool, Pookuty\nThrissur, Kerala, India";
        Assert.assertEquals(expected, rasool.getAddress(true, ", "));

        expected ="Pookuty, Rasool\nThrissur, Kerala, India";
        Assert.assertEquals(expected, rasool.getAddress(false, ", "));
    }

    @Test
    public void testGetAddressWithCountry() throws Exception {
        Name name = new Name("Rasool", "Pookuty");
        Address address = new Address("Thrissur", "Kerala", "India");
        Person rasool = new Person(name, address, 32);
        String expected = "Rasool Pookuty, India";
        Assert.assertEquals(expected, rasool.getAddressWithCountry());
    }

    @Test
    public void testGetAddressWithCountryWithGivenOptions() throws Exception {
        Name name = new Name("Rasool", "Pookuty");
        Address address = new Address("Thrissur", "Kerala", "India");
        Person rasool = new Person(name, address, 32);
        String expected = "Rasool, Pookuty, India";
        Assert.assertEquals(expected, rasool.getAddressWithCountry(true, ", "));

        expected = "Pookuty, Rasool, India";
        Assert.assertEquals(expected, rasool.getAddressWithCountry(false, ", "));
    }
}
