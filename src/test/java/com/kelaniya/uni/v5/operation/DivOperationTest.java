package com.kelaniya.uni.v5.operation;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class DivOperationTest {

@Test
public void should_divide_positive_values() throws InvalidCalcOperationException {
  DivOperation divOperation=new DivOperation();
  Double result =divOperation.execute(new Double[]{6.0,3.0});
    assertThat(result, is(2.0));
}
    @Test
    public void should_not_divide_by_zeros() throws InvalidCalcOperationException{
        DivOperation divOperation=new DivOperation();
        assertThrows(InvalidCalcOperationException.class,()-> {
            divOperation.execute(new Double[]{6.0, 0.0});
        });

    }

}