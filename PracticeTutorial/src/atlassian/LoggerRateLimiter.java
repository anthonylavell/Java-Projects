/*
Design a logger system that receives a stream of messages along with their timestamps.
Each unique message should only be printed at most every 10 seconds
(i.e. a message printed at timestamp t will prevent other identical messages from being printed until timestamp t + 10).
 */
package atlassian;

import java.util.HashMap;
import java.util.Map;

public class LoggerRateLimiter {
    Map<String, Integer> map;

    public LoggerRateLimiter() {
        map = new HashMap<>();

    }

    public boolean shouldPrintMessage(int timestamp, String message) {

        if(!map.containsKey(message))
        {
            map.put(message, timestamp);
            return true;
        }

        int oldTime = map.get(message);

        if(timestamp - oldTime >= 10)
        {
            map.put(message, timestamp);
            return true;
        }
        else
        {
            return false;
        }

    }
}
