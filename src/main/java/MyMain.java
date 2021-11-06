import java.util.ArrayList;

public class MyMain {

    // Counts the number of words that starts with 'a' or 'A'
    public static int startsWithA(ArrayList<String> list) {
        int count = 0;
        for (String x: list) {
            if(x.toUpperCase().charAt(0)=='A'){
                count++;
            }
        }
        return count;
    }

    // Adds a ! to each element in the ArrayList, returns an ArrayList
    public static ArrayList<String> makeExciting(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i)+"!");
        }
        return list;
    }

    // Returns true if there is an int that appears in both lists
    public static boolean checkDuplicates(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if(list1.get(i)==list2.get(j)) {
                    return true;
                }
            }
        }
        return false;
    }


    // METHODS FOR THE HOMEWORK:

    // Counts the number of odd numbers in list
    public static int countOdd(ArrayList<Integer> list) {
        int count = 0;
        for(Integer x: list) {
            if(Math.abs(x)%2==1) {
                count++;
            }
        }
        return count;
    }

    // Takes an int[] as input and returns the equivalent ArrayList<Integer>
    // Unlike the other methods, the input is an array!
    public static ArrayList<Integer> convertToArrayList(int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        return list;
    }

    // Takes two **sorted** ArrayLists and merges them together into one big sorted ArrayList
    // (Hint: you may find it useful to use a while loop, as well as the remove() method).
    public static ArrayList<Integer> merge(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> toMerge = new ArrayList<Integer>();
        for (int i = 0; i < list1.size(); i++) {
            toMerge.add(list1.get(i));
        }
        for (int i = 0; i < list2.size(); i++) {
            toMerge.add(list2.get(i));
        }

        int placehold=0;
        for (int i = 0; i < toMerge.size(); i++) {
            for (int j = 0; j < toMerge.size()-i-1; j++) {
                if(toMerge.get(j)>toMerge.get(j+1))
                {
                    placehold=toMerge.get(j);
                    toMerge.set(j, toMerge.get(j+1));
                    toMerge.set(j+1, placehold);
                }
            }
        }
        return toMerge;
    }



    public static void main(String[] args) {
        ArrayList<String> aList = new ArrayList<String>();
        aList.add("bird");
        aList.add("cat");
        aList.add("animal");
        aList.add("Apprehensive");
        aList.add("fish");
        aList.add("antidisestablishmentarianism");
        System.out.println(aList);
        System.out.println(startsWithA(aList));
        System.out.println(makeExciting(aList));
        ArrayList<Integer> aListI = new ArrayList<Integer>();
        aListI.add(34);
        aListI.add(2);
        ArrayList<Integer> aListI2 = new ArrayList<Integer>();
        aListI2.add(33);
        aListI2.add(2);
        System.out.println(checkDuplicates(aListI, aListI2));
        aListI.set(1, 39039);
        System.out.println(checkDuplicates(aListI, aListI2));
    }
}
