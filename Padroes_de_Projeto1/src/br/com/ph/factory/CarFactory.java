package br.com.ph.factory;

import br.com.ph.models.SUV;
import br.com.ph.models.Sedan;

public interface CarFactory {
    SUV criarSUV();
    Sedan criarSedan();
}
