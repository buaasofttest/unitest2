package edu.buaa.sse.lesson.unittest;

/**
 * Created by tina on 2015/10/31.
 */
public class PMD2 {

    public void NPathComplexity() {	// 搞得太复杂,
        boolean y= true;
        int r = 0;
        int f = 0;
        int n = 0;
        if (y) {	// 应该拆分成多个函数
            for (int j = 0; j < 10; j++) {
                if (j > r) {
                    doSomething();
                    while (f < 5 ) {
                        anotherThing();
                        f -= 27;
                    }
                } else {
                    tryThis();
                }
            }
        }
        if ( r - n > 45) {
            while (doMagic()) {
                findRabbits();
            }
        }
        try {
            doSomethingDangerous();
        } catch (Exception ex) {
            makeAmends();
        } finally {
            dontDoItAgain();
        }
    }

    private void findRabbits() {

    }

    private void makeAmends() {

    }

    private void dontDoItAgain() {

    }

    private void doSomethingDangerous() {

    }

    private boolean doMagic() {
        return  true;
    }

    private void tryThis() {
    }

    private void anotherThing() {
    }

    private void doSomething() {
    }



}
