package Java_hw_4;
import java.util.LinkedList;
import java.util.Scanner;

public class Task_3{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = "";
        int counter = 0;
        LinkedList<String> ll = new LinkedList<String>();
        while (true){
            if (counter == 0 || counter == 2){
                System.out.println("Введите число:");
                input = in.next();
                if (input.contains("cancel") && ll.size()>=3){
                    for (int i = 0; i <=3; i++) {
                        ll.removeLast();
                    }
                    String result = ll.getLast();
                    System.out.printf("Результат равен %s \n", result);
                    counter = 1;
                }
                else{
                    ll.add(input);
                    counter+=1;    
                }
            }
            if (counter == 1){
                System.out.println("Введите операцию");
                input = in.next();
                if (input.contains("cancel") && ll.size()>=3){
                    for (int i = 0; i <=2; i++) {
                        ll.removeLast();
                    }
                    String result = ll.getLast();
                    System.out.printf("Результат равен %s \n", result);
                    counter = 1;
                }
                else{
                ll.add(input);
                counter+=1;
                }
            }
            if (counter == 3){
                String b = ll.get(ll.size()-1);
                String oper = ll.get(ll.size()-2);
                String a = ll.get(ll.size()-3);
                String answer = Result(Integer.parseInt(b),oper,Integer.parseInt(a));
                ll.add(answer);
                System.out.printf("Результат: %s \n", answer);
                counter = 1;
                System.out.println(ll);
                
            }
            
        }
        
    }

    static String Result(int b, String oper, int a) {
        String res = "";
        if (oper.equals("+")) {
            res = Integer.toString(a + b);
        }
        if (oper.equals("-")) {
            res = Integer.toString(a - b);
        }
        if (oper.equals("*")) {
            res = Integer.toString(a * b);
        }
        if (oper.equals("/")) {
            res = Integer.toString(a / b);
        }
        return res;
    }
    
}
