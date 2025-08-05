package dio.com.facade;

import subsystem1.CrmService;
import sybsystem2.CepApi;

public class Facade {

    public void migrateClient(String nome, String cep) {
        String city = CepApi.getInstance().getCity(cep);
        String state = CepApi.getInstance().getState(cep);

        CrmService.saveClient(nome, cep, city, state);
    }
}
