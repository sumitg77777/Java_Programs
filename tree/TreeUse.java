package tree;

import java.util.Scanner;

import javax.swing.tree.TreeNode;

public class TreeUse {
	
	public static TreeClass<Integer> takeInput(){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("enter the first class");
		
		TreeClass<Integer> root=new TreeClass<Integer>(n);
		System.out.println("Enter the child"+n);
		int childcount=0;
		for(int i=0;i<childcount;i++) {
			TreeClass<Integer> child=takeInput();
			root.children.add(child);
				
		}	
	return root;
	}
	
	public static void main (String[]args) {
		Scanner sc=new Scanner(System.in);
		TreeClass<Integer> root=takeInput();
	//	print(root);
	
		
//		TreeClass <Integer> root=new TreeClass<>(4);
//		TreeClass<Integer>class1=new TreeClass<Integer>(2);
//		TreeClass<Integer>class2=new TreeClass<Integer>(3);
//		TreeClass<Integer>class3=new TreeClass<Integer>(5);
//		TreeClass<Integer>class4=new TreeClass<Integer>(6);
//		
//		
//		root.children.add(class2);
//		root.children.add(class3);
//		class2.children.add(class4);
//		System.out.println(root);
	}

}
