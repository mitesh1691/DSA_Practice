package _12_Trie_Tree;
import java.util.HashMap;
import java.util.Map;

public class trieNode {
    Map<Character, trieNode> children;
    public boolean endOfString;

    public trieNode(){
        children = new HashMap<>();
        endOfString = false;
    }
}
