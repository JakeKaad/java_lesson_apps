import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestLeapYear {

  Integer yearOne = 2000;
  Integer yearTwo = 2001;
  LeapYear leapYear = new LeapYear();

  public void testLeapYear() {
    assertEquals( true, leapYear.leapYear(2000) );
  }
}
