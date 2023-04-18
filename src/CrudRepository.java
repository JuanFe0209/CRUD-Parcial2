import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class  CrudRepository implements CrudOperation {
    private List<PointsT> pointsTS;

    public CrudRepository() throws IOException, ClassNotFoundException {
        pointsTS = new ArrayList<>();
    }

    @Override
    public PointsT findById(int id) {
        return pointsTS.stream()
                .filter(PointsT -> PointsT.getIdCustomer() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<PointsT> findAll() throws IOException, ClassNotFoundException {
        pointsTS = (List<PointsT>) ObjectSerializer.readObjectFromFile("PointsT.ax");
        return pointsTS;
    }

    @Override
    public void add(PointsT pointsT) throws IOException {
        this.pointsTS.add(pointsT);
        ObjectSerializer.writeObjectToFile(this.pointsTS, "PointsT.ax");

    }
    @Override
    public void update(PointsT pointsT) throws IOException {
        PointsT oldPointsT = findById(pointsT.getIdCustomer());
        if (oldPointsT != null) {
            pointsTS.remove(oldPointsT);
            pointsTS.add(pointsT);
            ObjectSerializer.writeObjectToFile(pointsT, "PointsT.ax");

    }
   /* @Override
    public void delete(PointsT pointsT) throws IOException {
        pointsTS.remove(pointsT);
        ObjectSerializer.writeObjectToFile(pointsTS, "PointsT.ax");
    }*/
}
}