import Staff.TechStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {


    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Kate", "OP3400", 120000.00);

    }

    @Test
    public void canGetName() {
        assertEquals("Kate", databaseAdmin.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals("OP3400", databaseAdmin.getNINumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(120000, databaseAdmin.getSalary());
    }

    @Test
    public void canPayBonus() {
        assertEquals(1200, databaseAdmin.payBonus());
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(1000.00);
        assertEquals(121000, databaseAdmin.getSalary());
    }
}

