class Node
{
    int data;
    Node next;
}

class LinkedList
{
    Node head;
    Node end;

    void insertLast(int data )
    {
        Node newnode =  new Node();
        newnode.data = data;
        newnode.next = null;
        if (head == null)
        {
            head = newnode;
            end = newnode;
        }
        else
        {
            end.next = newnode;
            end = newnode;
        }
    }

    void insertFirst(int data )
    {
        Node newnode =  new Node();
        newnode.data = data;
        newnode.next = null;
        if (head == null)
        {
            head = newnode;
            end = newnode;
        }
        else
        {
            newnode.next = head;
            head = newnode;
        }
    }

    void deletefirst()
    {
        if (head == null)
        {
            System.out.println ("There is no node");
        }
        else if (head == end)
        {
            head = null;
            end =null;
        }
        else
        {
            head = head.next;
        }
    }

    void deletelast()
    {
        if (head == null)
        {
            System.out.println ("There is no node");
        }
        else if (head == end)
        {
            head = null;
            end =null;
        }
        else
        {
            Node current = head;
            while (current.next != end)
            {
                current = current.next;
            }
            current.next = null;
            end = current;
        }
    }

    void DeleteByValue (int value)
    {
        if (head == null)
        {
            System.out.println ("List is empty");
            return;
        }
        if (head.data == value)
        {
            deletefirst();
        }
        else{
            Node current = head;
            while (current.next != null && current.next.data != value)
            {
                current= current.next;
            }
            if ( current.next == null)
            {
                System.out.println("Value not found");
            }
            else
            {
                current.next = current.next.next;
                if (current.next == null)
                    end = current;
            }
        }
    }

    void insertbyposition ( int data , int position)
    {
        if (position == 1)
        {
            insertFirst(data);
        }
        else
        {
            Node newNode = new Node();
            newNode.data = data;
            newNode.next = null;
            int currentPosition= 1;
            Node current = head;
            while ( currentPosition< position-1 && current!= null)
            {
                current=current.next;
                currentPosition++;
            }
            if (current == null)
            {
                System.out.println(" Nill ");
                return;
            }
            else{
                newNode.next = current.next;
                current.next = newNode;
            }
        }
    }

    void display()
    {
        Node current= head;
        while (current != null)
        {
            System.out.print(current.data + " ");
            current= current.next;
        }
        System.out.println( );
    }
}

public class Main 
{
    public static void main (String args[] )
    {
        LinkedList list = new LinkedList();
        list.insertLast(5);
        list.insertLast(0);
        list.insertLast(4);
        list.insertLast(3);
        list.insertFirst(9);
        list.display();
        list.insertbyposition(10,4);
        list.display();
    }
}
