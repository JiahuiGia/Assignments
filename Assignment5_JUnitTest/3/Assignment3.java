/**
 * Finish assignments, try bonus.
 * Deadline: Before the next class.
 * @author Yang
 */
 class Person{
	int age;
	boolean gender;//false --> male, true --> female
	Person(int age, boolean gender){
		this.age = age;
		this.gender = gender;
	}
}
public class Assignment3 {
	//assignments
	/**
	 * Return the sum of a given array. You may assume the sum will not overflow.
	 */
	public int sumArray(int[] nums){
		
		int sum = 0;
		int i;
		for(i=0;i<nums.length;i++){
			sum = sum + nums[i];
		}
		return sum;
	}
	
	/**
	 * Write a Computer program to find the type of a person and print the type.
	 * Infant : If the age is less than 1 year
	 * Toddler : If the age is less than 3 and greater than 1
	 * Pre Schooler : If the age is less than 5 and greater than 3
	 * KG Girl : If the age is greater than 5 and less than 6 and the gender is female
	 * KG Boy : If the age is greater than 5 and less than 6 and the gender is male
	 */
	public void personType(Person person){
		
		if(person.age<1)
			System.out.println("Infant");
		else if(person.age>=1 && person.age<3)
			System.out.println("Toddler");
		else if (person.age>=3 && person.age<5)
			System.out.println("Pre Scholer");
		else if(person.age>=5 && person.age<6 && person.gender == true)
			System.out.println("KG Girl");
		else if(person.age>=5 && person.age<6 && person.gender == false)
			System.out.println("KG Boy");
		else if(person.age>=6)
			System.out.println("Wrong person");
	}
	
	/**
	 * Given a sorted array, find whether there are duplicates in it.
	 */
	public boolean findDuplicates(int[] nums){
		
		int i;
		int count = 0;
		 for(i=0;i+1<nums.length;i++){
			 if(nums[i] == nums[i+1])
				 count = count + 1;
		 }
		 if(count==0)
			 return false;
		 else
			 return true;
	}
	
	/**
	 * Given an array and a index, delete the number at that index in the array.
	 * You should return a new array which doesn't contain that number.
	 * For example, input {1,2,3,4,5}, index = 1, you should return {1,3,4,5}.
	 */
	public int[] deleteElement(int[] nums,int index){
		
		int[] newNums = new int[nums.length - 1];
		
		int i;
		
		for(i=0;i<nums.length-1;i++){
			if(i<index)
				newNums[i] = nums[i];
			else
				newNums[i] = nums[i+1];
		}
		return newNums;
	}
	
	/**
	 * Given a integer 'n', return n%count, count is the number of digits of n
	 * For example, n = 100, return 1
	 */
	public int countDigits(int n){
		
		int remainder;
		
		String digitsOfN = "" + Math.abs(n);
		
		remainder = n%digitsOfN.length();
		
		return remainder;
	}
	
	/**
	 * Given a integer 'n', if n is odd, print n odd numbers, if n is even, print n even numbers.
	 * For example, n = 3, print 1 3 5      n = 4, print 0 2 4 6
	 */
	public void printNumbers(int n){
		
		int i;
		
		if(n%2 == 0){
			for(i=0;i<n;i++)
				System.out.print(i*2 + " ");
		}else{
			for(i=0;i<n;i++)
				System.out.print(i*2+1 + " ");	
		}
	}
	
	
	//bonus
	/**
	 * A robot from Mars send a long message to Earth which only contains many "SOS", like "SOSSOS", "SOSSOSSOSSOSSOS"
	 * But the radiation from universe changed some characters of the massage.
	 * Write a method to count how many characters were changed.
	 * For example, "SOSSOSSOS" might be changed to "SOSSUSSOP", then your method should return 2.
	 * The message was consisted by "SOS" so its length will be multiple of 3.
	 * You could assume the message only contains upper letter.
	 */
	public int checkMessage(String message){
		
		int n = 0;
		int i;
		
		for(i=0;i<message.length()/3;i++){
			if(message.charAt(i*3) != 'S')
				n = n + 1;
			if(message.charAt(i*3+1) != 'O')
				n = n + 1;
			if(message.charAt(i*3+2) != 'S')
				n = n + 1;
		}
		return n;
	}
}