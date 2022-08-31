import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q1991_이민아 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		char[][] tree = new char[N][2];
		
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String node_s = st.nextToken();
			char node_c = node_s.charAt(0);
			int node_i = (int)node_c - 65;
			
			String left_s = st.nextToken();
			char left_c = left_s.charAt(0);
			tree[node_i][0] = left_c;
			
			String right_s = st.nextToken();
			char right_c = right_s.charAt(0);
			tree[node_i][1] = right_c;
			
		}
		
		preorder(tree,'A');
		System.out.println();
		inorder(tree,'A');
		System.out.println();
		postorder(tree,'A');
		
		
		
		

	}
	
	public static void preorder(char[][] tree, char current) {
		System.out.print(current);
		int node = (int)current-65;
		char node_left = tree[node][0];
		if(node_left != '.') {
			preorder(tree,node_left);
		}
		char node_right = tree[node][1];
		if(node_right != '.') {
			preorder(tree,node_right);
		}
	}

	public static void inorder(char[][] tree, char current) {
		int node = (int)current-65;
		char node_left = tree[node][0];
		if(node_left != '.') {
			inorder(tree,node_left);
		}
		System.out.print(current);
		char node_right = tree[node][1];
		if(node_right != '.') {
			inorder(tree,node_right);
		}
	}
	
	public static void postorder(char[][] tree, char current) {
		int node = (int)current-65;
		char node_left = tree[node][0];
		if(node_left != '.') {
			postorder(tree,node_left);
		}
		char node_right = tree[node][1];
		if(node_right != '.') {
			postorder(tree,node_right);
		}
		System.out.print(current);
	}
}
