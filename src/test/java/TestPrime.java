
import static org.assertj.core.api.Assertions.assertThat;

@org.testng.annotations.Test
public class TestPrime {

    public void testPrimeWithOne(){
        assertThat(Prime.isPrime(1)).isEqualTo(false);
    }
    public void testPrimeWithEven(){
        assertThat(Prime.isPrime(12)).isEqualTo(false);
    }

    public void testPrimeWithTwo(){
        assertThat(Prime.isPrime(2)).isEqualTo(true);
    }

    public void testPrimeWithNumber(){
        assertThat(Prime.isPrime(37)).isEqualTo(true);
    }

    public void testBigPrimeNumber(){
        assertThat(Prime.isPrime(7919)).isEqualTo(true);
    }
    public void testPrimeNegativeNumber(){
        assertThat(Prime.isPrime(-37)).isEqualTo(false);
    }

}
