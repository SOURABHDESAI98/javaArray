package array1D.afternoon.arrayOfObject;

import java.util.Scanner;

public class HotGettingInputFromUser {

	public static Demo2[] settingValues(Demo2 d[]) {

		int j = 1;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < d.length; i++) {

			d[i] = new Demo2();
			System.out.println("Give id of student :" + j);
			d[i].setId(sc.nextInt());

			System.out.println("Give name of student :" + j);
			d[i].setName(sc.next());
			System.out.println("Give marks of student :" + j);
			d[i].setMarks(sc.nextInt());
			j++;

		}
		sc.close();
		return d;

	}

	public static void gettingValues(Demo2 d[]) {

		for (Demo2 n : d) {

			System.out.println(n.getId());
			System.out.println(n.getName());
			System.out.println(n.getMarks());
			System.out.println("------------------");

		}

	}

	public static void main(String[] args) {

		Demo2 d[] = new Demo2[3];

		d = settingValues(d);

		gettingValues(d);

	}
}
