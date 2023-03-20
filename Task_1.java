package Java_hw_4;
// Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод(не void), который вернет “перевернутый” список.
import java.util.LinkedList;
import  java.util.Random;

public class Task_1 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        Random rd = new Random();
        for (int i = 0; i < 10; i++) {
            ll.add(rd.nextInt(20)); 
        }
        System.out.println(ll);
        System.out.println(Reverse(ll));
    }
    static LinkedList<Integer> Reverse(LinkedList<Integer> ll1) {
        LinkedList<Integer> res = new LinkedList<>();
        for (int i = ll1.size()-1; i >= 0; i--) {
            res.add(ll1.get(i));
        }
        return res; 
    }
}
