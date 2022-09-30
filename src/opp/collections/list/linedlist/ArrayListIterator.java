package opp.collections.list.linedlist;

import opp.collections.list.linedlist.uaslp.objetos.list.Iterator;

public class ArrayListIterator implements Iterator {
    private  ArrayList arrayList;
    private int currentIndex=0;

    //Constructor
    public ArrayListIterator(ArrayList arrayList){
        this.arrayList = arrayList;
    }

    //Methods
    public boolean hasNext(){
        return currentIndex<arrayList.getSize();
    }
    public String next(){
        return arrayList.getAt(++currentIndex);
    }

}
