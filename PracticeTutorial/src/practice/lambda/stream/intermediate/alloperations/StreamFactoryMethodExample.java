package practice.lambda.stream.intermediate.alloperations;

public class StreamFactoryMethodExample {
    public static void main(String[] args) {
        //of
       /* Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8);
        stream.forEach(System.out::println);

        // iterate generate a stream of 10 even numbers
        Stream<Integer> stream2 = Stream.iterate(0,i-> i+2).limit(10);
        stream2.forEach(System.out::println);

        Stream<Integer> stream3 = Stream.generate(new Random()::nextInt).limit(5);
        stream3.forEach(System.out::println);*/
       int counter =-1;
       while (++counter < 3){
           System.out.println("counter: "+counter);
       }

    }
}
