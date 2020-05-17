package co.com.ingjuanfg.utils.strings;

import java.util.Random;

public class StringManager {
  public static String generateEmail() {
    Random r = new Random();
    StringBuilder wordGenerated = new StringBuilder(6);
    for (int i = 0; i < 6; i++) {
      char letter = (char) ('a' + r.nextInt('z' - 'a'));
      wordGenerated.append(letter);
    }
    return wordGenerated.toString() + "@gmail.com";
  }
}
