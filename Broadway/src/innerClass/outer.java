package innerClass;

class outer {
	static class inner {
		public static void add(int x, int y) {
			int z = x + y;
			System.out.println("add = " + z);
		}
	}
}

class innerclass_demo1 {
	public static void main(String args[]) {
		outer.inner.add(15, 10);
	}
}
