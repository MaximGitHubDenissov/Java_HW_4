package Java_hw_4;
import java.util.Deque;
import java.util.LinkedList;
import  java.util.Random;
// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

public class Task_2 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        Random rd = new Random();
        for (int i = 0; i < 10; i++) {
            ll.add(rd.nextInt(20)); 
        }
        System.out.println(ll);
        Enqueue(ll, 5);
        Dequeue(ll);
        First(ll);
    } 
static void Enqueue(Deque<Integer> res, int a){
    res.addLast(a);
        System.out.println(res);
    
}
static void Dequeue(Deque<Integer> res){
    int a = res.poll();
    System.out.println(a);
    System.out.println(res);
}
static void First(Deque<Integer> res){
    int a = res.peek();
    System.out.println(a);System.out.println(res);
    
}
    
}
