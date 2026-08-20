package employee_app.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ApplicationConfig {

    @Value("${app.company.name}")
    private String companyName;

    @Value("${app.api.timeout}")
    private int apiTimeout;

    public String getCompanyName() {
        return companyName;
    }

    public int getApiTimeout() {
        return apiTimeout;
    }
}