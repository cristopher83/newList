package opp.collections.list.linedlist;

import opp.collections.list.linedlist.uaslp.objetos.list.Iterator;

public class LinkedListIterator implements Iterator {
   private LinkedList linkedList;
   private int currentIndex;

   //Constructor
    public LinkedListIterator(LinkedList linkedList){
        this.linkedList=linkedList;
    }

    //Methods with implements

    public boolean hasNext() {
        return currentIndex< linkedList.getSize();
    }


    public String next() {
        return null;
    }



}
