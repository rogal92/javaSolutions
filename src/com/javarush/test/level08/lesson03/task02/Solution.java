package com.javarush.test.level08.lesson03.task02;

/* HashMap of 10 pairs
Create a collection HashMap<String, String>, place 10 pairs of strings into the collection:
    watermelon - berry, banana - grass, cherry - berry, pear - fruit, melon - vegetable, blackberry - berry, ginseng - root, strawberry - berry, iris - flower, potato - tuber.
    Display to the screen the contents of the collection. Each entry should be on a new line.

    Output example (only one string is shown):
    potato - tuber
*/

import java.util.HashMap;
import java.util.Map;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Map<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("watermelon"," berry");
        hashMap.put("banana"," grass");
        hashMap.put("cherry"," berry");
        hashMap.put("pear"," fruit");
        hashMap.put("melon"," vegetable");
        hashMap.put("blackberry"," berry");
        hashMap.put("ginseng"," root");
        hashMap.put("strawberry"," berry");
        hashMap.put("iris"," flower");
        hashMap.put("potato"," tuber");

        for(Map.Entry<String, String> map : hashMap.entrySet()) {
            String key = map.getKey();
            String value = map.getValue();
            System.out.println(key + " -" + value);
        }
    }
}
