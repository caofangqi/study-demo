package com.caofangqi.study.tree.bst;

/*
 * 二叉搜索树
 * */
public class MyBinarySearchTree<K extends Comparable, V> {

  // 根节点
  private BSTreeNode root;
  /*
   * 树节点
   * */
  class BSTreeNode {
    final K key;
    V value;
    // 左孩子
    BSTreeNode left;
    // 右孩子
    BSTreeNode right;
    // 父节点
    BSTreeNode parent;

    public BSTreeNode(K key, V value, BSTreeNode parent) {
      this.key = key;
      this.value = value;
      this.parent = parent;
    }
  }

  /*
   * 插入数据
   * */
  public void insert(K key, V value) {
    BSTreeNode treeNode;
    if (key == null) {
      throw new RuntimeException("key 不能为空");
    }
    if (root == null) {
      root = new BSTreeNode(key, value, null);
      return;
    }
    treeNode = root;
    while (treeNode != null) {
      switch (treeNode.key.compareTo(key)) {
        case 0:
          treeNode.value = value;
          return;
        case 1:
          if ((treeNode = treeNode.left) == null) {
            treeNode.left = new BSTreeNode(key, value, treeNode);
            return;
          }
          break;
        case -1:
          if ((treeNode = treeNode.right) == null) {
            treeNode.right = new BSTreeNode(key, value, treeNode);
            return;
          }
          break;
        default:
          throw new RuntimeException("插入数据异常");
      }
    }
  }
}
