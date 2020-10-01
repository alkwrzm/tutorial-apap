package apap.tutorial.haidokter.service;

import apap.tutorial.haidokter.model.ResepModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ResepInMemoryService implements ResepService{
    private List<ResepModel>listResep;

    // constructor
    public ResepInMemoryService() {
        listResep = new ArrayList<>();
    }

    @Override
    public void addResep(ResepModel resep) {

        listResep.add(resep);
    }

    @Override
    public void deleteResep(ResepModel resep) {
        listResep.remove(resep);
    }

    @Override
    public void updateResep(String noResep, String catatan) {
        getResepByNomorResep(noResep).setCatatan(catatan);
    }

    @Override
    public List<ResepModel> getResepList() {
        return listResep;
    }

    @Override
    public ResepModel getResepByNomorResep(String noResep) {
        for (ResepModel i: listResep) {
            if (i.getNoResep().equals(noResep)) {
                return i;
            }
    }
            return null;
    }
}
