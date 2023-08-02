package array1D.afternoon;

public class TestWithVarargs {

	public static void show(int... a) {
		System.out.println("varargs");
	}

	// internally compiler will create array with name b (b[])
	// rule 1
	// we can use other parameter with varargs method but
	// varargs arg should be at last

	// rule 2
	// in method we can use only one varargs
	// public static int sum(int c,float d,int ... b,int ...p)
	public static int sum(int... b) {
		int sum = 0;

		for (int i : b) {
			sum = sum + i;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		show(10);
		show(10, 20);
		show(10, 20, 30);
		int a[] = { 12, 34, 56, 78 };
		show(a);

		System.out.println("---sum---");
		System.out.println(sum(10, 20));
		System.out.println(sum(10, 20, 30));
		System.out.println(sum(a));
	}

}
