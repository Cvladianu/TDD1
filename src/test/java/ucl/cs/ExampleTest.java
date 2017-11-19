package ucl.cs;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

public class ExampleTest {
  ListPushFirst example = new ListPushFirst();
  @Test
  public void listIsEmptyOnCreation() {
    assertThat(example.listSize(), is(0));
  }

  @Test
  public void itemAddedToList(){
    example. addToList("42");
    example. addToList("43");
    assertThat(example.listSize(), is(2));
  }

  @Test
  public void itemRetrievedFromList(){
    example. addToList("42");
    assertThat(example.listSize(), is(1));
    assertThat(example.retrieveItem(0), is("42") );
  }
}
