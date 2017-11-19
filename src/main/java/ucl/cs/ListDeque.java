package ucl.cs;

import java.util.ArrayList;

/**
 * Created by cosmi_owugxv5 on 11/19/2017.
 */
public class ListDeque {
    private ArrayList<String> aList;

    public ListDeque() {
        this.aList = new ArrayList<>();
    }

    public int listSize() {
        return this.aList.size();
    }

    public ArrayList<String> getaList() {
        return aList;
    }

    public void setaList(ArrayList<String> aList) {
        this.aList = aList;
    }

    public void addToList(String n) {
        this.aList.add(this.listSize(), n);
    }

    public String retrieveItem(int n)
    {
        return aList.get(n);
    }
}
