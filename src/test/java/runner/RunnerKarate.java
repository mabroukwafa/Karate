package runner;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class RunnerKarate {

        @Test
        public void runner(){
            Results results = Runner.path("C:\\Users\\IB\\Desktop\\DevJava\\KarateProjectP\\src\\test\\resources\\features").tags("@POEI20252-609").parallel(1);
            assertTrue(results.getFailCount() == 0);
        }

    }


