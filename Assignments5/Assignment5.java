import java.util.Arrays;
import java.util.Date;

/**
 * Finish all the assignments before next class.
 * 
 * @author Yang
 */

public class Assignment5 {
	/**
	 * In computer, the file system is very important. Try to create classes for
	 * file and folder. Hint: You might find there are many similarities between
	 * file and folder: they both have name, size and created date; they both
	 * could be open by double click; ... So use the concept of abstract class
	 * to make your code more neat.
	 */
	abstract class FileSystem {
		String name;
		Date modifiedDate;
		String type;
		int size;

		public FileSystem(String name, Date modifiedDate, String type, int size) {
			this.name = name;
			this.modifiedDate = modifiedDate;
			this.type = type;
			this.size = size;
		}

		abstract FileSystem doubleClick();

		public String getName() {
			return this.name;
		}

		public Date getModifiedDate() {
			return this.modifiedDate;
		}

		public String getType() {
			return this.type;
		}

		public int getSize() {
			return this.size;
		}
	}

	class File extends FileSystem {

		public File(String name, Date modifiedDate, String type, int size) {
			super(name, modifiedDate, type, size);
		}

		@Override
		FileSystem doubleClick() {
			return this;
		}

	}

	class Folder extends FileSystem {
		
		private String type = "Folder";
		
		public String getType() {
			return type;
		}
		
		public Folder(String name, Date modifiedDate, String type, int size) {
			super(name, modifiedDate, type, size);
		}

		@Override
		FileSystem doubleClick() {
			return this;
		}

	}

	/**
	 * Design abstract class Person, interface Driver, Teacher, Teenager, Adult.
	 * Then create classes TeenagerDriver, TeenagerTeacher, AdultDriver and
	 * AdultTeacher which extend Person and implement suitable interfaces.
	 */
	abstract class Person {
		String name;
		int age;
	}

	interface Driver {
		void drive();
	}

	interface Teacher {
		void teach();
	}

	interface Teenager {
		void play();
	}

	interface Adult {
		void work();
	}

	class TeenagerDriver extends Person implements Teenager, Driver {

		@Override
		public void drive() {
			System.out.println("Drive with adult's companion");
		}

		@Override
		public void play() {

		}

	}

	class TeenagerTeacher extends Person implements Teenager, Teacher {

		@Override
		public void teach() {

		}

		@Override
		public void play() {

		}

	}

	class AdultDriver extends Person implements Adult, Driver {

		@Override
		public void drive() {
			System.out.println("Drive along");
		}

		@Override
		public void work() {

		}

	}

	class AdultTeacher extends Person implements Adult, Teacher {

		@Override
		public void teach() {
			
		}

		@Override
		public void work() {
			
		}

	}

	/**
	 * Rotate the input array in place(without extra space) e.g. input nums =
	 * {5,1,9,0}, after calling this method, the nums should be {0,9,1,5}
	 */
	public void rotateArrayInPlace(int[] nums) {

		for (int i = 0; i < (nums.length + 1) / 2; i++) {
			int temp = nums[i];
			nums[i] = nums[nums.length - 1 - i];
			nums[nums.length - 1 - i] = temp;
		}
		// String numsString = Arrays.toString(nums);
		// System.out.println(numsString);
	}

	/**
	 * Rotate the input array without changing the input. Return the rotated
	 * array. e.g. input nums = {5,1,9,0}, after calling this method it'll
	 * return {0,9,1,5} while the nums is still {5,1,9,0}
	 */
	public int[] rotateArrayWithoutModifyInput(int[] nums) {

		int[] rotateNums = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			rotateNums[i] = nums[nums.length - 1 - i];
		}
		return rotateNums;
	}

}