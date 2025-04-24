package week2.day9;

public class MyCircularQueue {
    int data [] ; 
    int front  =   0 ; 
    int rear  = -1 ; 
    int size  = 0 ;
public MyCircularQueue(int k) {
    data  =  new int[k] ; 
}

public boolean enQueue(int value) {
    if(data.length == size) return false  ; 
    rear =  (rear + 1) % data.length ;
    data[rear] = value ;
    size++ ;
    return true ;
}

public boolean deQueue() {
    // if queue is empty return false 
    if(size == 0) return false ;
    // we don't actually delete the data we move the pointer and that place is available for overwrite 
    front = (front+ 1)% data.length ;
    size--;
    return true ;
}

public int Front() {
    return (size > 0) ? data[front] :-1;
}

public int Rear() {
    return size == 0 ? -1 :data[rear];
}

public boolean isEmpty() {
    return size == 0 ;
}

public boolean isFull() {
    return size == data.length ;
}
}
