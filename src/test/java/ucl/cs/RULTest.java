package ucl.cs;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by cosmi_owugxv5 on 11/19/2017.
 */
public class RULTest {
    RUL example = new RUL();
    @Test
    public void listIsEmptyOnCreation() {
        assertThat(example.listSize(), is(0));
    }

    @Test
    public void itemAddedToList(){
        example. addToList("42");
        assertThat(example.retrieveItem(0), is("42"));
        example. addToList("43");
        assertThat(example.retrieveItem(0), is("43"));
        assertThat(example.retrieveItem(1), is("42"));
        assertThat(example.listSize(), is(2));
    }

    @Test
    public void itemRetrievedFromList(){
        example. addToList("42");
        assertThat(example.listSize(), is(1));
        assertThat(example.retrieveItem(0), is("42") );
    }
    @Test
    public void itemDuplicated()
    {
        example. addToList("42");
        example. addToList("43");
        example. addToList("42");
        assertThat(example.listSize(), is(2));
        assertThat(example.retrieveItem(1), is("43"));
    }
}
