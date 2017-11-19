package ucl.cs;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by cosmi_owugxv5 on 11/19/2017.
 */
public class ListDequeTest {
    ListDeque example = new ListDeque();
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
