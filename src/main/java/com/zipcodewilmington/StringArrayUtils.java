package com.zipcodewilmington;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {

        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        boolean contains = Arrays.asList(array).contains(value);
        return contains;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        StringBuilder reversed = new StringBuilder();
        for (int i = array.length; i > 0; i--) {
            reversed.append(array[i - 1]).append(" ");
        }
        String[] reversedArray = reversed.toString().split(" ");
        return reversedArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        StringBuilder reversed = new StringBuilder();
        for (int i = array.length - 1; i >= 0; i--) {
            reversed.append(array[i]);
        }
        return reversed.toString().equals(String.join("", array));
    }

//        StringBuilder reversed = new StringBuilder();
//        boolean isPalindromic = false;
//        for (int i = array.length; i > 0; i--) {
//            reversed.append(array[i - 1]).append(" ");
//        }
//        String[] reversedArray = reversed.toString().split(" ");
//        if (Arrays.equals(reversedArray, array)) {
//            isPalindromic = true;
//        }
//        return isPalindromic;
//    }
//        Doesn't work because " " messes up with the second test.

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        boolean isPangramic = true;
        String newArray = Arrays.toString(array).toLowerCase();
        for (char c = 'a'; c <= 'z'; ++c) {
            if (!newArray.contains(String.valueOf(c))) {
                isPangramic = false;
                break;
            } else {
                isPangramic = true;
            }
        }
        return isPangramic;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        Arrays.sort(array);
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                count++;
            }
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int num = 0;
        for (String element : array) {
            if (!element.equals(valueToRemove)) {
                num++;
            }
        }
        String[] result = new String[num];
        int resultIndex = 0;
        for (String element : array) {
            if (!element.equals(valueToRemove)) {
                result[resultIndex] = element;
                resultIndex++;
            }
        }
        return result;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> result = new ArrayList<>();
        String prev = array[0];
        result.add(prev);

        for (int i = 1; i < array.length; i++) {
            if (!array[i].equals(prev)) {
                result.add(array[i]);
                prev = array[i];
            }
        }
        String[] strArray = new String[result.size()];
        return result.toArray(strArray);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        List<String> result = new ArrayList<>();
        String current = "";
        for (String str : array) {
            if (str.equals(current)) {
                int lastIndex = result.size() - 1;
                String lastStr = result.get(lastIndex);
                result.set(lastIndex, lastStr + str);
            } else {
                result.add(str);
                current = str;
            }
        }
        return result.toArray(new String[0]);
    }

}
