package jp.techacademy.hongou.yuka.javalog;

import android.text.StaticLayout;
import android.util.Log;

/**
 * Created by hongoyuka on 2018/01/06.
 */


class BigDog extends Dog {
    static String to_jp = "大型犬";

    public BigDog(String name, int age) {
        super(name, age);
    }

    public static void introduce() {
        Log.d("javatest", "これは大型犬クラスです");
    }

}
