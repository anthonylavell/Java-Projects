package practice.java8filter;

class Parent{
    protected static int count = 0;
    public Parent (){
        count++;
    }

    static int getCount(){
        return count;
    }

}

public class JavaFilter {
    static int total = 10;
      public JavaFilter(){
        //data++;
            count++;
    }
   /*public void meth(String [] arg){
       System.out.println(arg);
       System.out.println(arg[1]);
   }*/
   public void call(){
      int total =5;
       System.out.println(this.total);
   }
 private String s = "Hello";
   public void doSomething(){
       Object[] objArr = new Object[2];
       for(int i=0; i < objArr.length; i++){
           objArr[i] = new Object();
       }

   }

   private static int count ;


    public static void main(String arg []) {



       /* System.out.println(String.format("Local time: %tT:%tM:%tS",
                LocalTime.now(), LocalTime.now(),LocalTime.now() ));
        System.out.println(String.format("Local time: %tT", LocalTime.now()));
        System.out.println(String.format("Local time: %tT", Calendar.getInstance()));*/

        //List<?> myList = new ArrayList<>();

        /*JavaFilter a1 = new JavaFilter();
       a1.call();*/
       /* System.out.println("Count =" + getCount());
        JavaFilter obj = new JavaFilter();
        System.out.println("Count = "+getCount());*/


      /*Double d = null;
        System.out.println((d instanceof Double) ? "true":"falseb");
        String e = "1";
        System.out.println(("1" != e) ? "true": "falseA");*/

        /*JavaFilter t = new JavaFilter();
        t.doSomething();
        Thread.sleep(2000);*/
       /* String str1 = "My String";
        String str2 = new String("My String");

        System.out.println(str1.hashCode() == str2.hashCode());
        System.out.println(str1.matches(str2));
        //System.out.println(str1.hashCode() == str2.hashCode());
        System.out.println(str1.equals(str2));
        System.out.println(str1 == str2);/*

        /* Float f = new Float(23.43);
    Character c = new Character("C");
    Double d = new Double("17.46d");
    Integer i = Integer.parseUnsignedInt(4);
    Boolean b = new Boolean("false");*/

        /*Calendar cal = Calendar.getInstance();
        cal.set(2000, Calendar.AUGUST, 30);
        cal.roll(Calendar.MONTH,7);
        System.out.println(""+cal.get(Calendar.DATE)+"-"
        +cal.get(Calendar.MONTH)+"-"+cal.get(Calendar.YEAR));
        LocalDate date = LocalDate.of(2000, Month.AUGUST, 30);
        date.plusMonths(6);
        System.out.println(""+date.getDayOfMonth()+"-"
        +date.getMonthValue() + "-"+date.getYear());*/

       // meth(arg);

       /* Integer number1 = new Integer(1);
        Integer number2 = number1;
        number1+=1;
        System.out.println(number1);
        System.out.println(number2);*/

        /*System.out.println("Count= "+ getCount());
        JavaFilter obj = new JavaFilter();
        System.out.println("Count= "+getCount());*/

      /* String first = "first";
        String second = new String("first");
        "first".concat("second");
        System.out.println(first.equals(second));
        System.out.println(first == second);
        System.out.println(first.equals("firstsecond"));
        System.out.println(second == first);*/
        //Number 8
       /* Supplier<String> i = () ->"Car";
        Consumer<String> c = x-> System.out.println(x.toLowerCase());
        Consumer<String> d = x-> System.out.println(x.toUpperCase());
        c.andThen(d).accept(i.get());
        System.out.println();*/
        /* Float x = new Float(122);
    Double d = new Double("122");
    Boolean b = new Boolean(false);*/
        //List<String> list = Arrays.asList("dog","over","good");
        //System.out.println(list.stream().reduce(new Character(), (s1,s2) ->  s1 + s2.charAt(0),(c1,c2) -> c1+=c2));
        //list.stream().reduce((x1,x2) -> x1.length() > x2.length() ? x1: x2).ifPresent(System.out::println);

     /* int x = 5;
      x = x >> 1;
      x +=3;*/

       /* Optional<String> b = Optional.empty();
        b = Optional.ofNullable("");
        System.out.println(b.get().length());*/

       /*26 System.out.println(I2.name+", ");
        System.out.println(I2.s1+", ");
        System.out.println( ((I1) new JavaFilter()).name);*/
       //23
       /* IntStream.range(1,2).mapToObj(i ->i + "red").forEach(System.out::println);
        Stream.of("1red","2red","3red").anyMatch(s -> {
            System.out.println(s);
            return s.startsWith("1");
        });
        Stream.of("1RED","2red","3red").findFirst().map(String::toLowerCase).ifPresent(System.out::println);*/


        //22
       /* Locale locale = new Locale("USA");
        System.out.println("County"+" "+locale.getCountry());*/

        //21
        /*SortedSet<Element> s = new TreeSet<>();
        s.add(new Element(15));
        s.add(new Element(10));
        s.add(new Element(25));
        s.add(new Element(10));
        System.out.println(s.first()+" "+s.size());*/

        //Number 14
       /* YearMonth ym1 = YearMonth.of(2015, Month.SEPTEMBER);
        YearMonth ym2 = YearMonth.of(2016, Month.FEBRUARY);
        System.out.println(ym1.minus(Period.ofMonths(4)).getMonthValue());
        System.out.println(ym1.until(ym2, ChronoUnit.MONTHS));*/
        //number 10
       /* System.out.println("Current JVM Heap Size: "+ Runtime.getRuntime().totalMemory());
        System.out.println("Maximum JVM Heap Size: ");
        System.out.println("Free JVM Heap Size: ");/*

       /* String [] str = {"ant","alvin","charles","lora","james"};
        String [] words = {"aba","bob","mom","cat","dog","level"};
        Stream.of(str).filter(s -> s.startsWith("a")).sorted().forEach(System.out::println);
       List <String> listOfStr = new ArrayList<>(Arrays.asList(words));
        System.out.println("Palindrome Words!!");
        listOfStr.stream().filter( JavaFilter :: palindrome).sorted().forEach(System.out :: println);*/
       //number 5
        /*Stream.of(new Indices("Mercury"), new Indices("Venus"),new Indices("Earth"))
                .flatMap(i -> i.indices.stream())
                .mapToInt(j -> j)
                 .max()
                  .ifPresent(s -> System.out.println(s));*/



    }



    public static boolean  palindrome(String str){
        return new StringBuilder(str).reverse().toString().equals(str);
    }
}


//30
/*class IKT{
    private int data;
  // protected static int data =0;
    public IKT(){
        //data++;
        this(10);
    }

    private void onSelection(){

    }

    public IKT(int data){
        this.data = data;
    }

    public void display(){
        class Decrementer{
            public void decrementer (){
                data--;
            }
        }
        Decrementer d = new Decrementer();
        d.decrementer();
        System.out.println("data = "+ data);
    }

    static int getCount(){
        return data;
    }
}*/

//26
/*interface I1{
    String name = "N1";
    String s1 = "S1";
}

interface I2 extends I1{
    String name = "N1";
}*/

//21
/*class Element implements Comparable{
    int id;

    public Element(int id){
        this.id = id;
    }

    public int compareTo(Object obj){
        Element e = (Element)obj;
        return this.id - e.id;
    }

    public String toString(){
        return ""+ this.id;
    }

}*/

//Number 5
/*class Indices{
    public String s;
    public List<Integer> indices;
    public Indices(String s){
        this.s = s;
        indices = new LinkedList<>();
        for(int i =0; i < this.s.length(); i++){
            indices.add(i);
        }
    }
}*/