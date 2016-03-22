
interface Comparator {
  public int compare(Object o1, Object o2);
  public boolean equals(Object o);
}

class IntegerComparator implements Comparator {
  public int compare(Object o1, Object o2){
    return (Integer)o1-(Integer)o2;
  }
  public boolean equals(Object o){}
}

class StringComparator implements Comparator {
  public int compare(Object o1, Object o2){
    return ((String)o1).compareTo(Stiring(o2));
  }
  public boolean equals(Object o){}
}