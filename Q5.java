public class Q5 {
    public static void main(String[] args)
    {  PostfixEval list=new PostfixEval();
        String express="132*+11-";
        System.out.println("Postfix evaluation of the given expression comes out to be :" +list.evalPostfix(express));
    }
}
