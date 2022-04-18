import java.util.Scanner;

class node {
        int data;
        node next;
        public node(int d) {
            this.data = d;
        }
    }
class linked_list
{
    node head;
    public node  create(int data)
    {
        node n0 = new node(data);
        if(head == null)
        {
            head = n0;
        }
        else
        {
        node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }

        temp.next = n0;
        }

        return head;

    }
    public void insert(node hed, int pos, int data)
    {
        //create an orphan node(an object which is defined under the node class and has next = null
        //as it's not pointing to any other node
        node n1 = new node(data);
        node temp = hed;
        int i=0;
        while(i<pos)
        {
            temp= temp.next;
            i++;
        }
        System.out.println(i);
        node prev = temp;
        n1.next = prev.next;
        prev.next = n1;


    }
    public void display()
    {
        node temp = head;
        while(temp.next!= null)
        {
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

}

public class Main
{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      linked_list ll = new linked_list();
      System.out.println("Enter the size of the list");
      int size = sc.nextInt();
        System.out.println("Enter the values");
      int value = 0;
      node x = null;
      for(int i =0; i< size; i++)
      {
          value = sc.nextInt();
          x= ll.create(value);
          ll.display();
      }
      //System.out.println("insert the value at the postion");
        System.out.println(x);
      ll.insert(x, 4, 18);
      ll.display();

    }
}
