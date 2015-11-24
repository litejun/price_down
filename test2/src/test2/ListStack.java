package test2;

public class ListStack {
    
    private Node top;
    
    // ��� class �ܼ����Ḯ��Ʈ�� ����.
    private class Node{
        
        private Object data;
        private Node nextNode;
        
        Node(Object data){
            this.data = data;
            this.nextNode = null;
        }
    }
    
    // ������, stack�� ��������Ƿ� top�� null�̴�.
    public ListStack(){
        this.top = null;
    }
    
    // ������ ����ִ��� Ȯ��
    public boolean empty(){
        return (top == null);
    }
    
    // item �� ������ top�� �ִ´�.
    public void push(Object item){
        
        Node newNode = new Node(item);
        newNode.nextNode = top;
        top = newNode;
        
    }
    
    // top ����� �����͸� ��ȯ�Ѵ�.
    public Object peek(){
        if(empty()) throw new ArrayIndexOutOfBoundsException();
        return top.data;
    }
    
    // top ��带 ���ÿ��� �����Ѵ�.
    public Object pop(){
        
        Object item = peek();
        top = top.nextNode;
        return item;
    }

}