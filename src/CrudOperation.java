import java.io.IOException;
import java.util.List;

public interface CrudOperation {
    PointsT findById(int id);

    List<PointsT> findAll() throws IOException, ClassNotFoundException;
    void add(PointsT pointsT) throws IOException;
    void update(PointsT pointsT) throws IOException;
   // void delete(PointsT pointsT) throws IOException;
}
