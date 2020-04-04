package novikova_task_2_from_slide_196;

import java.util.*;
import java.util.stream.IntStream;


public class Main {

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1,45,78,94,1,2,0,-4);
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(-8);
        list.add(87);

        //sort
        list.sort(Collections.reverseOrder());
        System.out.println(list);

        intList.sort(Collections.reverseOrder());
        System.out.println(intList);
        
        //sum of elements
        Integer sum = 0;
        for(Integer intVal: intList)
        {
            sum += intVal;
        }
        System.out.println(sum);

        int[] intArr = new int[] {1,45,8,4,7};
        System.out.println(IntStream.of(intArr).sum());
        
        //map checking
        Map<String,String> myMap = new HashMap<>();
        myMap.put("1","one");
        myMap.put("2","two");
        myMap.put("3","three");
        System.out.println(myMap.containsValue("four"));
        System.out.println(myMap.containsValue("three"));
        System.out.println(myMap.containsKey("one"));
        
        //LinkedList
        List<String> linkedList = new LinkedList();
        linkedList.add("Nastya");
        linkedList.add("Lily");
        linkedList.add("Nata");
        linkedList.add(0,"Dasha");
        linkedList.add(linkedList.size(),"Ann");
        System.out.println(linkedList);

        //find element in ArrayList
        //by index of element
        System.out.println(intList.get(5));
        Integer expectedValue = 2;
        
        //by value
        for(Integer value: intList)
        {
            if(expectedValue.equals(value))
            {
                System.out.println(value);
            }
        }
        
        //notes
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addNote("Me","88005553535");
        phoneBook.addNote("Friend","584787");
        phoneBook.deleteNote("Friend");
        phoneBook.deleteNote("Friend");
        phoneBook.edit("Me","87899");
        System.out.println(phoneBook.getNotes());
    }
}
