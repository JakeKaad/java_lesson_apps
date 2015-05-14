import org.junit.Test;
import static org.junit.Assert.*;

public class TitleCaseTest {

  @Test
  public void toTitleCaseTest() {
    TitleCase titleCase = new TitleCase();

    assertEquals( "Beowulf", titleCase.toTitleCase("beowulf") );
  }
}
