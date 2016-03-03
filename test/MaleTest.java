import org.junit.Test;
import org.junit.Assert;

public class MaleTest {
    @Test
    public void test_that_add_suffix_to_male_person_with_first_and_last_name() throws Exception {
        Name name = new Name("Siva","Sivadasan");
        Address address = new Address("Thrissur","Kerala","India");
        Male siva = new Male(name,address,21);
        Assert.assertEquals(siva.getNameWithFirstAndLast(" "),"Mr Siva Sivadasan");
    }
    @Test
    public void test_that_add_suffix_to_male_person_with_last_and_first_name() throws Exception {
        Name name = new Name("Siva","Sivadasan");
        Address address = new Address("Thrissur","Kerala","India");
        Male siva = new Male(name,address,21);
        Assert.assertEquals(siva.getNameWithLastAndFirst(" "),"Mr Sivadasan Siva");
    }
}
