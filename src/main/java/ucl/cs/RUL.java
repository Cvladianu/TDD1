package ucl.cs;

import java.util.ArrayList;

/**
 * Created by cosmi_owugxv5 on 11/19/2017.
 */
public class RUL {
    private ArrayList<String> aList;

    public RUL() {
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
        removeFromList(aList.indexOf(n));

        this.aList.add(0, n);
    }

    private void removeFromList(int index)
    {
        if(index==-1)
            return;
        aList.remove(index);
    }

    public String retrieveItem(int n)
    {
        return aList.get(n);
    }
}
