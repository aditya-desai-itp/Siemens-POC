package employee_app.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "employee")
public class EmployeeProperties {

    private Pagination pagination = new Pagination();
    private Validation validation = new Validation();

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public Validation getValidation() {
        return validation;
    }

    public void setValidation(Validation validation) {
        this.validation = validation;
    }

    public static class Pagination {

        private int pageSize;

        public int getPageSize() {
            return pageSize;
        }

        public void setPageSize(int pageSize) {
            this.pageSize = pageSize;
        }
    }

    public static class Validation {

        private int minNameLength;

        public int getMinNameLength() {
            return minNameLength;
        }

        public void setMinNameLength(int minNameLength) {
            this.minNameLength = minNameLength;
        }
    }
}