public class StackWithoutUserInput
{
    static final int STACK_SIZE = 10;

    static class Stack
	{
        int[] arr = new int[STACK_SIZE];
        int top;
    }

    static void checkOverflow(Stack s) 
	{
        if (s.top >= STACK_SIZE - 1) 
		{
            System.out.println("Stack overflow!");
        }
    }

    static void checkUnderflow(Stack s)
	{
        if (s.top < 0)
			{
            System.out.println("Stack underflow!");
        }
    }

    static void stackPush(Stack s, int data)
	{
        checkOverflow(s);
        s.arr[++s.top] = data;
        System.out.println("Pushed " + data + " into the stack.");
    }

    static void stackPop(Stack s) 
	{
        checkUnderflow(s);
        System.out.println("Popped " + s.arr[s.top] + " from the stack.");
        s.top--;
    }

    static void displayStack(Stack s) 
	{
        checkUnderflow(s);
        System.out.print("Stack elements from top to bottom: ");
        for (int i = s.top; i >= 0; i--) 
		{
            System.out.print(s.arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args)
	{
        Stack st = new Stack();
        st.top = -1;

        
        stackPush(st, 10);
        stackPush(st, 20);
        stackPush(st, 30);

        displayStack(st);

        stackPop(st);
        displayStack(st);
    }
}
