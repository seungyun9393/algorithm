package chapter7;

public class QuadTree {
    
    char[][] pic = new char[16][16];

    // 무식하게 풀어보자
    public void slove(int x, int y, int size) {
        System.out.println("chapter7, QuadTree slove!");

        // 기저사례
        if(pic[x][y] == 'b' || pic[x][y] == 'w') {
            for(int dx = 0; dx < size; ++dx) {
                for(int dy=0; dy < size; ++dy) {
                    pic[x+dx][y+dy] = 'a';
                }
            }
        }
        else {

            
            // 1. 그림 압축 풀기
            int half = size/2;
            
            slove(x, y, half);              // 1사분면 0,0
            slove(x+half, y, half);         // 2사분면 8,0
            slove(x, y+half, half);         // 3사분면 0,8
            slove(x+half, y+half, half);    // 4사분면 8,8
        }

    }
}
