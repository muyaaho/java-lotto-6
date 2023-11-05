package lotto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AmountProcessingTest {
    @Test
    void 발행한_로또_수량을_출력한다(){
        AmountProcessing amountProcessing = new AmountProcessing();
        int output = amountProcessing.getLottoCount(8000);
        assertEquals(8, output);
        int output2 = amountProcessing.getLottoCount(16000);
        assertEquals(16, output2);
        int output3 = amountProcessing.getLottoCount(12500);
        assertEquals(12, output3);
        int output4 = amountProcessing.getLottoCount(12345);
        assertEquals(12, output4);
    }
}
