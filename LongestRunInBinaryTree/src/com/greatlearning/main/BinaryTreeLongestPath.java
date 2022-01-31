package com.greatlearning.main;

import java.util.ArrayList;
import java.util.Collections;

class TreeNode{
	int data;
	TreeNode left;
	TreeNode right;
	public TreeNode(int data) {
		// TODO Auto-generated constructor stub
		this.data= data;
	}
}
class TreeNodeOperation{
	
	public static ArrayList<Integer> findlongestPathofTree(TreeNode node){
		ArrayList<Integer> al=null;
		if(node==null) {
			al = new ArrayList<>();
			return al;
		}
		ArrayList<Integer> leftNode=findlongestPathofTree(node.left);
		
		ArrayList<Integer> rightNode=findlongestPathofTree(node.right);
		

		if(leftNode.size()>rightNode.size()) {
			leftNode.add(node.data);
		}
		else {
			rightNode.add(node.data);
		}
		if(leftNode.size()>rightNode.size()) {
			return leftNode;
		}
		else {
			return rightNode;
		}

	}
	
}
public class BinaryTreeLongestPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode rootNode=new TreeNode(100);
		TreeNode node20=new TreeNode(20);
		TreeNode node130=new TreeNode(130);
		TreeNode node10=new TreeNode(10);
		TreeNode node50=new TreeNode(50);
		TreeNode node5=new TreeNode(5);
		TreeNode node110=new TreeNode(110);
		TreeNode node140=new TreeNode(140);
		
		rootNode.left=node20;
		rootNode.right=node130;
		
		node20.left=node10;
		node20.right=node50;
		
		node10.left=node5;
		
		node130.left=node110;
		node130.right=node140;
		
		
		
		System.out.println("Longest Path of Tree is ");
		ArrayList<Integer> output=TreeNodeOperation.findlongestPathofTree(rootNode);
		  Collections.reverse(output);  
		int size=output.size();
		if(size==0) {
			System.out.println("node is Empty");
			
		}
		else
		{
			for(int i=0;i<size;i++) {
				System.out.print(output.get(i)+" ");
			}
		}
	}

}
