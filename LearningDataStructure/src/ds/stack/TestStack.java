package ds.stack;

public class TestStack {
    public static void main(String[] args) {
        /*Stack theStack = new Stack(5);
        theStack.push(20);
        theStack.push(30);
        theStack.push(40);
        theStack.push(50);
        theStack.push(60);
        theStack.push(70);

        while (!theStack.isEmpty()){
            long value = theStack.pop();
            System.out.println(value);
        }*/
        System.out.println(reverseStr("hello"));
    }

    public static String reverseStr(String str){
        Stack theStack = new Stack(str.length());
        String value="";
        for(int num = 0; num < str.length(); num++ ){
            theStack.push(num);
        }
        while (!theStack.isEmpty()) {
             value = value+str.charAt((int)theStack.pop());
        }
        return value.trim();

    }


}
