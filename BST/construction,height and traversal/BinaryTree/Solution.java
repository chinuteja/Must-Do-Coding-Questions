import java.util.*;
class Node {
	Node left;
	Node right;
	int data;

	Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}
public class Solution {
	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			Queue<Node> queue = new LinkedList();
			queue.add(root);
			// System.out.println("root "+root.data);
			// System.out.println(queue);
			while (!queue.isEmpty()) {
				Node node = queue.poll();
				// System.out.println("node "+node.data);
				//If node has both left and right child, add both the child to queue
				if (node.left != null && node.right != null) {
					queue.add(node.left);
					queue.add(node.right);
				} else {
					//If node has no left child, make newNode as left child
					if (node.left == null) {
						node.left = new Node(data);
						queue.add(node.left);
					}
					//If node has left child but no right child, make newNode as right child
					else {
						node.right = new Node(data);
						queue.add(node.right);
					}
					break;

				}
				
			}
		}
		return root;
	}
	public static void levelOrder(Node root) {
		if(root == null)
			return ;
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()){
			root = queue.poll();
			System.out.print(root.data +" ");
			if(root.left != null) 
				queue.add(root.left);
			if(root.right != null)
				queue.add(root.right);
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		Node root = null;
		while (t-- > 0) {
			int data = scan.nextInt();
			root = insert(root, data);
		}
		levelOrder(root);
	}
}
