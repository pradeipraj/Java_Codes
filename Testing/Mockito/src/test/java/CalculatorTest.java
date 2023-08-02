import org.junit.jupiter.api.Test;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class CalculatorTest {

    @Test

    public void testAdd(){
        List mockedList = mock(List.class);
        when(mockedList.size()).thenReturn(4);
        int size = mockedList.size();


    }


}