import java.util.Scanner;

public class PallidromeSeries {
	public static void main(String[] args) {
		String s = "123321";
		char a[] = s.toCharArray();
		char n, t;

		int i = 0;
		int j = a.length-1;
		boolean isPalendrome = true;
		while (i < s.length() && j >= 0) {
			n = a[i];
			t = a[j];
			if (n != t) {
				isPalendrome = false;
				break;
			} 
			i = i + 1;
			j = j - 1;
		}
		if(isPalendrome)
		{
			System.out.println("Palendrone");
			
		}else {
			System.out.println("Not palendrome");
		}

	}
}

