package tugasstrukturdata;

public class PerkalianArray {
    static class node

{

    int data;

    node next;

};



static node newNode(int data)

{

    node new_node = new node();

    new_node.data = data;

    new_node.next = null;

    return new_node;

}



static node push( node head_ref, int new_data)

{ 

    node new_node = newNode(new_data);



    new_node.next = (head_ref);



    (head_ref) = new_node;

    return head_ref;

}



static long multiplyTwoLists ( node first, node second)

{

    int num1 = 0, num2 = 0;

   

    while (first != null || second != null)

    {

        if (first != null)

        {

            num1 = num1*10 + first.data;

            first = first.next;

        }

        if (second != null)

        {

            num2 = num2*10 + second.data;

            second = second.next;

        }

    }



    return num1*num2;

}



static void printList( node node)

{

    while(node != null)

    {

        System.out.printf("%d", node.data);

        if(node.next != null)

            System.out.printf("->");

        node = node.next;

    }

    System.out.printf("\n");

}



public static void main(String args[])

{

    node first = null;

    node second = null;



    first = push(first, 6);

    first = push(first, 4);

    first = push(first, 9);

    System.out.printf("First List is: ");

    printList(first);



    second = push(second, 4);

    second = push(second, 8);

    System.out.printf("Second List is: ");

    printList(second);



    System.out.printf("Result is: ");

    System.out.println(multiplyTwoLists(first, second));

}
}
