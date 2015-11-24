package test2;

public class CircularQueue {
    
    // ť �迭�� front�� rear �׸��� maxSize�� ������.
        private int front;
        private int rear;
        private int maxSize;
        private Object[] queueArray;
        
        // ť �迭 ����
        public CircularQueue(int maxSize){
            
            this.front = 0;
            this.rear = -1;
            
            // ���� ũ�⺸�� �ϳ� ũ�� �����Ѵ� (����� ��ȭ�� ���� ����)
            this.maxSize = maxSize+1;    
            this.queueArray = new Object[this.maxSize];
        }
        
        // ť�� ����ִ��� Ȯ��
        public boolean empty(){
            return (front == rear+1) || (front+maxSize-1 == rear);
        }
        
        // ť�� �� á���� Ȯ��
        public boolean full(){
            return (rear == maxSize-1) || (front+maxSize-2 == rear);
        }
        
        // ť rear�� ������ ���
        public void insert(Object item){
            
            if(full()) throw new ArrayIndexOutOfBoundsException();
            
            // rear �� �迭�� �������̸� rear �����͸� ������ ������.
            if(rear == maxSize-1){
                rear = -1;
            }
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
            
            // front�� ���� index�� �迭ũ��+1 �̸� ó������ ���ư���
            if(front==maxSize){
                front = 0;
            }
            return item;
        }

}