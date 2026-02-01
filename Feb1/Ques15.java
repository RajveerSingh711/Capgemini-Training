package Feb1;

/*Circular Buffer Simulation
Implement a circular buffer (fixed-size queue) using an array-based queue. When full, overwrite the oldest element.
Example:
Buffer size=3: Insert 1, 2, 3 → Insert 4 → Buffer: [2, 3, 4].
*/

import java.util.*;

class CircularBuffer{
    private int[] buffer;
    private int capacity;
    private int head=0;
    private int tail=0;
    private int size=0;
    public CircularBuffer(int capacity){
        this.capacity=capacity;
        buffer=new int[capacity];
    }
    public void insert(int value){
        buffer[tail]=value;
        if(size==capacity) head=(head+1)%capacity;
        else size++;
        tail=(tail+1)%capacity;
    }
    public int[] getBuffer(){
        int[] result=new int[size];
        for(int i=0;i<size;i++) result[i]=buffer[(head+i)%capacity];
        return result;
    }
}
public class Ques15 {
    public static void main(String[] args){
        CircularBuffer cb=new CircularBuffer(3);
        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.insert(4);
        System.out.println(Arrays.toString(cb.getBuffer()));
    }
}
