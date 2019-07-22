
public class myCollection<E> {
	
	public int size = 0;
	private Object[] elements;
	
	public myCollection() {
		this.elements = new Object[0];
	}
	
	public void add(E e) {
		Object[] tmp = new Object[this.size+1];
		int i = 0;
		for(Object o : this.elements) {
			tmp[i] = o;
			i++;
		}
		tmp[i] = e;
		this.elements = tmp;
		this.size++;
	}
	
	public void remove(E e) {
		Object[] tmp = new Object[this.size-1];
		int i = 0;
		for(Object o: this.elements) {
			if(!o.equals(e))
				tmp[i] = o;
			i++;
		}
		this.elements = tmp;
	}
	
	public void update(int index, E e) {
		this.elements[index] = e;
	}
	
	@SuppressWarnings("unchecked")
	public E get(int i) {
		return (E) this.elements[i];
	}
	
	
}
