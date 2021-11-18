package test;

import java.io.IOException;

public class Test {
    public static void main(String args[]) throws IOException {
        //存放数据以及保存模型文件路径
        String filepath = "C:\\Users\\86150\\Downloads\\libsvm-3.25 (2)\\";
        /*
         * -s 设置svm类型：默认值为0
         *          0– C-SVC
         *          1 – v-SVC
         *          2 – one-class-SVM
         *          3 –ε-SVR
         *          4 – n - SVR
         *
         * -t 设置核函数类型，默认值为2
         *          0 --线性核
         *          1 --多项式核
         *          2 -- RBF核
         *          3 -- sigmoid核
         *
         * -d degree:设置多项式核中degree的值，默认为3
         *
         * -c cost：设置C-SVC、ε-SVR、n - SVR中从惩罚系数C，默认值为1；
         */
        String[] arg = {"-s","0","-c","10","-t","0",filepath+"first.txt",filepath+"line.txt"};
        String[] arg1 = {filepath+"second.txt",filepath+"line.txt",filepath+"predict1.txt"};
        System.out.println("----------------线性-----------------");
        //训练函数
        svm_train.main(arg);
        svm_predict.main(arg1);


        arg[5]="1";
        arg[7]=filepath+"poly.txt";//输出文件路径
        arg1[1]=filepath+"poly.txt";
        arg1[2]=filepath+"predict2.txt";
        System.out.println("---------------多项式-----------------");
        svm_train.main(arg);
        svm_predict.main(arg1);

        arg[5]="2";
        arg[7]=filepath+"RBF.txt";
        arg1[1]=filepath+"RBF.txt";
        arg1[2]=filepath+"predict3.txt";
        System.out.println("---------------高斯核-----------------");
        svm_train.main(arg);
        svm_predict.main(arg1);

    }

}
