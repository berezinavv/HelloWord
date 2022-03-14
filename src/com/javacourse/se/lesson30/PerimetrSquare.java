package com.javacourse.se.lesson30;

public class PerimetrSquare {
    public void GetPerimetr(String str) throws PerimetrException {

        Square square=new Square();

        try {
            double side =Double.parseDouble(str);
            square.setSide(6);
        }
        catch (NumberFormatException e) {
            throw new PerimetrException("String is incorrect", e);
        }
        catch (PerimetrException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
