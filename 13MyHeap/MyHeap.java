import java.util.*;

public class MyHeap{
   	private int[] values;
	private boolean isMax;
    
 
     
     public MyHeap(boolean isMax1){
         values = new int[50];
         values[0] = 0;
         isMax = isMax1;   
    	 }
         
	 	MyHeap() {
			MyHeap(true);        
        
	    }
    public String toString(){
        String final1 = "";
        for (int i = 0; i < values[0]; i++){
            final1 += values[i] + " ";
            
            
        }
        return final1;
        
        
    }
    
    public int GetLeftValue(int value){
        return value * 2;
        
    }
    
    public int GetRightValue(int value){
        return (value * 2) +1;
        
    }
    
    public int GetParentValue(int value){
       return value/2; 
        
    }
    
    public boolean CompareNodes(int index1, int index2){
        if (isMax){
            return values[index1] > values[index2];
        }
        return values[index1] < values[index2];
        
    }
    
    public static void main(String[] args){
        MyHeap heap1 = new MyHeap();
        heap1.add(3);
        heap1.add(5);
        heap1.add(6);
        heap1.add(10);
        System.out.println(heap1);  
        heap1.add(12);
        heap1.add(1);
        
        
        
        
        
    }
    
    public void resize(){
        if (values[0] == values.length -1){
        values = Arrays.copyOf(values, values[0] * 2);
        } else if (values[0] < values.length/2){
            values = Arrays.copyOf(values, values.length / 2)
            
        }
        
    }
        
        
    public String name(){
        return "lanier.benjamin";
    }

    public int remove() {
        
        if (heap[0] == 0){
            throw new NoSuchElementException();
            
        }
        int TemporaryStorage = values[1];
        values[1] = values[values[0]];
        values[0] = values[0] - 1;
        MoveValueDown(1);    
        return TemporaryStorage;
        
    }
    
    public MoveValueDown(int index){
        
        
        
        
    }




public void add(int) -> add the int to the heap  O(logn)
    if (isMax){
        
    } else {
        
        
    }
}



public void add(int) -> add the int to the heap  O(logn)
    if (isMax){
        
    } else {
        
        
    }
}

   public int peek(){
       if (values[0] == 0){
           throw new NoSuchElementException();
       }
         return heap[1];
         
}

}