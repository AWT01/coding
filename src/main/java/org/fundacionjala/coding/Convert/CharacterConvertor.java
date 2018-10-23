package org.fundacionjala.coding.Convert;

/**
 * This class convert a word descend.
 */

public class CharacterConvertor {
  //Field get first character.
  private Character cFirst = '\0';
  //Field get second character.
  private Character cLast = '\0';
  //Field get input word character.
  private String word = "";

  //Constructor.
  public CharacterConvertor(String word){
    this.word = word;
  }

  /**
   * change the word.
   * @return word order descending
   */
  public String changeOrder(){
    StringBuilder newWord = new StringBuilder();
    char[] characters = word.toCharArray();
    cFirst = characters[0];
    newWord.append(cFirst);
    int index = word.length();
    cLast = word.charAt(index-1);

    for(int i= 1; i < word.length()-2; i++ )
    {
      char beforeCharacter = word.charAt(i+1);
      newWord.append(beforeCharacter);
      char afterCharacter = word.charAt(i);
      newWord.append(afterCharacter);
    }
    newWord.append(cLast);
    return newWord.toString();
  }
}

