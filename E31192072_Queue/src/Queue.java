/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nur Fara
 */
public class Queue { //class Java
    //struct data
    //mendeklarasi size, front, dan rear
    int queue[] = new int[5];
    int size;
    int front;
    int rear;
    
    //main class method menambahkan data di Queue
    public void enQueue(int data){
        //melakukan pengecekan apakah queue penuh atau tidak
        
        //kondisi jika tidak penuh
        if(!isFull()){
            queue[rear] = data;
            rear = (rear + 1)%5;
            size = size + 1;
        }
        else //jika penuh, maka akan tampil Queue is Full
            System.out.println("Queue is Full");
    }
    //mengambil data dari Queue
    public int deQueue(){
        //melakukan pengecekan apakah data kosong atau tidak
        if(!isEmpty()){
            int data = queue[front];
            front = (front + 1)%5;
            size = size - 1;
        }
        else
            System.out.println("Queue is Empty");
        int data = 0;
        return data;
    }
    //menampilkan data
    public void show(){
        System.out.print("Elements :");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front+i)%5]+" ");
        }
        System.out.println();
        for (int n : queue){
            System.out.print(n + " ");
        }
    }
    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return getSize()==0;
    }
    public boolean isFull(){
        return getSize()==5;
    }
}
