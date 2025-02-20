//import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
//TC: O(N)
//SC: O(1)
class LinkedList { 
  
    Node head; // head of list 
    LinkedList(){
        this.head = null;
    }
  
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    static class Node { 
  
        int data; 
        Node next; 
  
        // Constructor 
        Node(int d) 
        { 
            //Write your code here 
            this.data = d;
            this.next = null;  
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node nn = new Node(data);
        if(list.head==null){
            list.head = nn;
            return list;
        }
        Node temp = list.head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next = nn;
        return list;
        

   
        // If the Linked List is empty, 
        // then make the new node as head 
        
            // Else traverse till the last node 
            // and insert the new_node there 

            // Insert the new_node at last node 
        // Return the list by head 
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
   
            // Print the data at current node 
       
            // Go to next node 
            if(list.head==null) return;
            Node temp = list.head;
            while(temp.next!=null)
            {
                System.out.println(temp.data);
                temp = temp.next;
            }
            System.out.println(temp.data);
    } 
   
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        LinkedList list = new LinkedList(); 
  
        // 
        // ******INSERTION****** 
        // 
  
        // Insert the values 
        list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
  
        // Print the LinkedList 
        printList(list); 
    } 
}