package com.company;

import java.util.Scanner;

class col {
    int w;
    int ea;

    col(int a, int b) {
        this.w = a;
        this.ea = b;
    }
}
public class Main {
    public static void main(String[] args) {
        int coin;
        int pay;
        Scanner sc = new Scanner(System.in);
        coin = sc.nextInt();
        col[] won = new col[coin];
        pay = sc.nextInt();
        for (int i = 0; i < coin; i++) {
            int w = sc.nextInt();
            int ea = sc.nextInt();
            won[i] = new col(w, ea);
        }
        int cnt = 0;
        for (int i = 0; i < coin; i++) {
            if (won[i].w >= pay) {
                cnt += won[i].ea;
            }
        }
        System.out.println(cnt);
    }
}
