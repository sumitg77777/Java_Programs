package tree;

import java.util.ArrayList;

public class TreeClass<T> {
	public T data;
	public ArrayList<TreeClass <T>> children;
	
	public TreeClass(T data) {
		this.data=data;
		children=new ArrayList<>();	}
	

}
