import java.util.regex.*;
class RegexExample2
{
	public static void main(String[] args) {
		System.out.println(Pattern.matches(".s","as"));
		System.out.println(Pattern.matches("..s","mas")); //will return true only if the third char is s and length of string is s.
		System.out.println(Pattern.matches(".....y","bhavay"));//bhavay



		System.out.println(Pattern.matches("[amn]","abcd"));
		System.out.println(Pattern.matches("[amn]","a"));
		System.out.println(Pattern.matches("[amn]","ammmmma"));
		System.out.println(Pattern.matches("[ava]","bhavay")); //returns true if either a , v , a otherwise returns false.
		System.out.println(Pattern.matches("[amn]","amn"));

		System.out.println("? quantifier"); //default it runs as ? -> means that returns true if a or m or n comes one time otherwise returns false (teeno m se koi ek same length.)
		System.out.println(Pattern.matches("[amn]?","a"));
		System.out.println(Pattern.matches("[amn]?","aaa"));
		System.out.println(Pattern.matches("[amn]?","aazzta"));

		System.out.println(" + quantifer"); // returns true if a m n comes more than once.
		System.out.println(Pattern.matches("[amn]+","ammmmma"));


		System.out.println("*quantifer"); //returns true if a m n comes zero or more times.
		System.out.println(Pattern.matches("[amn]+","ammmmma"));


		System.out.println("metacharacters d...."); //d means digit
		System.out.println(Pattern.matches("\\d","abc")); //false because chars
		System.out.println(Pattern.matches("\\d","5")); //true
		System.out.println(Pattern.matches("\\d","56")); // false because length is more



		System.out.println("metacharacters D"); // D means non-digit
		System.out.println(Pattern.matches("\\D","abc")); //false because length is more
		System.out.println(Pattern.matches("\\D","m")); //true 


		System.out.println("metacharacters with quantifers");
		System.out.println(Pattern.matches("\\D*","mak")); //true


		System.out.println("creating a regular expression that accepts alphanumeric charcs only"); // [a-z] [A-Z] [0-9] where {x} is used to indicate size of x.

		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","zh2rAD"));
		System.out.println(Pattern.matches("[0-9]{10}","1234567891"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","kkavrun1234")); // false (more than 6 char)
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","JA2UK2"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","arun$2")); //false ($ is not matched)


		







	}
}