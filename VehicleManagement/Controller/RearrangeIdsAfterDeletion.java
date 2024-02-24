package Controller;

import Model.VehicleInterface;

import java.util.ArrayList;

public class RearrangeIdsAfterDeletion {

    public static <T extends VehicleInterface> void run(ArrayList<T> vehicle, int deletedId, int indexDeleted) {
        if (indexDeleted > vehicle.size()) {
            return; // make sure vehicle.get(indexDeleted).setIdAfterRemove(); not work when input over list size
        } else {
            // Rearrange Ids After Deletion
            for (int i = indexDeleted; i < vehicle.size(); i++) {
                vehicle.get(i).setId(deletedId);
                deletedId++;
            }
        }
        vehicle.get(indexDeleted).setIdAfterRemove();
    }
}
