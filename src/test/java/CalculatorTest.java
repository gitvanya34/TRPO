import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    public void sum() throws Exception
    {
        Calculator calculator=new Calculator();
        assertEquals(3 ,calculator.sum(1.0,2.0));
    }
    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Test
    public void abs() throws Exception
    {
        assertEquals(5 ,Math.abs(-5));
    }

}