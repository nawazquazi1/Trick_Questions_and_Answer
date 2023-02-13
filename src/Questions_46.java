public class Questions_46 {

    public static void main(String[] args) {
        String str = "    This is my     java code" +
                "\n java cou  rse   "
                +"\ncora    jsa  va";
        System.out.println(str.trim());
        System.out.println(str.replaceAll("\\s+", ""));

        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ' &&str.charAt(i)!='\t') {
                newString.append(str.charAt(i));
            }
        }
        System.out.println(newString);

    }
}