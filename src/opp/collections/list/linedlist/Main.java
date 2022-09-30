package opp.collections.list.linedlist;

import opp.collections.list.linedlist.uaslp.objetos.list.List;

public class Main {
    public static void main(String []args) {

        List arrayList1 = new ArrayList();
        List linkedList2 = new LinkedList();

        //Calls with LinkedList
        arrayList1.addAtFront("Sexto");
        arrayList1.addAtFront("Quinto");
        arrayList1.addAtFront("Cuarto");
        arrayList1.addAtFront("Tercero");
        arrayList1.addAtFront("Segundo");
        arrayList1.addAtFront("Primero");
        arrayList1.addAtTail("ultimo");
        arrayList1.remove(2);
        arrayList1.removeAllWithValue("Tercero");
        arrayList1.setAt(4,"modificado");
        arrayList1.getIterator().next();
        arrayList1.removeAll();

        //Calls with ArrayList
        linkedList2.addAtFront("Quinto");
        linkedList2.addAtFront("Cuarto");
        linkedList2.addAtFront("Tercero");
        linkedList2.addAtFront("Segundo");
        linkedList2.addAtFront("Primero");
        linkedList2.addAtTail("ultimo");
        linkedList2.removeAllWithValue("Segundo");
        linkedList2.setAt(4,"modificado");
        linkedList2.getIterator().next();
        linkedList2.removeAll();

    }
}
