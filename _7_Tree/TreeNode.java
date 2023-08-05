package _7_Tree;
import java.util.ArrayList;

public class TreeNode {
//    two properties of tree data and its children
    String data;
    ArrayList<TreeNode> children;

//    constructor to initialize data and children
    public TreeNode(String data){
        this.data = data;
        this.children = new ArrayList<TreeNode>(); // new arraylist with the type of TreeNode class
    }

//    add child to a node
    public void addChild(TreeNode node){
        this.children.add(node);
    }

    // printing the tree node
    public String printNode(int level){
        String ret;
        ret = "  ".repeat(level) + data + "\n"; // repeat repeats the string specified number of times, for level 0 it will not repeat. for level 1 it will repeate string + 1 time which means "__" + "__" = "____". for level 2 - "__" + "__" + "__" = "______"
        for (TreeNode node: this.children){
            ret += node.printNode(level+1); // increment level by 1
        }
        return ret;
    }


    public static void main(String[] args) {
        TreeNode drinks = new TreeNode("Drinks");
        TreeNode hot = new TreeNode("Hot");
        TreeNode cold = new TreeNode("Cold");
        TreeNode tea = new TreeNode("Tea");
        TreeNode coffee = new TreeNode("Coffee");
        TreeNode beer = new TreeNode("Beer");
        TreeNode wine = new TreeNode("Wine");

        drinks.addChild(hot);
        drinks.addChild(cold);

        hot.addChild(tea);
        hot.addChild(coffee);

        cold.addChild(wine);
        cold.addChild(beer);

        System.out.println(drinks.printNode(0));
    }
}
