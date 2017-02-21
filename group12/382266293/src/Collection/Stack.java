package Collection;


public class Stack<E> extends AbstractList<E> {
	
	private ArrayList<E> myArr;

	public Stack() {
		this.myArr = new ArrayList<E>();
	}

	public void push(E e){
		myArr.add(e);
	}
	
	public E pop(){
		return myArr.removeLast();
	}
	
	public E peek(){
		return myArr.get(size()-1);
	}

	public int size(){
		return myArr.size();
	}

	@Override
	public void add(E e) {
		push(e);
	}

	@Override
	public E get(int index) {
		return myArr.get(index);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((myArr == null) ? 0 : myArr.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stack other = (Stack) obj;
		if (myArr == null) {
			if (other.myArr != null)
				return false;
		} else if (!myArr.equals(other.myArr))
			return false;
		return true;
	}
	
}
