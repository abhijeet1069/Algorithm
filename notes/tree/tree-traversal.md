# Tree traversal

## DFS

DFS(Depth First Search) on a tree is simply a traversal where you go as
deep as possible along one branch before backtracking.

Unlike graphs, trees don't require a visited array as there are no cycles

Every node is visited exactly once.

Time: O(n)
Space: O(h) due to the recursion stack, where h is the tree height.
Balanced tree: O(log n)
Skewed tree: O(n)

The three DFS travels are:

### Preorder (Root → Left → Right)

Visit the node before its children.

```java
void preorder(TreeNode root) {
    if (root == null)
        return;

    System.out.print(root.val + " ");
    preorder(root.left);
    preorder(root.right);
}

        1
      /   \
     2     3
    / \   / \
   4   5 6   7
   
Pre-order : 1 2 4 5 3 6 7
```

### Inorder (Left → Root → Right)

Visit the node between its left and right subtree.

```java
void inorder(TreeNode root) {
    if (root == null)
        return;

    inorder(root.left);
    System.out.print(root.val + " ");
    inorder(root.right);
}

        1
      /   \
     2     3
    / \   / \
   4   5 6   7
   
Pre-order : 4 2 5 1 6 3 7
```

### Postorder (Left → Right → Root)

Visit the node after both children.

```java
void postorder(TreeNode root) {
    if (root == null)
        return;

    postorder(root.left);
    postorder(root.right);
    System.out.print(root.val + " ");
}

        1
      /   \
     2     3
    / \   / \
   4   5 6   7
   
Pre-order : 4 5 2 6 7 3 1
```

### Iterative DFS

```java
void dfs(TreeNode root) {
    if (root == null)
        return;

    Stack<TreeNode> stack = new Stack<>();
    stack.push(root);

    while (!stack.isEmpty()) {
        TreeNode curr = stack.pop();

        System.out.print(curr.val + " ");

        if (curr.right != null)
            stack.push(curr.right);

        if (curr.left != null)
            stack.push(curr.left);
    }
}
```

## BFS (Breadth first Search)

A queue stores the nodes that we need to visit next, in the order they were discovered.

```java
void bfs(TreeNode root) {
    if (root == null)
        return;

    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);

    while (!queue.isEmpty()) {

        TreeNode curr = queue.poll();

        System.out.print(curr.val + " ");

        if (curr.left != null)
            queue.offer(curr.left);

        if (curr.right != null)
            queue.offer(curr.right);
    }
}
```
