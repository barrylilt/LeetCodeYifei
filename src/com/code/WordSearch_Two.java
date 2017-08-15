/*
 * 212. Word Seach II
 * 
 * Given a 2D board and a list of words from the dictionary, 
 * find all words in the board.
 *
 * Each word must be constructed from letters of sequentially adjacent cell, 
 * where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once in a word.
 */

package com.code;

import java.awt.List;
import java.util.ArrayList;

public class WordSearch_Two {
	 public static ArrayList<String> findWords(char[][] board, String[] words) {
	        
	        ArrayList<String> res = new ArrayList<>();
	     TrieNode root = buildTrie(words);
	    for (int i = 0; i < board.length; i++) {
	        for (int j = 0; j < board[0].length; j++) {
	            dfs (board, i, j, root, res);
	        }
	    }
	    return res;
	}

	public static void dfs(char[][] board, int i, int j, TrieNode p, ArrayList<String> res) {
	    char c = board[i][j];
	    if (c == '#' || p.next[c - 'a'] == null) return;
	    p = p.next[c - 'a'];
	    if (p.word != null) {   // found one
	        res.add(p.word);
	        p.word = null;     // de-duplicate
	    }

	    board[i][j] = '#';
	    if (i > 0) dfs(board, i - 1, j ,p, res); 
	    if (j > 0) dfs(board, i, j - 1, p, res);
	    if (i < board.length - 1) dfs(board, i + 1, j, p, res); 
	    if (j < board[0].length - 1) dfs(board, i, j + 1, p, res); 
	    board[i][j] = c;
	}

	public static TrieNode buildTrie(String[] words) {
	    TrieNode root = new TrieNode();
	    for (String w : words) {
	        TrieNode p = root;
	        for (char c : w.toCharArray()) {
	            int i = c - 'a';
	            if (p.next[i] == null) p.next[i] = new TrieNode();
	            p = p.next[i];
	       }
	       p.word = w;
	    }
	    return root;
	}

	public static void main(String arg[]){
		char[][] board={{'o', 'a', 'a', 'n'},
				{'e', 't', 'a', 'e'},
				{'i', 'h', 'k', 'r'},
				{'i', 'f','l', 'v'}
		};
		String[] words ={"eat", "oath", "pea", "rain"};
		
		System.out.println(findWords(board, words));
	}
}
