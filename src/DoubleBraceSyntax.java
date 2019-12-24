import java.util.HashMap;
import java.util.Map;

public class DoubleBraceSyntax {

    public static void main(String[] args) {
        
        // Java Double Brace Syntax Example
        // First brace means Extension of HashMap Class, 
        // and second brace means Initialization of the extended class.
        Map<String, Integer> map = new HashMap<String, Integer>() {
            {
                put("a", 1);
                put("b", 2);
                put("c", 3);
            }
        };

        map.forEach((s, integer) -> System.out.printf("key = %s, value = %d\n", s, integer));

    }
}
