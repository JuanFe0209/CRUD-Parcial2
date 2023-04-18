import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) throws IOException, ClassNotFoundException {
            String opc = "1";
            CrudRepository repo = new CrudRepository();
            do {
                Scanner s = new Scanner(System.in);
                System.out.print("Menu \n 1. Add  \n 2. List \n 3. Edit " +
                        "\n 4. Delete  \n 5. Leave \n =>");
                opc = s.next();
                switch (opc) {
                    case "1": {
                        System.out.println("Id customer: ");
                        Integer id = s.nextInt();
                        System.out.println("Name Customer: ");
                        String nom = s.next();
                        System.out.println("Tank Value: ");
                        double val = s.nextDouble();
                        System.out.println("Acumulated Points: ");
                        Integer ca = s.nextInt();
                        repo.add(new PointsT(id, nom, val, ca));
                        break;
                    }
                    case "2": {
                        List<PointsT> pointsTS = repo.findAll();
                        pointsTS.forEach(System.out::println);
                        break;
                    }
                    case "3": {
                        System.out.println("===== edit ====");
                        System.out.print("id  customer: ");
                        Integer idp = s.nextInt();
                        System.out.print("add name: ");
                        String nom = s.next();
                        System.out.print("add tank value: ");
                        double cat = s.nextDouble();
                        System.out.print("add acumulated points: ");
                        Integer ca = s.nextInt();
                        PointsT beaActualizar = new PointsT(idp, nom, cat, ca);
                        repo.update(beaActualizar);
                        break;
                    }
                   /* case "4": {
                        System.out.println("===== delete ======");
                        System.out.print("add customer id : ");
                        Integer id = s.nextInt();
                        repo.delete(repo.findById(id));
                        repo.findAll().forEach(System.out::println);
                        break;*/
                }

            } while (opc != "5");
        }}


