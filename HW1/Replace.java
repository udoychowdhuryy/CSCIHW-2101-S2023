package HW1;
// Make a method that accepts a string an integer and a char and will return the string with the char
// replaced at the integer given
// charReplace("I MAKE BREAD",2,'T')
// EX: I MAKE BREAD, 2, T
//     I TAKE BREAD
// remember computer counting starts at 0:
// HELLO
// 01234
public class Replace {      
    public String charReplace(String sentence, int number, char ch) {
        String newStr = sentence.substring(0, number) + sentence.substring(number + 1);
        String newString = newStr.substring(0, number) + ch + newStr.substring(number); 
        return newString;
    }
 
}

