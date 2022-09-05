import java.util.*;

class AuthoringAssistant {

    // Method to print menu
    public static char printMenu(Scanner sc) {
        System.out.println(
                "\n\nMENU\nc - Number of non-whitespace characters\nw - Number of words\nf - Find text\nr - Replace all !'s\ns = Shorten spaces\nq - Quit\n\nChoose an option:");

        char userInput = sc.next().charAt(0);
        return userInput;
    }

    // Method to get number of non-whitespace characters
    public static int getNumOfNonWSCharacters(final String usrStr) {
        int count = 0;
        int i = 0;
        while (i < usrStr.length()) {
            if (usrStr.charAt(i) != ' ') {
                count++;
            }
            i++;
        }
        return count;
    }

    // Method to get number of words
    public static int getNumOfWords(final String usrStr) {
        int count = 0;
        String temp=usrStr.trim().replaceAll(" +", " ");
        String strArr[] = temp.split(" ");
        count = strArr.length;
        return count;
    }

    // Method to replace all exclamation marks
    public static String replaceExclamation(final String usrStr) {
        String newStr = usrStr.replaceAll("!", "");
        return newStr;
    }

    // Method to remove all extra whitespaces
    public static String shortenSpace(final String usrStr) {
        System.out.println("This method is called.");
        String newStr = usrStr.trim();
        newStr=newStr.replaceAll(" +", " ");
        return newStr;
    }

    // Method to search a text
    public static int findText(String toFind, String usrStr) {
        String usrStrArr[] = usrStr.split(" ");
        System.out.println("This method is called.");
        int count = 0;
        for (int i = 0; i < usrStrArr.length; i++) {
            if (usrStrArr[i].contains(toFind)) {
                count++;
            }
        }
        return count;
    }


    // Main method.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sample text:");
        final String usrStr = sc.nextLine();

        System.out.println("You entered: " + usrStr);

        // This loop will continue until the user press 'q'.
        while (true) {
            char userOption = printMenu(sc);

            // All the below conditions will handle each and every query of the user

            if (userOption == 'c') {
                int result = getNumOfNonWSCharacters(usrStr);
                System.out.println("Number of non-whitespace characters:" + result);
            }

            else if (userOption == 'w') {
                int result = getNumOfWords(usrStr);
                System.out.println("Number of words: " + result);
            }

            else if (userOption == 'f') {
                sc.nextLine();
                System.out.println("Enter a word or phrase to be found:");
                String toFind = sc.nextLine();
                String instance = "\"" + toFind + "\"";
                int result = findText(toFind, usrStr);
                System.out.println(instance + " instances: " + result);
            }

            else if (userOption == 'r') {
                String result = replaceExclamation(usrStr);
                System.out.println("Replaced Exlamation: " + result);
            }

            else if (userOption == 's') {
                String result = shortenSpace(usrStr);
                System.out.println("Edited text: " + result);
            }

            else if (userOption == 'q') {
                System.out.println("Goodbye!!");
                break;
            }
        }
    }
}



