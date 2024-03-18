import java.util.*;
class Pair implements Comparable<Pair> {
    int node;
    int dis;

    public Pair(int dis, int node) {
        this.node = node;
        this.dis = dis;
    }

    @Override
    public int compareTo(Pair other) {
        return Integer.compare(this.dis, other.dis);
    }
}

public class Solution {
    public static List<Integer> dijkstra(int[][] edge,int vertices, int edges,int source){
    List<List<Pair>> graph=new ArrayList<>();
    for(int i=0;i<vertices;i++)
    {
        graph.add(new ArrayList<>());
    }
    for(int i=0;i<edges;i++)
    {
        graph.get(edge[i][0]).add(new Pair(edge[i][2],edge[i][1]));
        graph.get(edge[i][1]).add(new Pair(edge[i][2],edge[i][0]));
    }
    Queue<Pair> que = new LinkedList<>();
    int dist[]=new int[vertices];
    Arrays.fill(dist,Integer.MAX_VALUE);
    dist[source]=0;
    que.add(new Pair(0,source));
    while(!que.isEmpty())
    {
        int dis = que.peek().dis;
        int node = que.peek().node;
        que.remove();
        List<Pair> arr = graph.get(node);
        for(Pair p:arr)
        {
            if(dis+p.dis<dist[p.node])
            {
                dist[p.node] = dis+p.dis;
                que.add(new Pair(dis+p.dis,p.node));
            }
        }

    }
    List<Integer> l=new ArrayList<>();
    for(int i:dist)
    {
        l.add(i);
    }
    return l;


    }
}
