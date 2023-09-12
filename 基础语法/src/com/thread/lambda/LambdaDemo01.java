package com.thread.lambda;

/**
 * 作者：whl
 * 日期：2023-09-11 10:58
 * 描述：lambda表达式的推导
 */
public class LambdaDemo01 {
    //3. 静态内部类
    static class Like2 implements iLike{
        @Override
        public void lambda() {
            System.out.println("i like lambda2");
        }
    }

    public static void main(String[] args) {
        iLike like = new Like();
        like.lambda();

        like = new Like2();
        like.lambda();

        //4. 局部内部类
        class Like3 implements iLike{
            @Override
            public void lambda() {
                System.out.println("i like lambda3");
            }
        }

        like = new Like3();
        like.lambda();

        //5. 匿名内部类（没有类的名称，必须借助接口或者父类）
        like = new iLike() {
            @Override
            public void lambda() {
                System.out.println("i like lambda4");
            }
        };
        like.lambda();

        //6. 用lambda简化
        like = ()->{
            System.out.println("i like lambda5");
        };
        like.lambda();
    }
}

//1. 定义一个接口
interface iLike{
    void lambda();
}
//2. 实现类
class Like implements iLike{
    @Override
    public void lambda() {
        System.out.println("i like lambda");
    }
}
