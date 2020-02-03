import Staff.TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Kate", "OP3400", 120000.00);

    }

    @Test
    public void canGetName() {
        assertEquals("Kate", developer.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals("OP3400", developer.getNINumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(120000, developer.getSalary());
    }

    @Test
    public void canPayBonus() {
        assertEquals(1200, developer.payBonus());
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(1000.00);
        assertEquals(121000, developer.getSalary());
    }
}
