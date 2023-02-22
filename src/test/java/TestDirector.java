import Managment.Director;
import Managment.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDirector {

    Director director1;

    @Before
    public void setup() {
        director1 = new Director("Dan", "NI69423", 50000, "Ben's mum", 2000000);
    }

    @Test
    public void hasName(){
        assertEquals("Dan", director1.getName());
    }

    @Test
    public void hasNI(){
        assertEquals("NI69423", director1.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(50000, director1.getSalary());
    }

    @Test
    public void hasDeptName(){
        assertEquals("Ben's mum", director1.getDeptName());
    }

    @Test
    public void salaryCanRaise(){
        assertEquals("Valid Input", director1.raiseSalary(1000));
    }

    @Test
    public void hasBonusAmount(){
        assertEquals(1000, director1.bonus(), 0.0);
    }

    @Test
    public void hasBudget(){
        assertEquals(2000000, director1.getBudget(), 0.0);
    }

//    @Test
//    public void canOverrideAndGetMoreBonus(){
//        assertEquals(500, director1.bonus(), 0.0);
//    }

}
