### Trees - are hierarchical data structures.

* Binary tree-A tree whose elements have at most 2 children
* Binary Tree Properties:
```
1. The maximum number of nodes at level ‘l’ of a binary tree is 2^(l-1).
2. Maximum number of nodes in a binary tree of height ‘h’ is 2^(h) – 1.
```
### Tree traversals:
1. Depth First Traversal: Space complexity-O(h) where h is height of the tree
- inorder
- preorder
- postorder
2. Breadth First Traversal: Space complexity - O(w) where w is width of the tree
- level order traversal
 ```
 Time complexity for all the above traversal-o(n)
```
### Types of binary trees :
* rooted binary tree - every node has at most 2 children
* full(strict) binary tree - every node has either 0 or 2 children
  - In a Full Binary, number of leaf nodes is number of internal nodes plus 1
  - L = I + 1
  - Where L = Number of leaf nodes, I = Number of internal nodes
* perfect binary tree - all interior nodes have 2 children and all leaves have same depth/level.
  - A Perfect Binary Tree of height h has 2^(h) – 1 node.
* balanced binary tree 
  - A binary tree is balanced if the height of the tree is O(Log n) where n is the number of nodes

### Enumeration of binary tree:
* no of unlabeled trees - (2n)!/(n+1)!n!
* no of labeled trees - no of unlabeled trees * n! 

### Binary Search Trees :
* A binary tree will be a binary search tree if:
```
The left subtree of a node contains only nodes with keys less than the node’s key.
The right subtree of a node contains only nodes with keys greater than the node’s key.
The left and right subtree each must also be a binary search tree.
There must be no duplicate nodes.
```
