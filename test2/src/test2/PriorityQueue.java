package test2;

public class PriorityQueue {

    
    private int maxSize;
    private long[] queueArray;
    private int count;
        
    // ť �迭 ����
    public PriorityQueue(int maxSize){
            
        this.maxSize = maxSize;
        this.queueArray = new long[maxSize];
        this.count=0;
            
    }
        
        // ť�� ����ִ��� Ȯ��
        public boolean empty(){
            return (count==0);
        }
        
        // ť�� �� á���� Ȯ��
        public boolean full(){
            return (count==maxSize);
        }
        
        // ť�� ������ ���
        // ť�� �����Ͱ� ū ������� �迭�� �տ������� ���ĵ��ֱ⿡
        // �迭�� �ڿ������� Ž���ϸ� item ���� ū ���� �ִ� index �ڿ� �����Ѵ�.
        public void insert(long item){
            
            if(full()) throw new ArrayIndexOutOfBoundsException();
            
            if(empty()){
                
                queueArray[count++] = item;
            
            }else{
                
                // �������� �ڿ������� ������ Ž���Ѵ�.
                int i=0;
                for(i=count-1; i>=0; i--){
                    
                    // ���� index�� �����Ͱ� �Է¹��� ������(item)���� ������ �迭�� �ڷ� �о��.
                    if(item > queueArray[i]){
                        
                        queueArray[i+1] = queueArray[i];
                        
                    }else{
                        // item�� ���� index�� ������ ������ Ž���� �����.
                        // item ���� ��ġ Ȯ��
                        break;
                    }
                }
                
                // item ���
                queueArray[i+1] = item;
                count++;
            }
        }
        
        // ť�� ������ ������ ��ȸ (�������� ������)
        public Object peek(){
            
            if(empty()) throw new ArrayIndexOutOfBoundsException();
            
            return queueArray[count-1];
        }
        
        // ť���� ������ ������ ���� (�������� ������)
        public Object remove(){
            
            Object item = peek();
            count--;
            return item;
        }

}