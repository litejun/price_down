package test2.Tree;

public class Test_BinaryTree {
    public static void main(String[] args) {
        // ��� ����
        Node A = new Node('A');
        Node B = new Node('B');
        Node C = new Node('C');
        Node D = new Node('D');
        Node E = new Node('E');
        Node F = new Node('F');
        Node G = new Node('G');
         
        // Ʈ���� ��� �߰�
        A.setLeft(B);
        B.setLeft(C);
        B.setRight(D);
         
        A.setRight(E);
        E.setLeft(F);
        E.setRight(G);
         
         
        // ���
        System.out.println("Preorder...");
        BinaryTree.preorderPrintTree(A);
        System.out.println("\n");
 
        System.out.println("Inorder...");
        BinaryTree.inorderPrintTree(A);
        System.out.println("\n");
         
        System.out.println("Postorder...");
        BinaryTree.postorderPrintTree(A);
    }
}