public class Decipherer {
  
  public static String decipher(String message) {
    int calculateChain = message.length()/2;
    String underChain = message.substring(5, 5+calculateChain);
    String replaceChain = underChain.replaceAll("@#\\?", " ");
    String reverseChain = new StringBuilder(replaceChain).reverse().toString();
    return reverseChain;
  }

  public static void main(String[] args) {
    String message1 = "0@sn9sirppa@#?ia'jgtvryko1";
    String message2 = "q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj";
    String message3 = "aopi?sedohtém@#?sedhtmg+p9l!";
    System.out.println(Decipherer.decipher(message1));
    System.out.println(Decipherer.decipher(message2));
    System.out.println(Decipherer.decipher(message3));
  }

}
