package javahack;

import java.io.*;

public class ReverseFileContent {

	public static void main(String[] args) {
		File inputFile = new File(
				"C:\\Users\\gorti\\anuprojects\\git-projects\\javatraining\\src\\javahack\\testinput.txt");
		File outputFile = new File(
				"C:\\Users\\gorti\\anuprojects\\git-projects\\javatraining\\src\\javahack\\testoutput.txt");

		StringBuilder content = new StringBuilder();

		// Read content from the input file
		try {
			FileReader filereader = new FileReader(inputFile);
			BufferedReader br = new BufferedReader(filereader);
			String fileContent;
			while ((fileContent = br.readLine()) != null) {

				content.append(fileContent).append("\n");
			}
			br.close();
		} catch (IOException e) {

			e.printStackTrace();
		}

		String reversedContent = content.reverse().toString();

		// write content to the output file
		try {
			FileWriter fileWriter = new FileWriter(outputFile);
			BufferedWriter bw = new BufferedWriter(fileWriter);
			bw.write(reversedContent);
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
