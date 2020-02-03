import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Kate", "OP3400", 120000.00, "Operations");

    }

    @Test
    public void canGetName() {
        assertEquals("Kate", manager.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals("OP3400", manager.getNINumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(120000, manager.getSalary());
    }

    @Test
    public void canPayBonus() {
        assertEquals(1200, manager.payBonus());
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Operations", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(1000.00);
        assertEquals(121000, manager.getSalary());
    }

}
