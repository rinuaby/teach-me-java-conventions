public class PowerfinderTest {
    package powerpackage;
import powerpackage.*;
import org.junit.jupiter.api.Test;


    public class PowerfinderTest {
        @Test
        public void One_raised_to_one_is_onew() {

            assert Powerfinder.oF(1,1) == 1;

        }

        @Test
        public void TwoRaised_to_one_is_2() {

            assert Powerfinder.oF(2,1) == 2;
        }

        @Test
        public void Two_power_2_is_4() {

            assert Powerfinder.oF(2, 2) == 4;
        }

        @Test
        public void Power_of_2_and_3_Is_SIX() {

            assert Powerfinder.oF(3, 2) == 9;
        }
    }
}
