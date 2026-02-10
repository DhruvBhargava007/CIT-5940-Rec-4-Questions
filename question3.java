// Problem 3: Inorder Traversal

// Question: Given the root of a binary tree, return the inorder traversal of its values.
// Inorder visits: left subtree → current node → right subtree.
// For a BST, this produces sorted output!

// Example:

// Input: root = [1,null,2,3]
// Output: [1,3,2]

// Inorder: go left (nothing), visit 1, go right to 2,
// go left to 3, visit 3, visit 2.

// Input: root = []
// Output: []
// (Empty tree)

// Input: root = [1]
// Output: [1]
// (Single node)

// Input: root = [1,2,3,4,5,null,6]
// Output: [4,2,5,1,3,6]

// Input: root = [3,null,2,null,1]
// Output: [3,2,1]
// (Right-skewed tree, like a linked list)

// Input: root = [3,2,null,1,null]
// Output: [1,2,3]
// (Left-skewed tree — result is sorted descending input but ascending output)

// Input: root = [5,3,7,2,4,6,8]
// Output: [2,3,4,5,6,7,8]
// (Balanced BST — inorder gives perfectly sorted output)

// Hint: Inorder on a BST = sorted order. This is a very common pattern!
