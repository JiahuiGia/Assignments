package Assignment6;

import java.io.File;

public class CountFiles {
	static int count = 0;
	public static int countFilesInDirectoryAndSubdirectories(String directory, String suffix) {
		File file = new File(directory);
		File[] fileArray = file.listFiles();
		if (file.isDirectory()) {
			for (int i = 0; i < fileArray.length; i++) {
				if (fileArray[i].isDirectory()) {
					countFilesInDirectoryAndSubdirectories(fileArray[i].getAbsolutePath(), suffix);
				} else if (fileArray[i].getAbsolutePath().endsWith(suffix)) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {

		int result = CountFiles.countFilesInDirectoryAndSubdirectories("E:/CloudMusic", ".mp3");
		System.out.println(result);
	}

}
