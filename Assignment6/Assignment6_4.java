package Assignment6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Assignment6_4 {
	public void readAndReverseFile(File f) throws IOException {
		BufferedReader br = null;
		List<String> myList = new ArrayList<String>();
		try {
			br = new BufferedReader(new FileReader(f));
			String str;
			while ((str = br.readLine()) != null) {
				myList.add(str);
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				br.close();
			}
		}
		// Collections.reverse(myList);
		for (int i = myList.size() - 1; i >= 0; i--) {
			String s = (String) myList.get(i);
			System.out.println(s);
		}
	}
}
