package op.task4;

public class Main {
    public static void main(String[] args) {
        Train train1 = new Train("Minsk", "18:55", 4);
        Train train2 = new Train("Vitebsk", "06:17", 3);
        Train train3 = new Train("Mogilev", "14:48", 6);
        Train train4 = new Train("Grodno", "16:57", 14);
        Train train5 = new Train("Grodno", "15:57", 11);
        Train train6 = new Train("Grodno", "17:57", 11);

        TrainGroup trainGroup = new TrainGroup(3);
        trainGroup.addTrain(train1);
        trainGroup.addTrain(train2);
        trainGroup.addTrain(train3);
        trainGroup.addTrain(train4);
        trainGroup.addTrain(train5);
        trainGroup.addTrain(train6);

        TrainGroupLogic trainGroupLogic = new TrainGroupLogic();

        trainGroupLogic.sortByDestination(trainGroup);
        System.out.println();

        trainGroupLogic.getTrain(trainGroup, 3);
    }
}
