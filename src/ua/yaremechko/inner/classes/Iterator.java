package ua.yaremechko.inner.classes;

public interface Iterator {

	public boolean hasNext();

	public Object next();

}

class Collection {
	private static Number[] arr;

	public Collection(Number[] arr) {
		Collection.arr = arr;
	}

	public class First implements Iterator {

		private int count = 0;

		@Override
		public boolean hasNext() {
			return count < arr.length;
		}

		@Override
		public Object next() {
			if (arr[count].doubleValue() % 2 != 0) {
				arr[count] = 0;
			}
			return arr[count++];
		}

	}

	public First createFirst() {
		return new First();
	}

	public class Seccond implements Iterator {

		private int count = arr.length + 1;

		@Override
		public boolean hasNext() {
			return count >= 2;
		}

		@Override
		public Object next() {
			return arr[count -= 2];
		}

	}

	public Seccond createSeccond() {
		return new Seccond();
	}

	public Iterator createThird() {
		return new Iterator() {

			private int count = arr.length + 2;

			@Override
			public boolean hasNext() {
				return count >= 3;
			}

			@Override
			public Object next() {
				if (arr[count -= 3].doubleValue() % 2 != 0) {
					System.out.println(arr[count]);
				}
				return arr[count--];
			}

		};
	}

	public Iterator createFourth() {
		class Fourth implements Iterator {

			private int count = 0;

			@Override
			public boolean hasNext() {
				return count < arr.length;
			}

			@Override
			public Object next() {
				if (arr[count += 4].doubleValue() % 2 == 0) {
					System.out.println(arr[count].intValue() - 100);
				}
				return arr[count++];
			}

		}

		return new Fourth();
	}

	private static class Fifth implements Iterator {

		private int count = -2;

		@Override
		public boolean hasNext() {
			return count < arr.length;
		}

		@Override
		public Object next() {
			if (arr[count += 2].doubleValue() % 2 == 0) {
				System.out.println(arr[count].intValue() + 1);
			}

			return arr[count++];
		}

	}

	public static Fifth createFifth() {
		return new Fifth();
	}
}