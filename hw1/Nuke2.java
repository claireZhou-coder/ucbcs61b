import java.net.*;
import java.io.*;


class Nuke2 {

  /** Prompts the user for the name X of a company (a single string), opens
   *  the Web site corresponding to www.X.com, and prints the first five lines
   *  of the Web page in reverse order.
   *  @param arg is not used.
   *  @exception Exception thrown if there are any problems parsing the 
   *             user's input or opening the connection.
   */
  public static void main(String[] arg) throws Exception {
  	BufferedReader keyboard;
    String inputLine;

    keyboard = new BufferedReader(new InputStreamReader(System.in));
    inputLine = keyboard.readLine();
    String result = inputLine.substring(0,1) + inputLine.substring(2);
    System.out.println(result);
  }
 }