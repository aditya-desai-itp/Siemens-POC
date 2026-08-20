package employee_app.config;

import org.springframework.stereotype.Component;

@Component
public class EnvironmentConfig {

    public String getEmployeeApiUrl() {
        return System.getenv("EMPLOYEE_API_URL");
    }

    public String getDatabaseHost() {
        return System.getenv("DB_HOST");
    }
}