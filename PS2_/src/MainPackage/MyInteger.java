package MainPackage;

public class MyInteger {
	int value;

	public MyInteger(int newValue) {
		this.value = newValue;
	}

	public int getVAlue() {
		return value;
	}

	public boolean isEven() {
		if (value % 2 == 0) {
			return true;
		}
		return false;
	}

	public boolean isOdd() {
		if (value % 2 != 0) {
			return true;
		}
		return false;
	}

	public boolean isPrime() {
		int p = 0;
		for (p = 2; p <= value / 2; p++) {
			if (value % p != 0) {
				return true;
			}
		}
		return false;
	}

	public static boolean isEven(int value) {
		if (value % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isOdd(int value) {
		if (value % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isPrime(int value) {
		return isPrime(value);
	}

	public static boolean isEven(MyInteger mYInteger) {
		return MyInteger.isEven(mYInteger.getVAlue());
	}

	public static boolean isOdd(MyInteger mYInteger) {
		return MyInteger.isOdd(mYInteger.getVAlue());
	}

	public static boolean isPrime(MyInteger mYInteger) {
		return MyInteger.isPrime(mYInteger.getVAlue());
	}

	public boolean equals(int intVAlue) {
		return value == intVAlue;
	}

	public boolean equals(MyInteger mYInteger) {
		return equals(mYInteger.getVAlue());
	}

	public static int parseInt(String g) {
		return Integer.parseInt(g);
	}

	public static int parseInt(char[] g) {
		return parseInt(new String(g));
	}
}