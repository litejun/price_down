package test2;

public class ListQueue {
    
    private class Node{
        
        // ���� data�� ���� ��带 ������.
        private Object  data;
        private Node nextNode;
    
        Node(Object data){
            this.data = data;
            this.nextNode = null;
        }
    }
    
    // ť�� front���� rear��带 ������.
    private Node front;
    private Node rear;
    
    public ListQueue(){
        this.front = null;
        this.rear = null;
    }
    
    // ť�� ����ִ��� Ȯ��
    public boolean empty(){
        return (front==null);
    }
    
    // item�� ť�� rear�� �ִ´�.
    public void insert(Object item){
        
        Node node = new Node(item);
        node.nextNode = null;
        
        if(empty()){
            
            rear = node;
            front = node;
        
        }else{
            
            rear.nextNode = node;
            rear = node;
            
        }
    }
    
    // front �� �����͸� ��ȯ�Ѵ�.
    public Object peek(){
        if(empty()) throw new ArrayIndexOutOfBoundsException();
        return front.data;
    }
    
    // front �� ť���� �����Ѵ�.
    public Object remove(){
        
        Object item = peek();
        front = front.nextNode;
        
        if(front == null){
            rear = null;
        }
        
        return item;
    }
}