package by.tms.lesson21.calculator.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
@NoArgsConstructor(force = true)
@AllArgsConstructor
public class Operation {
    private final double num1;
    private final double num2;
    private final String operation;
    private double result;
}
