package binaryTree

/**
 * This is the preorder traverse of binary tree
 * @param root - root of TreeNode
 * @see TreeNode - node has reference on left and right child
 */


fun preorderTraverse(root: TreeNode?, traverse: MutableList<Int>) {
    root ?: return

    traverse.add(root.value)
    preorderTraverse(root.left, traverse)
    preorderTraverse(root.right, traverse)
}