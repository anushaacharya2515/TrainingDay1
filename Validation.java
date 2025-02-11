Day 3:
1. Imagine you are working on a network configuration tool for a company. This tool needs to validate the IPv4 addresses entered by users to ensure they are correctly formatted before saving them in the system. An incorrectly formatted IP address could lead to network connectivity issues, making validation a crucial part of the tool.
Input: "222.111.111.111"
Output: true
Explanation: All parts are numeric and within the range 0-255.

Input: "5555..555"
Output: false
Explanation: The address is not properly split into 4 parts, and it contains empty parts.

Input: "0.0.0.255"
Output: true
Explanation: All parts are numeric and within the range 0-255.

Input: "0.0.0.0255"
Output: false
Explanation: The last part 0255 is not a valid representation of an IP address segment. Although 255 is within the range, the leading zero makes it invalid.


import java.util.regex.Pattern;

public class Validation {
    public static void main(String[] args) {
      String ipaddress="^[0-255. ]{12,}$";
      String address="222.111.111.111";
      System.out.println(Pattern.matches(ipaddress,address));
  }
}
