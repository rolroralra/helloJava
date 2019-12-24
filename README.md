# helloJava


- Java Double Brace Syntax
```java
Map<String, Integer> map = new HashMap<String, Integer>() {
            {
                put("a", 1);
                put("b", 2);
                put("c", 3);
            }
        };

map.forEach((s, integer) -> System.out.printf("key = %s, value = %d\n", s, integer));
```
