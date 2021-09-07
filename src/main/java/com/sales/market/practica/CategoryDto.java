package com.sales.market.practica;

public class CategoryDto {
    private final Integer sizeCode = 5;
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void validate() {
        if (this.code.length() < this.sizeCode) {
            Integer charsSize = this.sizeCode - this.code.length();
            String fillCode = this.generateFillCode(charsSize);
            this.code = fillCode + this.code;
            throw new CheckedException();
        }
    }

    private String generateFillCode(Integer length) {
        char FILL = 'X';
        String fillCode = "";
        for (int i = 0; i < length; i++) {
            fillCode = FILL + fillCode;
        }
        return fillCode;
    }

    public void validateUnchecked() {
        if (this.code.length() < this.sizeCode) {
            throw new CheckedException();
        }
    }
}
