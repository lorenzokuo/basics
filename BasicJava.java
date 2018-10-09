import java.util.*;

public class BasicJava {
	public void printTwoTwoFive() {
		for (int i=1; i<256; i++) {
			System.out.println(i);
		}
	}
	public void printOdd() {
		for (int i=1; i<256; i++) {
			if (i%2==1){
				System.out.println(i);
			}
		}
	}
	public void printSum() {
		int sum = 0;
		for (int i=0; i<256; i++) {
			System.out.println("New number: "+ i + " Sum: " + (sum += i));
		}
	}
	public void iteratePrint(int[] x) {
		for (int i=0; i<x.length; i++) {
			System.out.println(x[i]);
		}
	}
	public void findMax(int[] x) {
		int max = x[0];
		for (int i=0; i<x.length; i++) {
			if (x[i]>max) {
				max = x[i];
			}
		}
		System.out.println(max);
	}
	public void getAverage(int[] x) {
		int sum = 0;
		int avg;
		for (int i=0; i<x.length; i++) {
			sum += x[i];
		}
		avg = sum/x.length;
		System.out.println(avg);
	}
	public void oddNumberArray() {
		ArrayList<Integer> y = new ArrayList<Integer>();
		for (int i=1; i<256; i++) {
			if (i%2==1){
				y.add(i);
			}
		}
		System.out.println(y);
	}
	public Integer greaterThanY(int[] x, int y) {
		int count = 0;
		for (int i=0; i<x.length; i++) {
			if (x[i]>y) {
				count += 1;
			}
		}
		return count;
	} 
	public void squareValues(int[] x) {
		for (int i=0; i<x.length; i++) {
			x[i] = x[i]*x[i];
		}
		System.out.println(Arrays.toString(x));
	}
	public void deleteNeg(int[] x) {
		for (int i=0; i<x.length; i++) {
			if (x[i]<0) {
				x[i] = 0;
			}
		}
		System.out.println(Arrays.toString(x));
	}
	public void maxMinAvg(int[] x) {
		int max=x[0];
		int min=x[0];
		int avg=0;
		int sum = 0;
		for (int i=0; i<x.length; i++) {
			if (x[i]>max) {
				max = x[i];
			} else if (x[i]<min) {
				min = x[i];
			}
			sum += x[i];
			avg = sum/x.length;
		}
		int[] newArr = {max,min,avg};
		System.out.println(Arrays.toString(newArr));
	}
	public void shiftValues(int[] x) {
		for (int i=0; i<x.length; i++) {
			if (i == x.length-1) {
				x[i] = 0;
			} else {
				x[i] = x[i+1];
			}
		}
		System.out.print(Arrays.toString(x));
	}
}









