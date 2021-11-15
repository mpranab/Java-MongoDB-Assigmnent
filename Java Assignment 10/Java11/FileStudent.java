package Java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class FileStudent {

	public static void main(String[] args) {
		var path= "C:\\Users\\PRANAMOH\\Downloads\\Java11Assignments_StudentList.txt";
		try {
			String data = Files.readString(Path.of(path));
			System.out.println(data);
			List<String> str = data.lines().map(S -> S.trim()).filter(S -> !S.isEmpty()).collect(Collectors.toList());
			for (String string : str) {
				System.out.println(string);
			}

			System.out.println("The number of students is:" + str.size());

		}

		catch (IOException e) {
			e.printStackTrace();
		}

	}
}