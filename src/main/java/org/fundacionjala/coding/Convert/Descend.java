package org.fundacionjala.coding.Convert;

/**
 * This class help to order the content.
 * in descending order.
 */

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Descend {

  //The field to contain the word.
  private String text= "";
  private List<String> resultList = Collections.emptyList();
  private String result = "";

  /**
   * Constructor.
   * @param text receive.
   */
  public Descend(String text){
    this.text = text;
  }

  /**
   * Split the text by regex spaces.
   * @return list of words.
   */
  private List<String> inputWords(){
    resultList = Stream.of(this.text.split(" "))
        .map (elem -> new String(elem))
        .collect(Collectors.toList());
    return  resultList;
  }

  /**
   * call to convertor.
   */
  public void sortedWordsDescend() {
    resultList = inputWords();
    StringBuilder words = new StringBuilder();
    for (String word : resultList) {
      CharacterConvertor convert = new CharacterConvertor(word);
      words.append(convert.changeOrder());
      words.append(" ");
    }
    showMessageDescend(words);
  }

  /**
   * Show the text converted.
   */
  private void showMessageDescend(StringBuilder words)
  {
    this.result = words.toString();
    System.out.println(words.toString());
  }

  public String getResult() {
    return result;
  }
}

