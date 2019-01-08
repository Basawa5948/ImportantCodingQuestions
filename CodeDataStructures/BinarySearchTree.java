package DataStructures;

public class BinarySearchTree {

    private BinaryNode root;

    private void addNode(int key, String name){

        BinaryNode binaryNode = new BinaryNode(key,name);
        if(root==null)
            root = binaryNode;
        else {
            BinaryNode node = root;
            BinaryNode parent;
            while (true){
                parent = node;
                if(key< node.key){
                    node = node.leftChild;
                    if(node==null){
                        parent.leftChild = binaryNode;
                        return;
                    }
                }else{
                    node = node.rightChild;
                    if(node==null){
                        parent.rightChild = binaryNode;
                        return;
                    }
                }
            }
        }
    }

    private void inOrderTraversal(BinaryNode binaryNode){
        if(binaryNode!=null){
            inOrderTraversal(binaryNode.leftChild);
            System.out.println(binaryNode);
            inOrderTraversal(binaryNode.rightChild);
        }
    }

    private void preOrderTraversal(BinaryNode binaryNode){
        if(binaryNode!=null){
            System.out.println(binaryNode);
            preOrderTraversal(binaryNode.leftChild);
            preOrderTraversal(binaryNode.rightChild);
        }
    }

    private void postOrderTraversal(BinaryNode binaryNode){
        if(binaryNode!=null){
            postOrderTraversal(binaryNode.leftChild);
            postOrderTraversal(binaryNode.rightChild);
            System.out.println(binaryNode);
        }
    }

    private BinaryNode findNode(int key){

        BinaryNode node = root;
        while (node.key!=key){
                if(key<node.key){
                        node = node.leftChild;
                }else{
                    node = node.rightChild;
                }
                if(node == null)
                    return null;
        }
        return node;
    }

    private boolean deleteNode(int key){

        BinaryNode binaryNode = root;
        BinaryNode parent = root;

        boolean IsAtaLeftChild = true;

        while (binaryNode.key!=key){
            parent = binaryNode;

            if(key< binaryNode.key){
                IsAtaLeftChild = true;
                binaryNode = binaryNode.leftChild;
            }else{
                IsAtaLeftChild = false;
                binaryNode = binaryNode.rightChild;
            }

            if(binaryNode==null)
                return false;
        }

        if(binaryNode.leftChild==null && binaryNode.rightChild==null){
            if(binaryNode == root)
                root = null;
            else if(IsAtaLeftChild)
                binaryNode.leftChild = null;
            else
                binaryNode.rightChild = null;
        }
        else if(binaryNode.rightChild==null){
            if(binaryNode==root)
                root = binaryNode.leftChild;
            else if(IsAtaLeftChild)
                parent.leftChild = binaryNode.leftChild;
            else
                parent.rightChild = binaryNode.leftChild;

        }else if(binaryNode.leftChild==null){
            if(binaryNode == root)
                root = binaryNode.rightChild;
            else if(IsAtaLeftChild)
                parent.leftChild = binaryNode.rightChild;
            else
                parent.rightChild = binaryNode.leftChild;
        }
        else {
            BinaryNode replacement = getReplacementBinaryNode(binaryNode);
            if (binaryNode == root)
                root = replacement;
            else if (IsAtaLeftChild)
                parent.leftChild = replacement;
            else
                parent.rightChild = replacement;

            replacement.leftChild = binaryNode.leftChild;

        }
        return true;
    }

    private BinaryNode getReplacementBinaryNode(BinaryNode replacedBinaryNode) {

        BinaryNode replacementParent = replacedBinaryNode;
        BinaryNode replacement = replacedBinaryNode;
        BinaryNode focusBinaryNode = replacedBinaryNode.rightChild;
        while (focusBinaryNode != null) {
            replacementParent = replacement;
            replacement = focusBinaryNode;
            focusBinaryNode = focusBinaryNode.leftChild;
        }
        if (replacement != replacedBinaryNode.rightChild) {
            replacementParent.leftChild = replacement.rightChild;
            replacement.rightChild = replacedBinaryNode.rightChild;
        }
        return replacement;
    }


    public static void main(String[] args){
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.addNode(230,"Basawa");
        binarySearchTree.addNode(26,"Paramananda");
        binarySearchTree.addNode(46,"Neelamma");
        binarySearchTree.addNode(530,"Jagannath");

        binarySearchTree.inOrderTraversal(binarySearchTree.root);
        System.out.println();
        binarySearchTree.preOrderTraversal(binarySearchTree.root);
        System.out.println();
        binarySearchTree.postOrderTraversal(binarySearchTree.root);
        System.out.println();
        System.out.println(binarySearchTree.findNode(46));

        System.out.println(binarySearchTree.deleteNode(26));
        binarySearchTree.inOrderTraversal(binarySearchTree.root);
    }

}

class BinaryNode{

    int key;
    private String name;

    BinaryNode leftChild;
    BinaryNode rightChild;

    BinaryNode(int key, String name){
        this.key = key;
        this.name = name;
    }

    public String toString(){
        return name+" has a key :"+ key;
    }

}
