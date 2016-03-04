import org.junit.Test;
import org.junit.Assert;

public class FemaleTest {

    @Test
    public void testGetAddressGivesRepresentationOfAddressWithPrefixMs() throws Exception {
        Name name = new Name("Thasleema", "Nasrin");
        Address address = new Address("Thrissur", "Kerala", "India");
        Person thasleema = new Female(name, address, 35);
        String expected = "Ms Thasleema Nasrin\nThrissur, Kerala, India";
        Assert.assertEquals(expected,thasleema.getAddress());
    }

    @Test
    public void testGetAddressWithOptionsGivenGivesAddressWithPrefixMr() throws Exception {
        Name name = new Name("Thasleema", "Nasrin");
        Address address = new Address("Thrissur", "Kerala", "India");
        Person thasleema = new Female(name, address, 35);
        String expected = "Ms Thasleema, Nasrin\nThrissur, Kerala, India";
        Assert.assertEquals(expected, thasleema.getAddress(true, ", "));

        expected = "Ms Nasrin, Thasleema\nThrissur, Kerala, India";
        Assert.assertEquals(expected, thasleema.getAddress(false, ", "));
    }

    @Test
    public void testGetAddressWithCountryGivesAddressWithPrefixMr() throws Exception {
        Name name = new Name("Thasleema", "Nasrin");
        Address address = new Address("Thrissur", "Kerala", "India");
        Person thasleema = new Female(name, address, 35);
        String expected = "Ms Thasleema Nasrin, India";
        Assert.assertEquals(expected, thasleema.getAddressWithCountry());
    }

    @Test
    public void testGetAddressWithCountryWithGivenOptionsGivesAddressWithPrefixMr() throws Exception {
        Name name = new Name("Thasleema", "Nasrin");
        Address address = new Address("Thrissur", "Kerala", "India");
        Person thasleema = new Female(name, address, 35);
        String expected = "Ms Thasleema, Nasrin, India";
        Assert.assertEquals(expected, thasleema.getAddressWithCountry(true, ", "));

        expected = "Ms Nasrin, Thasleema, India";
        Assert.assertEquals(expected, thasleema.getAddressWithCountry(false, ", "));
    }

}
