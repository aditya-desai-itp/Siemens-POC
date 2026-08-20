package employee_app.config;

import org.springframework.stereotype.Component;

@Component
public class NonConfigValues {

    public void demonstrateNonConfigValues() {

        int retryCount = 3;

        String status = "ACTIVE";

        int calculationLimit = 10;

        String notFoundMessage = "Employee not found";

        int loopBatchSize = 5;
    }
}