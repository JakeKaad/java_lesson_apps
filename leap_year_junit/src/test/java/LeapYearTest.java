package LeapYear;

import org.junit.*;
import static org.junit.Assert.*;

public class LeapYearTest {

  @Test
  public void testLeapYearTrue() {
    LeapYear leapYear = new LeapYear();

    assertEquals( true, leapYear.leapYear(2000) );
    assertEquals( false, leapYear.leapYear(2001) );
  }
}
