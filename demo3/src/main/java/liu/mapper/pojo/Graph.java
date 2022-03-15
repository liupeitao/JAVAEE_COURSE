package liu.mapper.pojo;

public class Graph {
    int [][] G = new int[10][];

    public static void main(String[] args) {
        int i = 0, j = 0;
        Graph g = new Graph();
        for (i  = 0; i < g.G.length; i++)
        {
            g.G[i] = new int[i+1];
            for(j = 0 ; j < i; j++)
                g.G[i][j] = j ;

        }

        for(i = 0 ; i < g.G.length ; i++)
        {

            for(j = 0; j < g.G[i].length; j++)
            {
                System.out.print(g.G[i][i]);
            }
            System.out.println("\t" + g.G[i].length);
        }

    }

}
