import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by 803100 on 27.10.2016.
 */
public class graphTest {
    private ArrayList<Integer> adj[];
    private boolean used[];
    public int n=11;

    private boolean[] initused() throws Exception{
        used = new boolean[n];
        Arrays.fill(used, false);
        return used;

    }
    private ArrayList<Integer>[] initadj() throws Exception{
        adj = new ArrayList[n];
        for (int i = 0; i < n; ++i) {
            adj[i] = new ArrayList<Integer>();
        }
        adj[0].add(1);
        adj[1].add(0);
        adj[0].add(2);
        adj[2].add(0);
        adj[1].add(3);
        adj[3].add(1);
        adj[1].add(4);
        adj[4].add(1);
        adj[2].add(5);
        adj[5].add(2);
        adj[2].add(6);
        adj[6].add(2);
        adj[3].add(7);
        adj[7].add(3);
        adj[3].add(8);
        adj[8].add(3);
        adj[4].add(9);
        adj[9].add(4);
        adj[6].add(10);
        adj[10].add(6);
        return adj;
    }
    @Test
    public void testwithoutgraph() throws Exception {
        // Тестируемый класс
        graph tester = new graph();
        graphTest g = new graphTest();
        used=g.initused();
        String result = tester.dfs(0,7,adj,used);
        // Проверяемый метод
        assertEquals("-1", result);

    }
    @Test
    public void testerror() throws Exception {
        // Тестируемый класс
        graph tester = new graph();
        graphTest g = new graphTest();
        used=g.initused();
        adj=g.initadj();
        String result = tester.dfs(11,7,adj,used);
        // Проверяемый метод
        assertEquals("-2", result);

    }
   @Test
    public void test2() throws Exception {
        // Тестируемый класс
        graph tester = new graph();
        graphTest g = new graphTest();
        used=g.initused();
        adj=g.initadj();
        String result = tester.dfs(0,10,adj,used);
        // Проверяемый метод
        assertEquals(" 1 2 4 8 9 5 10 3 6 7 11", result);

    }
   @Test
    public void test3() throws Exception {
        // Тестируемый класс
        graph tester = new graph();
        graphTest g = new graphTest();
        used=g.initused();
        adj=g.initadj();
        String result = tester.dfs(0,0,adj,used);
        // Проверяемый метод
        assertEquals(" 1", result);
    }
   @Test
    public void test4() throws Exception {
        // Тестируемый класс
        graph tester = new graph();
        graphTest g = new graphTest();
        used=g.initused();
        adj=g.initadj();
        String result = tester.dfs(0,1,adj,used);
        // Проверяемый метод
        assertEquals(" 1 2", result);
    }
    @Test
    public void test5() throws Exception {
        // Тестируемый класс
        graph tester = new graph();
        graphTest g = new graphTest();
        used=g.initused();
        adj=g.initadj();
        String result = tester.dfs(0,11,adj,used);
        // Проверяемый метод
        assertEquals("-3", result);
    }
    @Test
    public void test6() throws Exception {
        // Тестируемый класс
        graph tester = new graph();
        graphTest g = new graphTest();
        used=g.initused();
        adj=g.initadj();
        String result = tester.dfs(10,11,adj,used);
        // Проверяемый метод
        assertEquals(" 11 12", result);
    }

    @Test
    public void test9() throws Exception {
        // Тестируемый класс
        graph tester = new graph();
        graphTest g = new graphTest();
        adj=g.initadj();
        String result = tester.dfs(1,0,adj,used);
        // Проверяемый метод
        assertEquals("-4", result);
    }

}