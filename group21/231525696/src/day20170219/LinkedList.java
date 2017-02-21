package day20170219;

public class LinkedList implements List {
	
	private Node head;
	private Node current;
	private int size;
	
	public void add(Object o){
		
	}
	
	public void add(Object o, int index){
		
	}
	
	public Object get(int index){
		return null;
	}
	
	public Object remove(int index){
		return null;
	}
	
	public int size(){
		return -1;
	}
	
	public void addFirst(Object o){
		
	}
	
	public Object removeFirst(){
		return null;
	}
	
	public Object removeLast(){
		return null;
	}
	
	private static class Node{
		
		private Object data;
		private Node next;
		
		Node(Object data, Node next){
			this.data = data;
			this.next = next;
		}
		
	}
}
