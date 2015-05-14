package LeapYear;

import org.junit.*;
import static org.junit.Assert.*;

public class LeapYearTest {

  @Test
  public void checkIfLeapYearTest() {
    LeapYear leapYear = new LeapYear();

    assertEquals( true, leapYear.checkIfLeapYear(2000) );
    assertEquals( false, leapYear.checkIfLeapYear(2001) );
  }
}
