package opp.collections.list.linedlist;

public class Node {
    private Node next;
    private Node previous;
    private String data;

    //constructor
    public  Node(String data){
        this.data=data;
    }
    //getters y setters
    public Node getNext()
    {
        return next;
    }
    public void setNext(Node next)
    {
        this.next=next;
    }
    public Node getPrevious()
    {
        return previous;
    }
    public void setPrevious(Node previous)
    {
        this.previous= previous;
    }
    public String getData()
    {
        return data;
    }
    public void setData(String data)
    {
        this.data=data;
    }

}
