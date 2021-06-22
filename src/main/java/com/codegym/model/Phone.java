package com.codegym.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class Phone {
    @NotEmpty
    @Pattern(regexp = "\\d{10}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}",message = "Khong thanh cong")
    private String number;

    public Phone() {
    }

    public Phone(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
