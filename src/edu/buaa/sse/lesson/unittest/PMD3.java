package edu.buaa.sse.lesson.unittest;

/**
 * Created by tina on 2015/10/31.
 */
public class PMD3 {
    public void foo(){
            Object x = null; // this is OK
            x = new Object();
            // 大量代码
            x = null; // 重新被设置了null值
            // 大量代码
    }

    private void UnusedFormalParameter(String input) {
        // input没有被使用
    }

    public void UnnecessaryReturn() {
        int x = 42;
        return; //因为函数不要求返回，所以这个return是无效的。
    }

    private void AvoidCatchingNPE(){
        try {
            // do something
        }  catch (NullPointerException npe) {
            //捕获空指针可能掩盖真正的错误。
        }
    }
}


