class Solution {
    private class Trie{
        Trie[] children = new Trie[26] ;
        String word;
    }
    public Trie buildTrie(String[] words){
        Trie root = new Trie();
        for (String word : words){
            Trie node = root;
            for (char ch: word.toCharArray()){
                int idx = ch - 'a';
                if (node.children[idx] == null){
                    node.children[idx] = new Trie();
                }
                node = node.children[idx];
            }
            node.word = word;
        }
        return root;
    }
    public List<String> findWords(char[][] board, String[] words) {
        List<String> result = new ArrayList<>();
        if (board == null || words == null ||words.length == 0 ||board.length == 0 || board[0].length == 0 ) return result;
        int n = board.length;
        int m = board[0].length;

        boolean vis[][] = new boolean[n][m];
        Trie root = buildTrie(words);
      
        for (int i= 0 ; i <n; i++ ){
            for (int j = 0 ; j< m;j++){
                dfs(root,vis,i,j, board ,result);
            }
        }

        return result;   
    }
    public void dfs(Trie node, boolean[][] vis, int row, int col, char[][] board, List<String> result){
        if (row < 0 || col <0 || row >= board.length || col >= board[0].length || vis[row][col]) return ;

        char c = board[row][col];
        int idx = c - 'a';
        if (node.children[idx] == null){
            return;
        }
        node = node.children[idx];
        if (node.word != null ){
            result.add(node.word);
            node.word = null;
        }

        vis[row][col] = true;
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        for (int[] d : directions) {
            int newRow = row + d[0];
            int newCol = col + d[1];

            dfs(node,vis,newRow, newCol,board,result); 
        }

        vis[row][col] = false;

    }
}