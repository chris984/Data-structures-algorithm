package DataStructure;

public class Stack {
    
    static class Node{
        int value;
        Node next;
    
    public Node(int value){
        this.value = value;
    
    }
 }
    
  private Node first = null;
    
    public void push(Node node){
    
        node.next = first;
        first = node;
    
    }
    
    public void pop(){
        
        first = first.next;
    }
    
    public void print(){
      Node node = first;
      while(node != null){
          System.out.println("|" + node.value+"|");
          node = node.next;
      
      }
    }
    
    public static void main(String[] args){
    
        Stack stack = new Stack();
        stack.push(new Node(1));
        stack.push(new Node(2));
        stack.push(new Node(4));
        stack.push(new Node(8));
        stack.print();
        
    
    }
}
