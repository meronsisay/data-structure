package package2;

public class stack{
		   int[] array;

	       int top;
	       int size;
	       stack(int capacity){
	    	 top=-1;
	    	 size=0;
	    	 array=new int[capacity];
	       }
	      public int size() {
	   		return size;
	       }
	       public boolean isEmpty() {
	    	 return size==0;
	      }
	      public boolean isFull() {
	    	  return size==array.length;
	      }
	      public void push(int value) {
	    	  if(!isFull()) {
	    		array[++top]= value;
	    		size++;
	    	  }
	      } public int pop() {
	    	  if(!isEmpty()){
	    		  int data=array[top--];
	    		  size--;
	    		return data;
	    	  }return -1;
	      } public void show() {
	    	  for(int i=0;i<size;i++) {
	    		 System.out.println(array[i]); 
	    	  }
	      }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
