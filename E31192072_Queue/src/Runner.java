/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nur Fara
 */
public class Runner {
    public static void main(String[] args) {
        //menambahkan data di Queue
        Queue q = new Queue();
        q.enQueue(5);
        q.enQueue(2);
        q.enQueue(7);
        q.enQueue(3);
        
        //pengambilan data
        q.deQueue();
        q.deQueue();
        
        //menambahkan data
        q.enQueue(9);
        q.enQueue(1);
        
        q.enQueue(19);
        q.enQueue(15);
    
        System.out.println(q.isFull());
        
        System.out.println("Size "+ q.getSize());
        q.show(); //menampilkan data
    }
}
