import Managment.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestManager {

    Manager manager1;

    @Before
     public void setup() {
        manager1 = new Manager("Ben", "NI69420", 19000,  "Bitches");
    }

    @Test
    public void hasName(){
        assertEquals("Ben", manager1.getName());
    }

    @Test
    public void hasNI(){
        assertEquals("NI69420", manager1.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(19000, manager1.getSalary());
    }

    @Test
    public void hasDeptName(){
        assertEquals("Bitches", manager1.getDeptName());
    }

    @Test
    public void salaryCanRaise(){
        manager1.raiseSalary(1000);
        assertEquals(20000, manager1.getSalary());
    }

    @Test
    public void hasBonusAmount(){
        assertEquals(190, manager1.bonus(), 0.0);
    }
}
