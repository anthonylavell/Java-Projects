package comp_p.hubspot.main;

import java.util.*;

public class NestedInteger {
    private Integer value;
    private List<NestedInteger> list;

    // Constructor initializes an empty list.
    public NestedInteger() {
        this.list = new ArrayList<>();
    }

    // Constructor initializes a single integer.
    public NestedInteger(int value) {
        this.value = value;
    }

    // @return true if this NestedInteger holds a single integer, rather than a list.
    public boolean isInteger() {
        return value != null;
    }

    // @return the single integer that this NestedInteger holds, if it holds a single integer
    // Return null if this NestedInteger holds a list
    public Integer getInteger() {
        return value;
    }

    // Set this NestedInteger to hold a single integer.
    public void setInteger(int value) {
        this.value = value;
        this.list = null;
    }

    // Add a NestedInteger element to this list.
    // If this NestedInteger was holding a single integer, convert it into a list first.
    public void add(NestedInteger ni) {
        if (list == null) {
            list = new ArrayList<>();
            if (value != null) {
                list.add(new NestedInteger(value));
                value = null;
            }
        }
        list.add(ni);
    }

    // @return the nested list that this NestedInteger holds,
    // Return null if this NestedInteger holds a single integer
    public List<NestedInteger> getList() {
        return list;
    }

    @Override
    public String toString() {
        if (isInteger()) {
            return value.toString();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            for (int i = 0; i < list.size(); i++) {
                if (i > 0) sb.append(",");
                sb.append(list.get(i).toString());
            }
            sb.append("]");
            return sb.toString();
        }
    }
}
