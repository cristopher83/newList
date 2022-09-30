package opp.collections.list.linedlist;


import opp.collections.list.linedlist.uaslp.objetos.list.List;

public class LinkedList implements List {
    private Node head;
    private Node tail;
    private int size;

    //Methods

    //Method added by student
    public void addAtTail(String data)
    {
        Node node = new Node (data);
        if (size == 0)
        {
            head = node;
        }
        else
        {
            node.setPrevious(tail);
        }
        tail = node;
        size++;
    }
    //Method added and modify by student
    public void addAtFront(String data) {
        Node node = new Node(data);

        if (size == 0)
        {
            tail = node;
        }
        else
        {
            node.setNext(head);
            //node.getNext().setNext(head);
        }

        head = node;
        size++;
    }

    public void add(String element) {
        Node node = new Node(element);
        node.setPrevious(tail);/*El actual se lo setteo a la cola*/
        tail = node;


        if (head == null) /*Caso vacio*/ {
            head = node;
        } else {
            node.getPrevious().setNext(node); /*Basicamente obtengo el nodo anterior
        y se lo doy al nodo actual de su anterior. Y me conecta el anterior con el actual*/

        }


        size++;
    }

    public boolean remove(int index) {
        if (index < 0 || index > size) /*Caso en que el nodo a buscar este fuera del rango*/ {
            return false;
        }
        if (size == 1) /*Caso de que sea solo un nodo*/ {
            head = null;
            tail = null;
        } else if (index == 0) /*En caso que este al inicio lo que se hace
        es tomar el siguiente y que este en la cabecera y el anterior de ese queda vacio*/ {
            head = head.getNext();
            head.setPrevious(null);
        } else if (index == size - 1)/*En caso de que sea el ultimo se le asigna a la cola y el siguiente
        queda vacio o nulo*/ {
            tail = tail.getPrevious();
            tail.setNext(null);
        } else {

            Node nodeIterator = findNode(index);

            nodeIterator.getPrevious().setNext(nodeIterator.getNext());/*En esta parte
        obtengo el anterior y a este le pongo el siguiente del actual*/
            nodeIterator.getNext().setPrevious(nodeIterator.getPrevious()); /*A este obtengo
        el siguiente y a este le pongo el anterior del actual que estoy eliminando*/
        }

        size--;
        return true;
    }
        //Added by student
    public void removeAll()
    {
        head = null;
        tail = null;
        size = 0;
    }
    //Added by student
    public void removeAllWithValue(String value){

    }

        private Node findNode(int index) { /*Metodo encargado de buscar un nodo*/
            Node nodeIterator=head;
            int i=0;
            while (i< index) /*Busca el nodo*/
            {
                nodeIterator=nodeIterator.getNext();/*asignacion de nodo*/
                i++;
            }
            return nodeIterator;
        }

        public boolean setAt(int index, String element)
        {
            if (index<0 || index>= size){
                return false;
            }
            Node node = findNode(index);
            node.setData(element);
            return true;
        }
        public String getAt(int index)
        {
            Node node=findNode(index);
            return node.getData();
        }

        //Method added by student
        public LinkedListIterator getIterator(){
        return new LinkedListIterator(this);
        }

        public int getSize()
        {
            return size;
        }
}
