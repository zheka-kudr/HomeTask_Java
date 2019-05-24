package op.task4;

import java.util.Comparator;
import java.util.List;

public class TrainGroupLogic {
    public void sortByNumber(TrainGroup trainGroup) {
        List<Train> trains;
        trains = trainGroup.getTrains();
        if (!trains.isEmpty()) {
            trains.sort(Comparator.comparing(Train::getNumber));
            for (Train train : trains) {
                System.out.println(train.toString());
            }
        }
    }

    void sortByDestination(TrainGroup trainGroup) {
        List<Train> trains;
        trains = trainGroup.getTrains();
        if (!trains.isEmpty()) {
            trains.sort(Comparator.comparing(Train::getDestination));
            trains.sort(Comparator.comparing(Train::getDeparture));
            for (Train train : trains) {
                System.out.println(train.toString());
            }
        }
    }

    void getTrain(TrainGroup trainGroup, int index) {
        List<Train> trains;
        trains = trainGroup.getTrains();
        for (Train train : trains) {
            if (train.getNumber() == index) {
                System.out.println(train);
            }
        }
    }
}
