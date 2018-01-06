package jp.techacademy.hongou.yuka.javalog;

import android.util.Log;

/**
 * Created by hongoyuka on 2018/01/06.
 */

class Human extends Animal implements Thinkable {
    String name;
    int age;
    String hobby;

    public Human() {
        name = "ひなた";
        age = 7;
        hobby = "ポケモン";
    }

    public void say() {
        Log.d("javatest", "私の名前は"+ this.name + "です。年は" + this.age + "歳です。");
   }

    @Override
    public void think() {
        Log.d("javatest", "私は"+ this.hobby + "について考える。");
    }
}
