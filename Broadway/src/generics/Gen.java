package generics;

// <> sign indicates that class is generic type 
public class Gen<T> {
	T obj;

	Gen(T o) {
		obj = o;
	}

	public T getObj() {
		return obj;
	}
}
