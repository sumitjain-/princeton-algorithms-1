import java.util.Arrays;

public class UnionFind {
    public static void main(String [] args) {
        QuickFindUF a = new QuickFindUF(10);

        a.union(5,6);
        a.union(5,0);
        a.union(1,2);
        a.union(3,4);
        a.union(3,4);
        a.union(3,8);
        a.union(8,9);

        System.out.println(a.connected(4,9));
    }
}
