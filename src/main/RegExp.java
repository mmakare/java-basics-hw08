import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Regular expressions.
 */
public class RegExp {


  /**
   * {"8.8.8.8", "8.8.8.8"},
   *         {"http://192.168.1.1/index.html", "192.168.1.1"},
   *         {"This text contains a valid IP address 254.254.254.254, find it!", "254.254.254.254"},
   *         {"IP could not have negative numbers like -1.-2.-3.-4", ""},
   *         {" Invalid IP: 300.300.300.300!", ""}
   * Get IP address from text.
   * @param text text to parse
   * @return String with IP address
   */
  public static String getIpAddress(String text) {
    // TODO fill in code here for extracting IP address using Regular Expression
    String check = text.replaceAll("[0-9]{1,3}\\.*", "");

    /*if(check == null){
      String check2 = text.replaceAll("[0-9]{1,3}\\.*", "");
      String IP = check2;
    }*/

    return check;
  }
}