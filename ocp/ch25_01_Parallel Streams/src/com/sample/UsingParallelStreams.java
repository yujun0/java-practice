package com.sample;

import java.util.List;

public class UsingParallelStreams {

    public static void main(String[] args) {
        List<Employee> eList = Employee.createShortList();

        // Collection
        double result = eList.parallelStream()
                .filter(e -> e.getState().equals("CO"))
                .filter(e -> e.getRole().equals(Role.EXECUTIVE))
                .peek(e -> e.printSummary())
                .mapToDouble(e -> e.getSalary())
                .sum();
        System.out.printf("Total CO Executive Pay: $%,9.2f %n", result);

        System.out.println("--------------");

        // From a Stream        
        double result2 = eList.stream()
                .filter(e -> e.getState().equals("CO"))
                .filter(e -> e.getRole().equals(Role.EXECUTIVE))
                .peek(e -> e.printSummary())
                .mapToDouble(e -> e.getSalary())
                .parallel()
                .sum();
        System.out.printf("Total CO Executive Pay: $%,9.2f %n", result2);

    }

}
