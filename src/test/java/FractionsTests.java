import com.tddkatas.fractions.Fraction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionsTests {


    @Test
    void testAddition() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 3);
        Fraction result = f1.add(f2);
        assertEquals(5, result.getNumerator());
        assertEquals(6, result.getDenominator());
    }

    @Test
    void testAddingTwoFractionsWithSameDenominator() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 2);
        Fraction result = f1.add(f2);
        assertEquals(1, result.getNumerator());
        assertEquals(1, result.getDenominator());
    }
}
