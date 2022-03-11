class Stack{
    int maxLimit = 100;
    int[] arr;
    int top;

    Stack(){
        arr = new int[maxLimit];
        top = -1;
    }
    void push (int val){  
        if (top == maxLimit-1)   
            System.out.println("Overflow");   
        else{   
            arr[++top] = val;
        }   
    }   

    void pop(){
        if(top == -1){
            System.out.println("Underflow");
        }else{
            top--;
        }
    }

    void peek(){
        if(top == -1){System.out.println("Empty");}
        else{
            System.out.println(arr[top]);
        }
    }

    void display(){
        int temp = top;
        while(temp != -1){
            System.out.print(arr[temp--]+" ");
        }
    }
}

public class StackDriver {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(4);
        stack.push(5);
        stack.pop();
        stack.display();
    }
}
