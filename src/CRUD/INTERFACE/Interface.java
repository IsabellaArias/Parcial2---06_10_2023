package CRUD.INTERFACE;
import CRUD.DTO.Dto;
import java.io.IOException;
import java.util.List;

public interface Interface {
    Dto findById(int id);
    List<Dto> findAll() throws IOException, ClassNotFoundException;
    void save(Dto Mall) throws IOException;
    void update(Dto Mall) throws IOException;
    void delete(Dto Mall) throws IOException;
}
