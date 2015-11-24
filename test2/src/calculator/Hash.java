package calculator;

public class Hash {
    
    // �����͸� ������ Entry�� ���� ���� Entry�� ������.
    private class Entry{
        private int value;
        public Entry next;
    }
    
    private int size;
    private Entry[] hTable;
    
    // Hash Table�� size�� �迭 ���̺��� �����Ѵ�.
    public Hash(int size){
        
        this.size = size;
        this.hTable = new Entry[size];
    }
    
    // key ������ HashTable�� ����� index�� ��ȯ�Ѵ�.
    public int hashMethod(int key){
        return key % size;
    }
    
    // ������ �����ͷ� key�� �����Ѵ�.
    // ���� Hash ���� Ư���� �˰����� ����� hashCode�� ��´�.
    public int getKey(int data){
        return data;
    }
    
    // data�� HashTable�� �����Ѵ�.
    public int add(int data){
        
        // data�� hashCode�� key�� ������ index�� ��´�.
        int key = getKey(data);
        int hashValue = hashMethod(key);
        
        // ������ Entry ����
        Entry entry = new Entry();
        entry.value = data;
        
        
        // HashTable�� ������ index�� ����ִٸ�, �����ϰ� ������.
        if(hTable[hashValue] == null){
            
            hTable[hashValue] = entry;
            return 0;
        }
        
        
        Entry pre = null;
        Entry cur = hTable[hashValue];
        
        // �ش� index�� ���Ḯ��Ʈ�� ���� ũ�Ⱑ ���� ������ ū ������ ���ĵǾ��ִ�.
        while(true){
            
            if(cur == null){     // Hash Table�� ������ index�� ��������� 
                
                hTable[hashValue] =entry;  // �ش� index�� ����
                return 0;
            
            }else if(cur.value < key){    // �ش� index�� Ŀ�� ����� ���� key���� ������
                
                // Ŀ���� �ϳ� �ڷ� �ű��.
                pre = cur;            
                cur = cur.next;
            
            }else{     // �ش� index�� Ŀ�� ����� ���� key ���� ũ��.(���⿡ ����)
                
                // Ŀ�� ��尡 HashTable�� ù��° ����̸�
                if(cur == hTable[hashValue]){
                    
                    // ���� ��带 ù��° ���� �����ϰ� ���� ��带 Ŀ������ �����Ѵ�.
                    entry.next = cur;
                    hTable[hashValue]= entry;
                    return 0;
                    
                }else{    // ù��° ��尡 �ƴϸ�
        
                    // ���� ����� ���� ���� Ŀ����带 �����ϰ�
                    // �� ����� ���� ��带 ���Գ��� �����Ѵ�.
                    entry.next = cur;
                    pre.next = entry;
                    return 0;
                }
            }
        }
    }
    
    
    // data�� �ִ� ��ġ�� ��´�.
    public int get(int data){
        
        int key = getKey(data);
        int hashValue = hashMethod(key);
        
        // data�� �ִ� index�� ù��° ��带 ��´�.
        Entry cur = hTable[hashValue];
        
        while(true){
            
            if(cur == null){    // index �� ����ִٸ� -1 ��ȯ
            
                return -1;
            
            }else if(cur.value == key){    // Ŀ���� ���� Ű�� ������ 0 ��ȯ
                
                return hashValue;
            
            }else if(cur.value > key){    // Ŀ���� ���� Ű���� ũ�� -1 ��ȯ
                                                    // ����Ʈ�� ���� ������ ū ������ ���ĵǾ��ִ�.
                return -1;
            
            }else{        // Ŀ���� ���� Ű���� ������ ���� ���� Ŀ�� �̵�
                
                cur = cur.next;
            }
        
        }
    }
    
    // data�� �ִ� ��带 ��ȯ�Ѵ�.
    private Entry getEntry(int data){
        
        int key = getKey(data);
        int hashValue = hashMethod(key);
        
        // HashTable�� index��  ù��° ���� �ι�° ���
        Entry pre = hTable[hashValue];
        Entry cur = pre.next;
        
        while(true){
            
            if(cur == null){    // Ŀ�� ��尡 null �̸� null ��ȯ
                
                return null;
            
            }else if(cur.value == key){    // Ŀ�� ����� ���� Ű�� ������ �� ��带 ��ȯ
                
                return pre;
                
            }else if(cur.value > key){    // Ŀ���� ���� Ű���� ũ�� null ��ȯ
                
                return null;
            
            }else{            // Ŀ���� ���� Ű���� ������ Ŀ���� �������� �̵�
                
                pre = cur;
                cur = cur.next;
            }
        }
    }
    
    // data �� ����
    public int remove(int data){
        
        Entry pre = null;
        
        // data�� �ִ� ����� ����带 �������� null�̸� -1 ��ȯ
        if((pre=getEntry(data))== null){
            return -1;
        }
        
        // �� ��尡 data�� ������带 ����Ű�� �Ѵ�.
        // data ��带 �ǳʶٰ� �����Ѵ� (����)
        Entry cur = pre.next;
        pre.next = cur.next;
        return 0;
    }
    
    public String toString(){
        
        StringBuffer result = new StringBuffer();
        Entry cur = null;
        
        for(int i=0; i<size; i++){
            
            result.append("[" + i + "]\t");
            cur = hTable[i];
            
            if(cur == null){
                result.append("n ");
                
            }else{
                
                while(cur!=null){
                    result.append(cur.value + "");
                    cur = cur.next;
                }
            }
            result.append("\n");
        }
        
        return result.toString();
    }
}