package test2;

public class MyArray {
    
    private Object[] data;
    private int count;
    
    public MyArray(int maxSize){
        
        if(maxSize<0){
            throw new IllegalArgumentException("Illegal Capacity:"+maxSize);
        }
        
        // ��ü ������ ���� maxSize ũ�� �� �迭�� �����.
        this.data = new Object[maxSize];
        this.count = 0;
    }
    
    // �迭�� �������� obj �� �����Ѵ�.
    public void add(Object obj){
        if(count>=data.length){
            throw new ArrayIndexOutOfBoundsException(count + ">= " + data.length);
        }
        data[count++] = obj;
    }
    
    // index�� ��ġ�� obj�� �����Ѵ�. index ���� �����ʹ� ��ĭ�� �з�����.
    public void add(int index, Object obj){
        if(count>=data.length){
            throw new ArrayIndexOutOfBoundsException(count + ">= " + data.length);
        }
        
        for(int i=index; i<count; i++){
            data[i+1] = data[i];
        }
        count++;
        
        data[index]= obj;
    }
    
    // index ��ġ�� �����͸� �����Ѵ�. index ���� �����ʹ� ��ĭ�� �������.
    public void remove(int index){
        if(index >= count){
            
            throw new ArrayIndexOutOfBoundsException(index + ">=" + count);
        
        }else if(index <0){
            
            throw new ArrayIndexOutOfBoundsException(index);
            
        }
        
        for(int i = index; i<count-1; i++){
            data[i] = data[i+1];
        }
        count--;
        data[count] = null;
    }
    
    // obj�� ã�Ƽ� �����Ѵ�.
    public void remove(Object obj){
        
        int index = find(obj);
        
        remove(index);
    }
    
    // index �� �����͸� �����´�.
    public Object get(int index){
        if(index >= count){
            throw new ArrayIndexOutOfBoundsException(index + ">=" + count);
        }
        
        return data[index];
    }
    
    // �迭���� obj �� ã�Ƽ� ��ġ index�� ��ȯ�Ѵ�.
    public int find(Object obj){
        
        int index;
        for(index=0; index<count; index++){
            if(data[index].equals(obj)){
                break;
            }else if(index==count-1){
                index = -1;
                break;
            }
        }
        
        return index;
    }
    
    // �迭�� �����͸� ����Ѵ�.
    public String toString(){
        StringBuffer str = new StringBuffer("[");
        if(count>0){
            str.append(data[0]);
        }
        for(int i=1; i<count; i++){
            str.append(", ").append(data[i]);
        }
        str.append("]");
        return str.toString();
    }

}