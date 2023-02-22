import TechStaff.DatabaseAdmin;
import TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDeveloper {

    Developer developer1;

    @Before
    public void setup() {
        developer1 = new Developer("Wiliam Williams", "NI69422", 18000);
    }

    @Test
    public void hasName(){
        assertEquals("Wiliam Williams", developer1.getName());
    }

    @Test
    public void hasNI(){
        assertEquals("NI69422", developer1.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(18000, developer1.getSalary());
    }

    @Test
    public void salaryCanRaise(){
        assertEquals("Valid Input", developer1.raiseSalary(1000));
    }

    @Test
    public void salaryCanNotRaise(){
        assertEquals("Fuck You", developer1.raiseSalary(-1000));
    }


    @Test
    public void hasBonusAmount(){
        assertEquals(180, developer1.bonus(), 0.0);
    }
}
