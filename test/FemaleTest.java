import org.junit.Test;
import org.junit.Assert;

public class FemaleTest {
    @Test
    public void test_that_add_suffix_to_female_person_with_first_and_last_name() throws Exception {
        Name name = new Name("Sivasree","Sivadasan");
        Address address = new Address("Thrissur","Kerala","India");
        Female sivasree = new Female(name,address,21);
        Assert.assertEquals(sivasree.getNameWithFirstAndLast(" "),"Ms Sivasree Sivadasan");
    }
    @Test
    public void test_that_add_suffix_to_female_person_with_last_and_first_name() throws Exception {
        Name name = new Name("Sivasree","Sivadasan");
        Address address = new Address("Thrissur","Kerala","India");
        Female sivasree = new Female(name,address,21);
        Assert.assertEquals(sivasree.getNameWithLastAndFirst(" "),"Ms Sivadasan Sivasree");
    }
}
