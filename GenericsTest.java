/*
 Elanna Grossman
 Class that uses an generic method to interact with ArrayList of Strings.
 */

//package program;

import java.util.ArrayList;

public class GenericsTest
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("two");
        list.add("two");
        list.add("three");
        list.add("four");

        //Remove duplicates from ArrayList of Strings
        ArrayList<String> unique = removeDuplicates(list);

        for (String element : unique)
        {
            System.out.println(element);
        }//end for
    }//end main

    private static <E> ArrayList<E> removeDuplicates(ArrayList<E> list)
    {
        //Store unique items in result
        ArrayList<E> result = new ArrayList<>();

        // Record encountered Strings.
        ArrayList<E> set = new ArrayList<>();

        for (E item : list)
        {
            //If String is not in set, add it to the list and the set
            if (!set.contains(item))
            {
                result.add(item);
                set.add(item);
            }//end if
        }//end for
        return result;
    }//end removeDuplicates
}//end GenericsTest
