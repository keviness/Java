/**List collection example
*@author keviness
*@version 2020/11/4
*/

public class CollectionList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple"); // size=1
        list.add(null); // size=2
        list.add("pear"); // size=3
        String second = list.get(1); // null
        System.out.println(second);

        //Collection for loop
        List<String> list = List.of("apple", "pear", "banana");
        for (int i=0; i<list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }

        //Collection Iterator iterator
        for (Iterator<String> it = list.iterator(); it.hasNext(); ) {
            String s = it.next();
            System.out.println(s);
        }

        //for each loop
         for (String s : list) {
            System.out.println(s);
        }

        //Conert to array
        //first
        Object[] array = list.toArray();
        //second
        Integer[] array = list.toArray(new Integer[3]);
        //third
        //Integer[] array = list.toArray(Integer[]::new);
        for (Object s : array) {
            System.out.println(s);
        }
    }
}