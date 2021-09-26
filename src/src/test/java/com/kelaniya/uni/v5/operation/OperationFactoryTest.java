package com.kelaniya.uni.v5.operation;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class OperationFactoryTest {

    //Test cases
    //1.If the operator is add->should return an object of AddOperation class
    @Test
    public void should_return_AddOperation_object_when_operator_is_add(){
        OperationFactory operationFactory=new OperationFactory();
        Operation operation = operationFactory.getInstance("add");

        //verify that the operation object is an object of SubOperation class
        assertThat(operation,instanceOf(AddOperation.class));
    }
    //2.If the operator is sub->should return an object of SubOperation class
    @Test
    public void should_return_SubOperation_object_when_operator_is_sub(){
        OperationFactory operationFactory=new OperationFactory();
        Operation operation = operationFactory.getInstance("sub");

        //verify that the operation object is an object of SubOperation class
        assertThat(operation,instanceOf(SubOperation.class));
    }
    //3.If the operator is mul->should return an object of MulOperation class
    @Test
    public void should_return_MulOperation_object_when_operator_is_mul(){
        OperationFactory operationFactory=new OperationFactory();
        Operation operation = operationFactory.getInstance("mul");

        //verify that the operation object is an object of SubOperation class
        assertThat(operation,instanceOf(MulOperation.class));
    }
    //4.If the operator is div->should return an object of DivOperation class
    @Test
    public void should_return_DivOperation_object_when_operator_is_div(){
        OperationFactory operationFactory=new OperationFactory();
        Operation operation = operationFactory.getInstance("div");

        //verify that the operation object is an object of SubOperation class
        assertThat(operation,instanceOf(DivOperation.class));
    }
}