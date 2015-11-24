package test2.Tree;

public class BinaryTree {
    // 전위 순회
    public static void preorderPrintTree(Node node) {
        if(node == null)
            return;
         
        // 부모 노드 출력
        System.out.print(" " + node.getData());
         
        // 왼쪽 하위 트리 출력
        preorderPrintTree(node.getLeft());
         
        // 오른쪽 하위 트리 출력
        preorderPrintTree(node.getRight());
    }
     
    // 중위 순회
    public static void inorderPrintTree(Node node) {
        if(node == null)
            return;
         
        // 왼쪽 하위 트리 출력
        inorderPrintTree(node.getLeft());
         
        // 부모 노드 출력
        System.out.print(" " + node.getData());
         
        // 오른쪽 하위 트리 출력
        inorderPrintTree(node.getRight());
    }
     
    // 후위 순회
    public static void postorderPrintTree(Node node) {
        if(node == null)
            return;
         
        // 왼쪽 하위 트리 출력
        postorderPrintTree(node.getLeft());
         
        // 오른쪽 하위 트리 출력
        postorderPrintTree(node.getRight());
         
        // 부모 노드 출력
        System.out.print(" " + node.getData());
    }
}