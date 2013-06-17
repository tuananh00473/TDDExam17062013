import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 6/17/13
 * Time: 1:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyStack {

    private LinkedList<Object> myStack = new LinkedList<Object>();

    public boolean isEmpty() {
        return myStack.isEmpty();
    }

    public int getSize() {
        return myStack.size();
    }

    public void push(String abc) {
        myStack.addFirst(abc);
    }

    public String top() {
        String str = null;
        if(!myStack.isEmpty()){
            str = myStack.getFirst().toString();
        }
        return str;
    }


    public void pop() {
        if(myStack.size() > 0){
            myStack.removeFirst();
        }else{
            throw new RuntimeException("Can't pop empty Stack.");
        }
    }
}
