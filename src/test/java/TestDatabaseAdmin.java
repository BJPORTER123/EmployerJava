import Managment.Manager;
import TechStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDatabaseAdmin {

    DatabaseAdmin databaseAdmin1;

    @Before
    public void setup() {
        databaseAdmin1 = new DatabaseAdmin("Judy Hobbs", "NI69421", 18000);
    }

    @Test
    public void hasName(){
        assertEquals("Judy Hobbs", databaseAdmin1.getName());
    }

    @Test
    public void hasNI(){
        assertEquals("NI69421", databaseAdmin1.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(18000, databaseAdmin1.getSalary());
    }

    @Test
    public void salaryCanRaise(){
        databaseAdmin1.raiseSalary(1000);
        assertEquals(19000, databaseAdmin1.getSalary());
    }

    @Test
    public void hasBonusAmount(){
        assertEquals(180, databaseAdmin1.bonus(), 0.0);
    }
}
