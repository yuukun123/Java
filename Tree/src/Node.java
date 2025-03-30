import java.util.Scanner;

public class Node {
    private TreeNode rootNode;

    public Node() {
        this.rootNode = null;
    }

    public TreeNode getRoot(TreeNode root, int data) {
        if(root == null) {
            root = new TreeNode(data);
        }

        else if(data < root.data) {
            if(root.left == null) {
                root.left = new TreeNode(data);
            }
            else {
                root.left = getRoot(root.left,data);
            }
        }

        else if(data > root.data) {
            if(root.right == null) {
                root.right = new TreeNode(data);
            }
            else {
                root.right = getRoot(root.right,data);
            }
        }
        return root;
    }

    public void setRoot(Scanner sc, int n) {
        for(int i = 0; i < n; i++) {
            int data = sc.nextInt();
            rootNode = getRoot(rootNode,data);
        }
    }

    public void NLR() {
        NLR(rootNode);
    }

    private void NLR(TreeNode root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data + " ");
        NLR(root.left);
        NLR(root.right);
    }

    public void LNR() {
        LNR(rootNode);
    }

    private void LNR(TreeNode root) {
        if(root == null) {
            return;
        }
        LNR(root.left);
        System.out.print(root.data + " ");
        LNR(root.right);
    }

    public void LRN() {
        LRN(rootNode);
    }

    private void LRN(TreeNode root) {
        if(root == null) {
            return;
        }
        LRN(root.left);
        LRN(root.right);
        System.out.print(root.data + " ");
    }

    // find right mode node
    private TreeNode search_max(TreeNode root) {
        while (root.right != null) {
            root = root.right;
        }
        return root;
    }

    // xoa node key trong cay
    // tra ve cay moi sau khi xoa
    public void delete(int data) {
        rootNode = delete(rootNode, data);
    }

    // xoa node
    public TreeNode delete(TreeNode root, int data) {
        if (root == null) {
            return null;
        }

        // step 1 find the node have value to be deleted
        if (data < root.data) {
            root.left = delete(root.left, data);
        }

        else if(data > root.data) {
            root.right = delete(root.right, data);
        }

        // step 2 delete the node
        else{
            // case 1 node is leaf
            if(root.left == null && root.right == null) {
                return null;
            }
            // case 2 node have only 1 child
            if(root.left != null ) {
                return root.left;
            }
            else if(root.right != null ) {
                return root.right;
            }
            // case 3 node have 2 children
            TreeNode temp = search_max(root.left);

            // Replace root's data with predecessor's data
            root.data = temp.data;

            // Delete the in-order predecessor
            root.left = delete(root.left, temp.data);
        }
        return root;
    }
}
