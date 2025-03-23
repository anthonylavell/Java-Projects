package arraysandstrings.array;

public class Main {
    public static void main(String[] args) {
        int [] arrOfInt = new int [3];

       /* int [] arrOfInt = {-1, 0, 1, 2, -1, -4};

        //-4 -1 -1 0 1 2 6
        //-1 -1 -1 -1 -1 -1 -1 -1 0 1*/
       /*

        System.out.println("result 1: "+ Triplets.threeSum(arrOfInt));
        int [] arr =  {-4,-2,1,-5,-4,-4,4,-2,0,4,0,-2,3,1,-5,0};
        //-5 -5 -4 -4 -4 -4 -2 -2 -2 0 0 0 1 1 3 4 4
        int [] arr2 =  {};
        System.out.println("result: "+Triplets.threeSum(arr2));*/

       // int [][] array2d = {{0,1,2,0}, {3,4,5,2}, {1,3,1,5,6}};
        int [][] array2d = {{-4,-2147483648,6,-7,5},{-8,6,-8,-6,0},{0,2,-9,-6,-10}};
       // int [][] array2d = {{0,1,2,0}, {3,4,5,2}, {1,3,1,5,6}};
       // int [][] array2d = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        new Matrix().setZero(array2d);

       //String [] strs = {"ward","draw","hello"};
      // String [] strs = {"eat","tea","tan","ate","nat","bat"};
       // System.out.println(new Anagrams().groupAnagrams(strs) );

     /*  Arrays.sort( strs[0].toCharArray() );
        System.out.println(strs[0]);
        List<String> list = new ArrayList<>();
        list = new ArrayList<String>( Arrays.asList( Arrays.copyOfRange(strs,0,6)) );


        System.out.println(list);
        List<List<String>> ll = new ArrayList<>();
        ll.add(new ArrayList<>(Arrays.asList("ate","eat","tea" )));
        ll.add(new ArrayList<>(Arrays.asList("nat","tan" )));
        ll.add(new ArrayList<>(Arrays.asList("bat" )));
        System.out.println(ll.stream().anyMatch(e -> e.contains("ant"))   );*/
    }
}
