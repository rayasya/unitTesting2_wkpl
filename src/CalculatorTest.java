
//mengimport library yang akan digunakan untuk unit testing, yaitu assertEquals dan juga Test
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

    // membuat unit testing yang ditandai dengan keyword @Test
    // serta membuat function testAdd untuk dilakukan pengujian
    @Test
    public void testAdd() {
        // instansiasi clas Calculator
        Calculator calculator = new Calculator();

        /*
         * memanggil function add pada class calculator dan mengisi parameternya, serta
         * memasukkan hasilnya pada variable result dengan tipe data int
         */
        int result = calculator.add(5, 5);

        /*
         * memastikan apakah value pada variable result sama dengan
         * ekspektasi hasil pada fungsi assertEquals
         */
        assertEquals(10, result);
    }

    // membuat unit testing yang ditandai dengan keyword @Test
    // serta membuat function testSubstract untuk dilakukan pengujian
    @Test
    public void testSubstract() {
        // instansiasi clas Calculator
        Calculator calculator = new Calculator();

        /*
         * memanggil function substract pada class calculator dan mengisi parameternya,
         * serta memasukkan hasilnya pada variable result dengan tipe data int
         */
        int result = calculator.substract(10, 5);

        /*
         * memastikan apakah value pada variable result sama dengan
         * ekspektasi hasil pada fungsi assertEquals
         */
        assertEquals(5, result);
    }
}
