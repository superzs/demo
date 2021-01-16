package com.designPattern.behavioral.interpreter;

/**
 * Created by hongjingjun on 16/2/16.
 */


public class PlusExpression implements IExpression {

    public void interpret(Context context) {

        int sum = context.getSum();
        sum++;
        context.setSum(sum);
    }
}
