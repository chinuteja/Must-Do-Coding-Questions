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
	
	public static Node insert(Node root,int data) {
		if(root == null) {
			return new Node(data);
		} else {
			if (data <= root.data) {
				root.left = insert(root.left,data);
			}else {
				root.right = insert(root.right,data);
			}
			return root;
		}
	}
	public static int height(Node root) {
		if (root == null)
			return 0;
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		int height = Math.max(leftHeight, rightHeight);
		return height+1;
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
	public static void preOrder(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data +" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	public static void postOrder(Node root) {
		if (root == null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data +" ");
	}
	public static void inOrder(Node root) {
		if(root == null)
			return;
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while (t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        System.out.println("Level Order");
		levelOrder(root);
		System.out.println();
		System.out.println(height(root));
		System.out.println("Preorder");
		preOrder(root);
		System.out.println();
		System.out.println("Post Order");
		postOrder(root);
		System.out.println();
		System.out.println("In Order");
		inOrder(root);
	}	
}