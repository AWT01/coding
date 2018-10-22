package org.fundacionjala.coding;

/**
 * @author KevinHerrera - AWT-[01].
 * @version 0.1
 */
public class CesarCrypto {

    public String Encode(String message, int key) {
        StringBuilder messageBuilder = new StringBuilder();
        if (message == null) return messageBuilder.toString();
        for (char c : message.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                int aux = Character.hashCode(Character.toUpperCase(c));
                int newValue = aux == 90 ? 64 + key : aux + key;
                messageBuilder.append(Character.toChars(newValue));
            } else {
                messageBuilder.append(c);
            }
        }
        return messageBuilder.toString();
    }
}
