import org.junit.jupiter.api.Test;

import java.util.List;

import static org.mockito.Mockito.*;

class CalculatorTest {
    @Test
    public void testMock(){
        //Setting up Mock
        List mockList = mock(List.class);
        //Creating Stubbing
        when(mockList.size()).thenReturn(10);
        //Verify
        mockList.add("One");
        verify(mockList).add("One");
        //Verify
        System.out.println(mockList.size());
    }
}