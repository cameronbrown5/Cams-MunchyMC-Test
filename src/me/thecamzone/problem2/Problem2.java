package me.thecamzone.problem2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Problem2 {
  public static void main(String[] args) {
    System.out.println(stringToChar("zysaraefefdshyrtaabcdefghijklmnopqrstuvwxyz"));
  }
  
  public static List<Character> stringToChar(String string) {
    return (List<Character>)string.chars()
      .mapToObj(e -> Character.valueOf((char)e))
      .filter(character -> (character.charValue() != '!' && character.charValue() != '&'))
      .filter(character -> (character.charValue() % 10 != 0))
      .sorted(Comparator.reverseOrder())
      .collect(Collectors.toList());
  }
}
