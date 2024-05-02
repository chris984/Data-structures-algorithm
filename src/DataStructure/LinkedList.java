package DataStructure;

public class LinkedList {
    
    
    Node head;
    
    static class Node{
    
        int data;
        Node next;
        
        Node(int data)
        {
            this.data = data;
            next = null;
        
        }
    
    }
    public void addAtFront(int val)
    {
        Node new_node = new Node(val);
        new_node.next = head;
        head = new_node;
    }
    
    public void addAtEnd(int val)
    {
    
        Node new_node = new Node(val);
        
        if(head == null)
        {
        
            head = new Node(val);
            return;
        
        }
        
        new_node.next = null;
        Node last = head;
        while(last.next != null)
            last = last.next;
        
        last.next = new_node;
    }
    
    public void deleteNode(int key)
    {
        Node temp = head, prev = null;
    
        if(temp != null && temp.data == key)
        {
            head = temp.next;
            return;
        
        
        }
        
        while(temp != null && temp.data != key)
        {
        
                prev = temp;
                temp = temp.next;
        
        }
        
            if(temp == null)
                return;
            
            prev.next = temp.next;
        
    
    }
    
    public void print()
    {
        Node first = head;
        
        while(first != null)
        {
            System.out.print(first.data + ", ");
            
            first = first.next;
        }
    
    
    }
    
    
    public static void main(String[] args){
        
               
        LinkedList list = new LinkedList();
        
        list.addAtFront(3);
        list.addAtFront(2);
        list.addAtFront(1);
        list.addAtEnd(4);
        list.addAtEnd(5);
        
        
        list.deleteNode(3);
        
        list.print();
 
        
    
    }
}
