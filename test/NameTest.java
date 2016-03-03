import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NameTest {
    @Test
    public void test_that_gives_the_first_and_last_name_of_a_person() throws Exception {
        Name akku = new Name("Aroh","Kumar");
        assertEquals("Aroh, Kumar",akku.firstLast(", "));
    }
    @Test
    public void test_that_gives_the_last_and_first_name_of_a_person() throws Exception {
        Name akku = new Name("Aroh","Kumar");
        assertEquals("Kumar, Aroh",akku.lastFirst(", "));
    }

    @Test
    public void test_that_gives_the_last_and_first_name_of_a_person_with_suffix_Mr() throws Exception {
        Name akku = new Name("Aroh","Kumar");
        akku.addSuffixMr();
        assertEquals("Mr Kumar Aroh",akku.lastFirst(" "));
    }

    @Test
    public void test_that_gives_the_first_and_last_name_of_a_person_with_suffix_Ms() throws Exception {
        Name janu = new Name("Syanima","Sivadasan");
        janu.addSuffixMs();
        assertEquals("Ms Syanima Sivadasan",janu.firstLast(" "));
    }

}
