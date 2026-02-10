// Problem 4: Sorted Array to BST

// Question: Given an integer array nums sorted in ascending order, convert it to a height-balanced BST.
// A height-balanced BST is one where the depth of the two subtrees of every node never differs by more than one.

// Example:

// Input: nums = [-10,-3,0,5,9]
// Output: [0,-3,9,-10,null,5]

// Pick middle element as root to ensure balance.

// Input: nums = [1,3]
// Output: [3,1] or [1,null,3]
// (Two elements — either can be root, depends on mid calculation)

// Input: nums = [0]
// Output: [0]
// (Single element)

// Input: nums = [1,2,3,4,5,6,7]
// Output: [4,2,6,1,3,5,7]
// (Perfect binary tree, height = 2)

// Input: nums = [-5,-3,-1,0,1,3,5]
// Output: [0,-3,3,-5,-1,1,5]
// (Symmetric around 0)

// Input: nums = [1,2,3]
// Output: [2,1,3]
// (Smallest case that produces a full tree)

// Input: nums = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15]
// Output: balanced BST with height 3
// (Power of 2 minus 1 — always produces a perfect tree)

// Hint: Think divide and conquer — pick the middle, recurse on halves.
