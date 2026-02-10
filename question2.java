// Problem 2: Validate BST

// Question: Given the root of a binary tree, determine if it is a valid BST.
// A valid BST means: left subtree contains only nodes with keys < node's key, right subtree only nodes with keys > node's key, and both subtrees are also valid BSTs.

// Example:

// Input: root = [2,1,3]
// Output: true

// Input: root = [5,1,4,null,null,3,6]
// Output: false
// (4 is right child of 5 but 4 < 5)

// Input: root = [1]
// Output: true
// (Single node is always valid)

// Input: root = [5,4,6,null,null,3,7]
// Output: false
// (3 is in right subtree of 5 but 3 < 5 — catches the "only check parent" mistake)

// Input: root = [2,2,2]
// Output: false
// (Duplicates are not allowed in a strict BST)

// Input: root = [Integer.MIN_VALUE]
// Output: true
// (Edge case with extreme values — tests if you used int vs long for bounds)

// Input: root = [3,1,5,0,2,4,6]
// Output: true
// (Full balanced valid BST)

// Input: root = [10,5,15,null,null,6,20]
// Output: false
// (6 is in right subtree of 10 but 6 < 10)

// Hint: Don't just check immediate children — pass down a valid (min, max) range!
