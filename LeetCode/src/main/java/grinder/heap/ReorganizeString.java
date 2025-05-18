/*
Given a string s, rearrange the characters of s so that any two adjacent
characters are not the same.

Return any possible rearrangement of s or return "" if not possible.
 */
package grinder.heap;

import grinder.json.ReorganizeStringJson;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class ReorganizeString {
    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject(ReorganizeStringJson.getReorganizeString());
        JSONObject data = jsonObject.getJSONObject("data");
        String str = data.getString("str");
        System.out.println(reorganizeString(str));

    }

    public static String reorganizeString(String str) {
        Map<Character,Integer> count = new HashMap<>();
        for (char ch : str.toCharArray()){
            count.put(ch, count.getOrDefault(ch, 0) +1);
        }
        PriorityQueue<Character> queue = new PriorityQueue<>(count.size(),(a,b) ->count.get(b)-count.get(a));
        queue.addAll(count.keySet());
        StringBuilder strBuilder = new StringBuilder(str.length());
        while (queue.size() > 1){
            char current = queue.poll();
            count.put(current,count.get(current)-1);
            strBuilder.append(current);
            char next = queue.poll();
            count.put(next,count.get(next)-1);
            strBuilder.append(next);
            if (count.get(current) > 0){
                queue.add(current);
            }
            if (count.get(next) > 0){
                queue.add(next);
            }
        }
        if (!queue.isEmpty() && count.get(queue.peek()) == 1){

            strBuilder.append(queue.poll());
        }

        return (queue.isEmpty()) ? strBuilder.toString() : "";
    }
}
