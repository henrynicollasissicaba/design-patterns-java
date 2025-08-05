package sybsystem2;

public class CepApi {

    private static final CepApi instance = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstance() {
        return instance;
    }

    public String getCity(String cep) {
        return "Magé";
    }

    public String getState(String cep) {
        return "RJ";
    }
}
