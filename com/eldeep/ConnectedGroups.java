package com.eldeep;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ConnectedGroups {
	
	public static void main(String[] args) {
		List<String> n = new ArrayList<>();
		n.add("1100");
		n.add("0110");
		n.add("0110");
		n.add("0001");
		countGroups(n);
	}
    public static int countGroups(List<String> related) {

    	for (int i = 0; i<related.size();i++)
        {
            graph.put(i ,new Node());
        }
        for (int i = 0; i< related.size();i++)
        {
            for (int j=i+1;j<related.size();j++)
            {
                if (related.get(i).charAt(j)=='1')
                {
                    union(graph.get(i), graph.get(j));
                }
            }
        }
        Set<Node> set = new HashSet<>();
        for(int i=0; i<related.size();i++)
        {
            set.add(findParent(graph.get(i)));
        }
        return set.size();
        }
    
        static Map<Integer,Node> graph = new HashMap<>();
        
        static class Node {
            int ind ;
            Node parent;
            Node(){
                ind=0;
                parent= this;
            }
        }
        
        private static Node findParent (Node node)
        {
            if (node==node.parent)
            {
                return node;
            }
            node.parent = findParent(node.parent);
            return node.parent;
        }
        private static void union (Node node1, Node node2)
        {
            Node n1 = findParent(node1);
            Node n2 = findParent(node2);
            if (n1==n2)return;
            if (n1.ind>=n2.ind)
            {
                n2.parent=n1;
                n1.ind +=1;
            }else{
                n1.parent = n2;
                n2.ind +=1;
            }
        }
}
