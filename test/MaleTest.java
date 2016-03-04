import org.junit.Test;
import org.junit.Assert;

public class MaleTest {

    @Test
    public void testGetAddressGivesRepresentationOfAddressWithPrefixMr() throws Exception {
        Name name = new Name("Rasool", "Pookuty");
        Address address = new Address("Thrissur", "Kerala", "India");
        Person rasool = new Male(name, address, 32);
        String expected = "Mr Rasool Pookuty\nThrissur, Kerala, India";
        Assert.assertEquals(expected,rasool.getAddress());

    }

    @Test
    public void testGetAddressWithOptionsGivenGivesAddressWithPrefixMr() throws Exception {
        Name name = new Name("Rasool", "Pookuty");
        Address address = new Address("Thrissur", "Kerala", "India");
        Person rasool = new Male(name, address, 32);
        String expected = "Mr Rasool, Pookuty\nThrissur, Kerala, India";
        Assert.assertEquals(expected, rasool.getAddress(true, ", "));

        expected = "Mr Pookuty, Rasool\nThrissur, Kerala, India";
        Assert.assertEquals(expected, rasool.getAddress(false, ", "));
    }

    @Test
    public void testGetAddressWithCountryGivesAddressWithPrefixMr() throws Exception {
        Name name = new Name("Rasool", "Pookuty");
        Address address = new Address("Thrissur", "Kerala", "India");
        Person rasool = new Male(name, address, 32);
        String expected = "Mr Rasool Pookuty, India";
        Assert.assertEquals(expected, rasool.getAddressWithCountry());
    }

    @Test
    public void testGetAddressWithCountryWithGivenOptionsGivesAddressWithPrefixMr() throws Exception {
        Name name = new Name("Rasool", "Pookuty");
        Address address = new Address("Thrissur", "Kerala", "India");
        Person rasool = new Male(name, address, 32);
        String expected = "Mr Rasool, Pookuty, India";
        Assert.assertEquals(expected, rasool.getAddressWithCountry(true, ", "));

        expected = "Mr Pookuty, Rasool, India";
        Assert.assertEquals(expected, rasool.getAddressWithCountry(false, ", "));
    }
}
