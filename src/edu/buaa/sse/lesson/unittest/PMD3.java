package edu.buaa.sse.lesson.unittest;

/**
 * Created by tina on 2015/10/31.
 */
public class PMD3 {
    public void foo(){
            Object x = null; // this is OK
            x = new Object();
            // ��������
            x = null; // ���±�������nullֵ
            // ��������
    }

    private void UnusedFormalParameter(String input) {
        // inputû�б�ʹ��
    }

    public void UnnecessaryReturn() {
        int x = 42;
        return; //��Ϊ������Ҫ�󷵻أ��������return����Ч�ġ�
    }

    private void AvoidCatchingNPE(){
        try {
            // do something
        }  catch (NullPointerException npe) {
            //�����ָ������ڸ������Ĵ���
        }
    }
}


