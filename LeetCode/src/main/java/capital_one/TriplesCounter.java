/*
Read below then write code in java.
Given an empty array that should contain integers numbers, your task is to process a
list of queries on it. Specifically, there are two types of queries:
"+x" append x to numbers, numbers may contain multiple instances of the same integer.

"-x remove all the instances of x from numbers

After processing each query, count the number of triples (x, y, z) in numbers which meet
this condition: both x y and y z are equal to a given diff Note that elements in numbers
can be rearranged to form triples to meet the condition. The final output should be an array
of counts after each query in queries
 */
package capital_one;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TriplesCounter {

    public static void main(String[] args) {
        // Example queries:
        //   "+3" adds the integer 3,
        //   "+5" adds the integer 5,
        //   "+7" adds the integer 7,
        //   "-5" removes all instances of 5.
        String[] queries = {"+3", "+5", "+7", "-5"};
        int diff = 2; // The required difference such that (x, y, z) forms (a, a+2, a+4) if valid.

        int[] result = processQueries(queries, diff);

        // Print the triple counts after processing each query.
        System.out.println("Triple counts after each query:");
        for (int count : result) {
            System.out.println(count);
        }
    }

    public static int[] processQueries(String[] queries, int diff) {
        List<Integer> results = new ArrayList<>();
        Map<Integer, Long> freq = new HashMap<>();

        for (String query : queries) {
            char op = query.charAt(0);
            int x = Integer.parseInt(query.substring(1));

            if (op == '+') {
                freq.put(x, freq.getOrDefault(x, 0L) + 1);
            } else if (op == '-') {
                freq.remove(x);
            }

            long tripleCount = 0;
            if (diff == 0) {
                for (long count : freq.values()) {
                    if (count >= 3) {
                        tripleCount += (count * (count - 1) * (count - 2)) / 6;
                    }
                }
            } else {
                for (int a : freq.keySet()) {
                    int b = a + diff;
                    int c = a + 2 * diff;
                    if (freq.containsKey(b) && freq.containsKey(c)) {
                        tripleCount += freq.get(a) * freq.get(b) * freq.get(c);
                    }
                }
            }
            results.add((int) tripleCount);
        }
        return results.stream().mapToInt(i -> i).toArray();
    }
}
