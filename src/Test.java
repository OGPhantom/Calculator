public class Test {

   public static String camelCase(String input) {
      String output = "";

      for (int i = 0; i < input.length(); i++) {
         char currentChar = input.charAt(i);
         boolean isUpperCase = Character.isUpperCase(currentChar);
         output += isUpperCase ? " " + currentChar : currentChar;
      }

      return output;

   }

   public static void main(String[] args) {
      String str = "camelCasingTest";
      System.out.println(camelCase(str));
   }
}