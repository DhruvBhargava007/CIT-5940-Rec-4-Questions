// Problem 1: Search in a BST

// Question: Given the root of a BST and an integer val, find the node whose value equals val and return the subtree rooted at that node. If the node does not exist, return null.

// Example:

// Input: root = [4,2,7,1,3], val = 2
// Output: [2,1,3]

// The node with value 2 is found, so we return that entire subtree.

// Input: root = [4,2,7,1,3], val = 5
// Output: null
// (Value doesn't exist in tree)

// Input: root = [1], val = 1
// Output: [1]
// (Single node tree, target is root)

// Input: root = [], val = 5
// Output: null
// (Empty tree)

// Input: root = [5,3,8,1,4,7,9], val = 9
// Output: [9]
// (Target is a leaf, rightmost path)

// Input: root = [2,1,3], val = 1
// Output: [1]
// (Target is a leaf with no subtree)

// Hint: Use the BST property to eliminate half the tree at each step.
