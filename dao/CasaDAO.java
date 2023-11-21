
package dao;

import java.util.List;
import java.util.ArrayList;

import model.Casa;

public class CasaDAO {
    private static List<Casa> casas = new ArrayList<>();

    public static void create(Casa casa) {
        casas.add(casa);
    }

    public static List<Casa> readAll() {
        return casas;
    }

    public static Casa readById(int id) {
        for (Casa casa : casas) {
            if (casa.getId() == id) {
                return casa;
            }
        }
        return null;
    }

    public static void update(Casa casa) {
        for (int i = 0; i < casas.size(); i++) {
            if (casas.get(i).getId() == casa.getId()) {
                casas.set(i, casa);
                break;
            }
        }
    }

    public static void delete(int id) {
        for (int i = 0; i < casas.size(); i++) {
            if (casas.get(i).getId() == id) {
                casas.remove(i);
                break;
            }
        }
    }
}
