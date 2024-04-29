package org.example;

public class Divisa {
    private String base_code;
    private String target_code;
    private double conversion_result;

    public Divisa(DivisaApi divisaApi){
        this.base_code = divisaApi.base_code();
        this.target_code = divisaApi.target_code();
        this.conversion_result = divisaApi.conversion_result();
    }

    //Metodos getter usados para la respuesta final
    public String getBase_code() {
        return base_code;
    }

    public String getTarget_code() {
        return target_code;
    }

    public double getConversion_result() {
        return conversion_result;
    }

    @Override
    public String toString() {
        return "Divisa{" +
                "base_code='" + base_code + '\'' +
                ", target_code='" + target_code + '\'' +
                ", conversion_result=" + conversion_result +
                '}';
    }
}
