package 复习;

public class meidi2 {
    public static int maxPointsNum(Point[] points) {
        int[][] ps=new int[points.length][2];
        for (int i = 0; i <points.length ; i++) {
            ps[i][0]=points[i].x;
            ps[i][1] = points[i].y;
        }
        int n = ps.length;
        int ans = 1;
        for (int i = 0; i < n; i++) {
            int[] x = ps[i];
            for (int j = i + 1; j < n; j++) {
                int[] y = ps[j];
                int cnt = 2;
                for (int k = j + 1; k < n; k++) {
                    int[] p = ps[k];
                    int s1 = (y[1] - x[1]) * (p[0] - y[0]);
                    int s2 = (p[1] - y[1]) * (y[0] - x[0]);
                    if (s1 == s2) cnt++;
                }
                ans = Math.max(ans, cnt);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Point[] points = new Point[2];
        Point point1 = new Point(0, 0);
        Point point2 = new Point(0, 0);
        points[0]=point1;
        points[1]=point2;
        System.out.println(maxPointsNum(points));
    }
}
class Point{
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
