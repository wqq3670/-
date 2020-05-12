import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-05-12
 * Time: 15:26
 **/
public class MinStack {
    Stack<Integer> s1;
    Stack<Integer> min;

    public MinStack() {
        s1 = new Stack<>();
        min = new Stack<>();
    }

    public void push(int x) {
        s1.push(x);
        if(min.isEmpty() || x <= min.peek()) {
            min.push(x);
        }
    }

    public void pop() {
        if(s1.pop().equals(min.peek())) {
            min.pop();
        }
    }

    public int top() {
        return s1.peek();
    }

    public int getMin() {
        return min.peek();
    }

}
