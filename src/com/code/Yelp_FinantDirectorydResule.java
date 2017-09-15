/*implment the 'cd' command i.e. given a function 
 * cd('a/b' , '"c/../d/e/../f"),
 * where 1st param is current directory and 2nd param is the sequence of operations,
 * find the final directory that the user will be in when the cd 
 * command is executed. 
 *
 * 
 * -Firstly we take a/b in a string called currentdirectory 
-Then we split "c/../d/e/../f" with delimiter as "/" 
-When there is a ".." then we take a substring of the currentdirectory 
-If there is a character, then we will append "/" and the character
 */

package com.code;

public class Yelp_FinantDirectorydResule {
	private static String findResultingDirectory(String currentDirectory,
			String sequenceOfOperations) {

		String[] splitDirectories = sequenceOfOperations.split("/");

		for (int i = 0; i < splitDirectories.length; i++) {
			if (splitDirectories[i].equals("..")) {
				currentDirectory = currentDirectory.substring(0,
						currentDirectory.length() - 2);
			} else {
				currentDirectory = currentDirectory + "/" + splitDirectories[i];
			}
		}

		return currentDirectory;
	}

	public static void main(String[] args) {
		System.out.println(findResultingDirectory("a/b", "c/../d/e/../f"));
	}
}
