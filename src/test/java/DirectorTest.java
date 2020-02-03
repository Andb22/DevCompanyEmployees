import Staff.Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Kate", "OP3400", 120000.00, "Operations", 300000);
    }

    @Test
    public void canGetBudget(){
        assertEquals(300000, director.getBudget());
    }

    @Test
    public void canGetName() {
        assertEquals("Kate", director.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals("OP3400", director.getNINumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(120000, director.getSalary());
    }

    @Test
    public void canPayBonus() {
        assertEquals(2400, director.payBonus());
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Operations", director.getDeptName());
    }


    @Test
    public void canRaiseSalary() {
        director.raiseSalary(1000.00);
        assertEquals(121000, director.getSalary());
    }


    @Test
    public void canRaiseNegativeSalary() {
        director.raiseSalary(-1000.00);
        assertEquals(120000, director.getSalary());
    }

    @Test
    public void canSetName() {
        director.setName("Andrew");
        assertEquals("Andrew", director.getName());
    }

    @Test
    public void canPreventSettingNullName() {
        director.setName(null);
        assertEquals("Kate", director.getName());
    }
}
