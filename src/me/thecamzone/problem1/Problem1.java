package me.thecamzone.problem1;

import java.util.Arrays;
import java.util.List;

public class Problem1 {
  public static final int[][] INT_ARRAY = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
  
  public static final List<String> STRING_LIST = Arrays.asList(new String[] { "a", "b", "c", "a", "b", "c" });
  
  public static void main(String[] args) {
    flipVariables(1, 2);
    System.out.println();
    printArray(INT_ARRAY);
    System.out.println();
    printArray(rotateArray(INT_ARRAY));
    System.out.println();
    System.out.println(countStrings(STRING_LIST, "c"));
  }
  
  public static void flipVariables(int x, int y) {
    x += y;
    y = x - y;
    x -= y;
    System.out.println(String.valueOf(x) + " " + y);
  }
  
  public static int[][] rotateArray(int[][] array) {
    int size = array.length;
    int i;
    for (i = 0; i < size; i++) {
      for (int j = i; j < size; j++) {
        int temp = array[i][j];
        array[i][j] = array[j][i];
        array[j][i] = temp;
      } 
    } 
    for (i = 0; i < size; i++) {
      for (int j = 0; j < size / 2; j++) {
        int temp = array[i][j];
        array[i][j] = array[i][size - 1 - j];
        array[i][size - 1 - j] = temp;
      } 
      System.out.println();
    } 
    return array;
  }
  
  public static void printArray(int[][] array) {
    int size = array.length;
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++)
        System.out.print(array[i][j]); 
      System.out.println();
    } 
  }
  
  public static int countStrings(List<String> strings, String string) {
    if (strings.isEmpty())
      return 0; 
    if (((String)strings.get(0)).equals(string))
      return countStrings(strings.subList(1, strings.size()), string) + 1; 
    return countStrings(strings.subList(1, strings.size()), string);
  }
}
