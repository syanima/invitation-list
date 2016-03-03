import org.junit.Test;
import org.junit.Assert;

public class PersonTest {

    @Test
    public void test_for_get_name_with_first_and_last_name() throws Exception {
        Name name = new Name("Syanima","Sivadasan");
        Address address = new Address("Thrissur","Kerala","India");
        Person syani = new Person(name,address,21);
        Assert.assertEquals(syani.getNameWithFirstAndLast(" "),"Syanima Sivadasan");
    }

    @Test
    public void test_for_get_name_with_last_and_first_name() throws Exception {
        Name name = new Name("Syanima","Sivadasan");
        Address address = new Address("Thrissur","Kerala","India");
        Person syani = new Person(name,address,21);
        Assert.assertEquals(syani.getNameWithLastAndFirst(" "),"Sivadasan Syanima");
    }
}
