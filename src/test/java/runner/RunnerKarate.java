package runner;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import org.junit.Test;

public class RunnerKarate {

        @Test
        public void runner(){
            Results results = Runner.path("C:\\Users\\IB\\Desktop\\DevJava\\KarateProjectP\\src\\test\\resources\\features").tags("@POEI20252-609").parallel(1);
            assert results.getFailCount() == 0;
        }

    }


