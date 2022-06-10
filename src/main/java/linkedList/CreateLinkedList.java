package linkedList;

public class CreateLinkedList 
{
	Node head;
	static class Node 
	{
			int val;
			Node next;
			
			Node(int b)
			{
				val=b;
				next= null;
			}
	}

		public static void main(String[] args) 
		{
			
			CreateLinkedList list= new CreateLinkedList();
			list.head= new Node(1);
			Node secNode= new Node(2);
			Node thirdNode= new Node(3);
			list.head.next= secNode;
			secNode.next=thirdNode;
		}


}
