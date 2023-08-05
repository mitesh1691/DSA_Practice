package _12_Trie_Tree;

public class trie {
    public trieNode root;

    public trie(){
        root = new trieNode();
        System.out.println("The Trie has been Created");
    }

    public void insert(String word){
        trieNode current = root;
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            trieNode node = current.children.get(ch);
            if(node == null){
                node = new trieNode();
                current.children.put(ch, node);
            }
            current = node;
        }
        current.endOfString = true;
        System.out.println("Successfully inserted " + word + " in Trie");
    }
}
