// Problem 5: Preorder Traversal

// Question: Given the root of a binary tree, return the preorder traversal of its values.
// Preorder visits: current node → left subtree → right subtree.
// Useful for serializing/copying trees and creating prefix expressions.

// Example:

// Input: root = [1,2,3,4,5,null,6]
// Output: [1,2,4,5,3,6]

// Visit 1, go left: visit 2, go left: visit 4, back,
// go right: visit 5, back to 1, go right: visit 3,
// go right: visit 6.


// Input: root = [3,1,2]
// Output: [3,1,2]
// (Root first, then left, then right)

// Input: root = [1,null,2,null,3,null,4]
// Output: [1,2,3,4]
// (Right-skewed — preorder same as top-down traversal)

// Input: root = [4,3,null,2,null,1,null]
// Output: [4,3,2,1]
// (Left-skewed — preorder same as top-down traversal)

// Input: root = [5,3,7,2,4,6,8]
// Output: [5,3,2,4,7,6,8]
// (Balanced BST — note it does NOT produce sorted output unlike inorder)

// Input: root = [1,2,3,4,5,6,7]
// Output: [1,2,4,5,3,6,7]
// (Perfect tree — visits entire left subtree before any right subtree node)

// Input: root = [-1,0,-2]
// Output: [-1,0,-2]
// (Negative values)

// Hint: Root is always first. Think: visit, then recurse left, then recurse right.
