package ucl.cs;

import java.util.ArrayList;

public class Example {
  private ArrayList<String> aList;

  public Example() {
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