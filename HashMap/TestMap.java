import java.util.*;

import sun.font.CoreMetrics;

public class TestMap
{
    public static void main(String[] args) 
    {
        HashMap<String, Integer> scores = new HashMap<String, Integer>();
        
        scores.put("Kathy", 42);
        scores.put("Bert", 324);
        scores.put("Skyler", 420);

        System.out.println(scores);
        System.out.println(scores.get("Bert"));
    }
}