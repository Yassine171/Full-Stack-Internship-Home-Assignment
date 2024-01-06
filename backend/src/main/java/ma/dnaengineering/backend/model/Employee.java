package ma.dnaengineering.backend.model;

import lombok.Data;


@Data
public class Employee {
    private Long id;
    private String employeeName;
    private String jobTitle;
    private double salary;
    // Getters and setters
}

