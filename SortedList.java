import java.util.Iterator;
//download example iterated list
//put that and abstrract class in main. 
//second file makes list file

public class SortedList < E extends Comparable < ? super E >> extends List < E > {
    
    public Iterator < E > iterator() {
        return new Iterator < E > () {
            public boolean hasNext() {
                return curr != null;
            }
            public E next() {
                E temp = curr.data;
                curr = curr.next;
                return temp;
            }
            private Node < E > curr = head;
        };
    }
    public void insert(E data){
        Node<E> temp = new Node<E>(data); //temp is the node with new fata
        head  = insert(head,temp);
    }

        private Node<E> insert(Node<E> curr, Node<E> temp){
            if (curr == null){
                return temp; //this is an empty list.  
            }
            else if(temp.data.compareTo(curr.data)<0){ //this is when I want to add an element into the first space.
                temp.next = curr;
                return temp;
            }
            else{
                
                curr.next = insert(curr.next,temp);
                return curr;
            }

        }
            
            
            //return insert(curr.next,temp);



    public boolean search(E data) {
        return search(head,data);

    }
        private boolean search (Node<E> curr, E data){
            //which lists are simple, obvious, or by definition simple 
            //simple lists = EMPTY lists --> if curr is null. 
            if (curr == null){ //basecase 1
                return false;
            }

            if (data.compareTo(curr.data) == 0){ //base case 2 - current note data item = data item, 0 means they are the same. 
                return true;
            }

            return search(curr.next,data);

    
        }
    public void remove(E data) { 
        Node<E> temp = new Node<E>(data); //temp is the node with new data
        
        E val = temp.data;
        
        remove(head,val);
    }
    private Node<E> remove(Node<E> curr, E val){
 
            if (curr.next == null){
                return curr;
            }
            else if(val.compareTo(curr.data) == 0){ //if the first node matches the remove element.
                head = curr.next;
                return curr.next;
            }
        
        
            else if (val.compareTo(curr.next.data) == 0 ){ //next item 
                if (curr.next.next != null){
                    curr.next = curr.next.next;
                    
                }
                else{
                    curr.next = null;
                }
                return curr.next;
            }

            else{
                curr = remove(curr.next,val);
                return curr;
            }


            //return null;

            

            }
            
        

 
               






    public E retrieve(int index){
        int counter = 0;
        return retrieve(head,index,counter);
    }

    private E retrieve(Node <E> curr, int index, int counter){
        if (index <0 || curr == null){
            return null;
        }
        if (counter == index){
            return curr.data;
        }
        counter +=1;
        return retrieve(curr.next,index,counter);
        //return null;
    }
}

    


 
    














