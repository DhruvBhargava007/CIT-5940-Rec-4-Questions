// Problem 4: Subtree of Another Tree

// Question: Given the roots of two binary trees root and subRoot, return true if there is a subtree of root with the same structure and node values of subRoot and false otherwise
// A subtree of a binary tree tree is a tree that consists of a node in tree and all of this node's descendants. The tree tree could also be considered as a subtree of itself.

// Example:
// Input: root = [1,2,3,4,5], subRoot = [2,4,5]
// Output: true

// Input: root = [1,2,3,4,5,null,null,6], subRoot = [2,4,5]
// Output: false
// (Node 4 has child 6 in root but not in subRoot — subtree must match exactly down to leaves)

// Input: root = [1,2,3], subRoot = [1,2,3]
// Output: true
// (Entire tree equals subRoot — a tree is a subtree of itself)

// Input: root = [1], subRoot = [1]
// Output: true
// (Single node matches single node)

// Input: root = [1,2], subRoot = [1]
// Output: false
// (root has a left child but subRoot doesn't — not an exact subtree match since subtree must include all descendants)

// Input: root = [3,4,5,1,2], subRoot = [4,1]
// Output: false
// (Node 4 in root has children 1 AND 2, but subRoot [4,1] only has left child 1 — must match completely)

// Input: root = [3,4,5,1,2,null,null,null,null,0], subRoot = [4,1,2]
// Output: false
// (Node 2 in root has a left child 0, but in subRoot node 2 is a leaf — extra descendant breaks the match)