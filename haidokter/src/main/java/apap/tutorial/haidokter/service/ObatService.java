package apap.tutorial.haidokter.service;

import apap.tutorial.haidokter.model.ObatModel;

public interface ObatService {
    void addObat(ObatModel obat);

    void deleteObat(ObatModel obat);

    ObatModel updateObat(ObatModel obatModel);

    ObatModel getObatById(Long id);

}
