package com.green.day6.ch3;
//p.131
public class OperatorEx32 {
    public static void main(String[] args) {
        int x, y, z;
        int absX, absY, absZ;
        char signX, signY, signZ;

        x = 10;
        y = -5;
        z = 0;
        //absX 식 ? true였을 때 : false였을 때
        //조건식을 백엔드는 안쓸 수 있으면 안쓰는게 좋음.
        absX = x >= 0 ? x : -x;
        absY = y >= 0 ? y : -y;
        absZ = z >= 0 ? z : -z;
        System.out.printf("x : %d, y : %d, z : %d\n", x, y, z);
        System.out.printf("absX : %d, absY : %d, absZ : %d\n", absX, absY, absZ);

        // x가 0이면 '', 0이 아니면 양수 혹은 음수 부호
        signX = x == 0 ? ' '
                       : x >= 0 ? '+' : '-';
        signY = y == 0 ? ' '
                       : y >= 0 ? '+' : '-';
        signZ = z == 0 ? ' '
                       : z >= 0 ? '+' : '-';

        System.out.printf("x=%c%d\n", signX, absX);
        System.out.printf("y=%c%d\n", signY, absY);
        System.out.printf("z=%c%d\n", signZ, absZ);
    }
}
