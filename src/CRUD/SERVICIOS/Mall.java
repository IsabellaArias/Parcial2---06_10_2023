package CRUD.SERVICIOS;
import CRUD.DTO.Dto;
import CRUD.INTERFACE.Interface;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Mall implements Interface{
    private List<Dto> Malls;

    public Mall() throws IOException, ClassNotFoundException {
        Malls = new ArrayList<>();
    }

    @Override
    public Dto findById(int id) {
        return Malls.stream()
                .filter(Mall -> Mall.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Dto> findAll() throws IOException, ClassNotFoundException {
        Malls = (List<Dto>) ObjectSerializer.readObjectFromFile("Malls.ax");
        return Malls;
    }

    @Override
    public void save(Dto Mall) throws IOException {
        Malls.add(Mall);
        ObjectSerializer.writeObjectToFile(Malls, "Malls.ax");
    }

    @Override
    public void update(Dto Mall) throws IOException {
        Dto oldProducto = findById(Mall.getId());
        if (oldProducto != null) {
            Malls.remove(oldProducto);
            Malls.add(Mall);
            ObjectSerializer.writeObjectToFile(Malls, "Malls.ax");
        }
    }

    @Override
    public void delete(Dto Mall) throws IOException {
        Malls.remove(Mall);
        ObjectSerializer.writeObjectToFile(Malls, "Malls.ax");
    }
}
