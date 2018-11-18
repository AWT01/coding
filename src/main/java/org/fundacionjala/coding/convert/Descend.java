package org.fundacionjala.coding.convert;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * This class help to order the content.
 * in descending order.
 */
public class Descend {

  //The field to contain the word.
  private String text = "";
  private List<String> resultList = Collections.emptyList();
  private String result = "";
  static final int INDEX_CONSTANT = 3;

  /**
   * Constructor.
   * @param text receive.
   */
  public Descend(final String text) {
    this.text = text;
  }

  /**
   * Split the text by regex spaces.
   * @return list of words.
   */
  private List<String> inputWords() {
    resultList = Stream.of(this.text.split(" "))
        .collect(Collectors.toList());
    return  resultList;
  }

  /**
   * call to convertor.
   */
  public void sortTheInnerContent() {
    resultList = inputWords();
    StringBuilder words = new StringBuilder();
    for (String word : resultList) {
      words.append(changeOrder(word));
      words.append(" ");
    }
    this.result = words.toString();
  }

  /**
   * Retrieve the result.
   * @return a result.
   */
  public String getResult() {
    return result;
  }

  /**
   * change the word.
   * @param word origin.
   * @return word order descending.
   */
    public String changeOrder(final String word) {
      StringJoiner newWord = new StringJoiner("");
      char[] characters = word.toCharArray();
      Character cFirst = characters[0];
      newWord.add(cFirst.toString());
      int index = word.length();
      Character cLast = word.charAt(index - 1);

      if (index >= 2) {
        for (int i = 1; i < word.length() - 2; i++) {
          Character beforeCharacter = word.charAt(i + 1);
          newWord.add(beforeCharacter.toString());

          Character afterCharacter = word.charAt(i);
          newWord.add(afterCharacter.toString());
        }
        newWord.add(cLast.toString());
      }

      if (index == INDEX_CONSTANT) {
        newWord = new StringJoiner("");
        newWord.add(word);
      }

      return newWord.toString();
    }
}
