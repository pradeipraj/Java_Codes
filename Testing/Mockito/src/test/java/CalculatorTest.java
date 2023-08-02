import org.junit.jupiter.api.Test;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class CalculatorTest {
    @Test
    public void testMock(){
        //Setting up Mock
        List mockList = mock(List.class);
        //Creating Stubbing
        when(mockList.size()).thenReturn(10);
        System.out.println(mockList.size());

    }
}