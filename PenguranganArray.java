package tugasstrukturdata;

public class PenguranganArray {
     static class Node{

              int data;

              Node next = null;

  

              public Node(int data){

                    this.data = data;

              }

  

              public void insert(int data){

                     Node n = this;

                     Node newNode = new Node(data);

   

                     while(n.next != null){

                           n = n.next;

                     }

                     n.next = newNode;

               }

  

               public static void print(Node n){

                      while(n != null){

                            if(n.next == null)

                                 System.out.println(n.data);

                            else

                                 System.out.print(n.data + "->");

                            n = n.next;

                      }

               }

         }


          static Node subtract(Node n1, Node n2, int borrow){


                  if(n1 == null && n2 == null && borrow == 0)

                          return null;

   

                  Node result = new Node(borrow);

                  int value = borrow;

  

                  if(n1.data >= n2.data){

                         value += n1.data - n2.data;

                         borrow = 0;

                  }else{

                         if(n1.next != null){

                               value += (n1.data)+10 - n2.data;

                               borrow = -1;

                         }else{

                               value += (n1.data)+10 - n2.data;

                               value = value*(-1);

                               borrow = 0;

                         }

                   }

                   result.data = value;

                 

                   if(n1.next!=null || n2.next!=null || borrow<0){

                           Node more = subtract(n1.next != null ? n1.next : null,

                                                              n2.next != null ? n2.next : null,

                                                              borrow < 0 ? -1 : 0);

        

                   result.next = more;

            }

            return result;

       }

       public static void main(String... args){

              Node n1 = new Node(7);

              n1.insert(1);

              n1.insert(6);

  

              Node n2 = new Node(5);

              n2.insert(9);

              n2.insert(2);

   

              Node result = subtract(n1, n2, 0);

              Node.print(result); 

       }
}