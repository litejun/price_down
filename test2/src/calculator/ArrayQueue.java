package calculator;

public class ArrayQueue {
    
    // ť �迭�� front�� rear �׸��� maxSize�� ������.
    private int front;
    private int rear;
    private int maxSize;
    private Object[] queueArray;
    
    // ť �迭 ����
    public ArrayQueue(int maxSize){
        
        this.front = 0;
        this.rear = -1;
        this.maxSize = maxSize;
        this.queueArray = new Object[maxSize];
    }
    
    // ť�� ����ִ��� Ȯ��
    public boolean empty(){
        return (front == rear+1);
    }
    
    // ť�� �� á���� Ȯ��
    public boolean full(){
        return (rear == maxSize-1);
    }
    
    // ť rear�� ������ ���
    public void insert(Object item){
        
        if(full()) throw new ArrayIndexOutOfBoundsException();
        
        queueArray[++rear] = item;
    }
    
    // ť���� front ������ ��ȸ
    public Object peek(){
        
        if(empty()) throw new ArrayIndexOutOfBoundsException();
        
        return queueArray[front];
    }
    
    // ť���� front ������ ����
    public Object remove(){
        
        Object item = peek();
        front++;
        return item;
    }

}