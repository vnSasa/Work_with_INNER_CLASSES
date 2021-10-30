package ua.yaremechko.inner.classes;

import ua.yaremechko.inner.classes.Collection.First;
import ua.yaremechko.inner.classes.Collection.Seccond;

public class Application {

	public static void main(String[] args) {
		Number [] arrayFirst = {7, 43, -2, 34, 8, 17, -81, 1, 6, 54};
		Number [] arraySeccond = {7, 43, -2, 34, 8, 17, -81, 1, 6, 54};
		Number [] arrayThird = {7, 43, -2, 34, 8, 17, -81, 1, 6, 54};
		Number [] arrayFouth = {7, 43, -2, 34, 8, 17, -81, 1, 6, 54};
		Number [] arrayFifth = {7, 43, -2, 34, 8, 17, -81, 1, 6, 54};
				
//		FIRST TASK
		System.out.println("FIRST TASK");
		
		Collection collection = new Collection(arrayFirst);
		
		First createFirst = collection.createFirst();
		
		while(createFirst.hasNext()) {
			System.out.println(createFirst.next());
		}
		
		System.out.println();
		
//		SECCOND TASK
		
		System.out.println("SECCOND TASK");
		
		Collection collectionSeccond = new Collection(arraySeccond);
		
		Seccond createSeccond = collectionSeccond.createSeccond();
		
		while(createSeccond.hasNext()) {
			System.out.println(createSeccond.next());
		}
		
		System.out.println();
		
//		THIRD TASK
		
		System.out.println("THIRD TASK");
		
		Collection collectionThird = new Collection(arrayThird);
		
		Iterator createThird = collectionThird.createThird();
		
		while(createThird.hasNext()) {
			createThird.next();
		}
		
		System.out.println();
		
//		FOURTH TASK
		
		System.out.println("FOURTH TASK");
		
		Collection collectionFouth = new Collection(arrayFouth);
		
		Iterator createFouth = collectionFouth.createFourth();
		
		while(createFouth.hasNext()) {
			createFouth.next();
		}
		
		System.out.println();
		
//		FIFTH TASK
		
		System.out.println("FIFTH TASK");
		
		Collection collectionFifth = new Collection(arrayFifth);
		
		Iterator createFifth = collectionFifth.createFifth();
		
		while(createFifth.hasNext()) {
			createFifth.next();
		}
	}
}
