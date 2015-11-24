package test2.Tree;

public class BinaryTree {
    // ���� ��ȸ
    public static void preorderPrintTree(Node node) {
        if(node == null)
            return;
         
        // �θ� ��� ���
        System.out.print(" " + node.getData());
         
        // ���� ���� Ʈ�� ���
        preorderPrintTree(node.getLeft());
         
        // ������ ���� Ʈ�� ���
        preorderPrintTree(node.getRight());
    }
     
    // ���� ��ȸ
    public static void inorderPrintTree(Node node) {
        if(node == null)
            return;
         
        // ���� ���� Ʈ�� ���
        inorderPrintTree(node.getLeft());
         
        // �θ� ��� ���
        System.out.print(" " + node.getData());
         
        // ������ ���� Ʈ�� ���
        inorderPrintTree(node.getRight());
    }
     
    // ���� ��ȸ
    public static void postorderPrintTree(Node node) {
        if(node == null)
            return;
         
        // ���� ���� Ʈ�� ���
        postorderPrintTree(node.getLeft());
         
        // ������ ���� Ʈ�� ���
        postorderPrintTree(node.getRight());
         
        // �θ� ��� ���
        System.out.print(" " + node.getData());
    }
}