package apap.tutorial.haidokter.service;

import apap.tutorial.haidokter.model.ResepModel;

import java.util.List;

public interface ResepService {
    // method untuk add resep
    void addResep(ResepModel resep);

    // method untuk mendapatkan semua data resep
    List<ResepModel> getResepList();

    // method untuk mendapatkan semua data resep berdasarkan nomor resep
    ResepModel getResepByNomorResep(Long noResep);

    ResepModel updateResep(ResepModel resepModel);

    void deleteResep(Long noResep);

    List<ResepModel> getSortedResepList();

}
