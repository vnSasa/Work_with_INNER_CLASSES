package ua.yaremechko.lesson17;

import ua.yaremechko.lesson17.Collection.Forward;

public class AppIterator {
	public static void main(String[] args) {
		Integer[] array = { 1, 43, -2, 34, 9, 17, -82, 1, 6, 55 };

		Collection collection = new Collection(array);

		Forward iteratorForward = collection.createForward();

		while (iteratorForward.hasNext()) {
			System.out.println(iteratorForward.next());
		}
		System.out.println();
		
		Iterator iterBackward = collection.createBackward();
		
		while(iterBackward.hasNext()) {
			System.out.println(iterBackward.next());
		}
	}

}
