public class isMatched {

         public static boolean isMatched(String expression) {
         final String opening = "({["; // opening delimiters
         final String closing = ")}]"; // respective closing delimiters
         Stack<Character> buffer = new slinkedStak<>( );
         for (char c : expression.toCharArray( )) {
             if (opening.indexOf(c) != -1) // this is a left delimiter
             buffer.push(c);
             else if (closing.indexOf(c) != -1) { // this is a right delimiter
                 if (buffer.isEmpty( )) // nothing to match with
                     return false;
                 if (closing.indexOf(c) != opening.indexOf(buffer.pop( )))
                     return false; // mismatched delimiter
                 }
            }
         return buffer.isEmpty( ); // were all opening delimiters matched?
         }

    public static void main(String[] args) {
        System.out.println(  isMatched("(())"));
    }

}
