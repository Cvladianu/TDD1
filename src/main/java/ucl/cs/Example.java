package ucl.cs;

import java.util.ArrayList;

public class Example {
  private ArrayList<Integer> aList;

  public Example() {
    this.aList = new ArrayList<>();
  }

  public int listSize() {
    return this.aList.size();
  }

  public ArrayList<Integer> getaList() {
    return aList;
  }

  public void setaList(ArrayList<Integer> aList) {
    this.aList = aList;
  }

  public void addToList(int n) {
    this.aList.add(this.listSize(), n);
  }

  public int retrieveItem(int n)
  {
    return aList.get(n);
  }

}