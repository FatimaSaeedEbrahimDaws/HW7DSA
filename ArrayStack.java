public class ArrayStack <E>implements Stack<E>{
    static final int CAPCITY=10;

    int t=-1;
    E data[];
    public E topSecond(){

E top=pop();
E topSec=top();
push(top);
return topSec;
      }
    public E popSecond(){

        E top=pop();
        E topSec=pop();
        push(top);
        return topSec;
    }
    public  ArrayStack<E> clone(ArrayStack<E>stack){
        ArrayStack<E>l1=new ArrayStack<>();
        while (stack.t>=0){
            l1.push(stack.top());
           stack.t--;
        }
       stack.t=l1.size()-1;
        l1.reverse(l1);
        return l1;

    }
    public void print(ArrayStack<E>list){
        ArrayStack<E>l=new ArrayStack<>();

        while (!list.isEmpty()) {
            System.out.print(list.top()+"  ");
            l.push(list.pop());

        }
        while (!l.isEmpty()){

            list.push(l.pop());

        }
    }
    public  static<E> void reverse(ArrayStack<E>stack){
        ArrayStack<E>l1=new ArrayStack<>();
        ArrayStack<E>l=new ArrayStack<>();
        tansfer(stack,l);
        tansfer(l,l1);
        tansfer(l1,stack);

//        while (!stack1.isEmpty()) {
//            l.push(stack1.pop());
//        }
//        while (!l.isEmpty()) {
//            l1.push(l.pop());
//        }
//        while (!l1.isEmpty()) {
//            stack1.push(l1.pop());
//        }
    }
    public   E bottom() {

     ArrayStack l = new ArrayStack();

        while (!isEmpty()) {
            l.push(pop());
        }
        E bottom = (E) l.top();
        while (!l.isEmpty()) {
            push((E) l.pop());
        }
        return bottom;
    }
        public   E popBottom() {

           ArrayStack<E> l = new ArrayStack<>();
            while (!isEmpty()) {
                l.push(pop());
            }
            E bottom =  l.pop();
            while (!l.isEmpty()) {
                push( l.pop());
            }
            return bottom;
        }
            public  static <E>  void tansfer(ArrayStack<E>l,ArrayStack<E>l1){
        while (!l.isEmpty()) {
            l1.push(l.pop());
        }
    }
    public ArrayStack(int c){
     data= (E[]) new  Object[c] ;
    }
    public ArrayStack(){
        this(CAPCITY);//نرسل للنشي
    }

    @Override
    public boolean isEmpty() {
        return t==-1;
    }

    @Override
    public int size() {
        return t+1;
    }

    @Override
    public E top() {
        if (isEmpty())
        return null;
        return  data[t];
    }

    @Override
    public void push(E e) {
        if (size() == data.length)
            throw new IllegalStateException("Stack is full");
            data[++t]=e;


    }

    @Override
    public E pop() {
        if(isEmpty())
        return null;
        E del=data[t];
        data[t]=null;
        t--;
        return del;
    }
}
