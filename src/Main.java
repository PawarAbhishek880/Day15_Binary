public class Main {
    /*
     * main method all program execute in main method
     */
    public static void main(String[] args) {

        /*
         * 1st print the welcome msg.
         */
        System.out.println("welcome to the program");

        /*
         * create object for BinaryTree
         * object name as bst
         * create object coz in this class all method is non static so we cannot directly call this method
         * so we create object for this class
         * if all methods are static then call this method directly
         *
         */

        BinaryTree bst = new BinaryTree();
        /*
         * root is empty
         */
        Node root = null;

        /*
         * inserting the value in root
         *
         * calling method is =object name.method name
         *
         * hear bst is object and insert is method and 56 is value is adding in root
         */
        root = bst.insert(root, 56);

        root = bst.insert(root, 30);

        // 30->56->70->80
        root = bst.insert(root, 70);

        root = bst.insert(root, 22);
        root = bst.insert(root, 40);
        root = bst.insert(root, 60);
        root = bst.insert(root, 95);
        root = bst.insert(root, 11);
        root = bst.insert(root, 65);
        root = bst.insert(root, 3);
        root = bst.insert(root, 6);
        root = bst.insert(root, 63);
        root = bst.insert(root, 67);

        bst.print(root);

        /*
         * if condition is true then 1st print o/p is boolean type coz this is boolean method
         */

        System.out.println(bst.nodePresent(root, 63));

        /*
         * if else statement is used if condition is true then print 63 is present is binary tree
         * if condition false then print 63 is not present in binary tree.
         */

        if(root != null)
            System.out.println("\nElement 63 is present in the binary tree");
        else
            System.out.println("\nElement 63 is not present in the binary tree");
    }
}
