import com.controller.BDDController;
import com.controller.MainController;
import com.model.*;
import com.view.HView1;

import java.sql.Date;

/**
 * @author JuAmo_000
 * @since 17/01/2017.
 */
public class Main {
    public static void main(final String[] args) throws Exception {


        MainController controller = new MainController();

        HView1 hView1 = new HView1(controller);
        //Agency.printFlatList(Agency.getEmptyHousing());

    }

    public static void initializeDB(){
        //Initialisation d'entités de base
        City city1 = new City("Paumé-les-doigts-de-pied", 2000, 25.5);
        City city2 = new City("Zagreb",790017,1800.0);

        District district1 = new District("Centre-Ville", city1);
        District district2 = new District("Trnje", city2);
        District district3 = new District("Donji Grad", city2);

        Person person1 = new Person("Sophie", "Fonfec", new Date(1987, 3, 19), "06.12.34.56.78");
        Person person2 = new Person("Jean", "Bon", new Date(1987, 3, 19), "06.12.34.56.78");

        Housing housing1 = new Housing(district1, 120.0, 95.5, "5 rue des rats des goût lubrique", person1, Type.T2);
        Housing housing2 = new Housing(district2, 121.0, 75.5, "16 Kuhačeva", null, Type.F1);
        Housing housing3 = new Housing(district3, 122.0, 120.5, "17 Kuhačeva", null, Type.studio);

        BDDController.persist(housing1);
        BDDController.persist(housing2);
        BDDController.persist(housing3);
        BDDController.persist(person2);
        BDDController.commit();
    }


}
