package op.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TrainGroup {
    private List<Train> trains;
    private int groupSize;

    public TrainGroup(int groupSize) {
        this.groupSize = groupSize;
        trains = new ArrayList<>(groupSize);
    }

    public int getGroupSize() {
        return groupSize;
    }

    public void setGroupSize(int groupSize) {
        this.groupSize = groupSize;
    }

    public List<Train> getTrains() {
        return trains;
    }

    public void setTrains(List<Train> trains) {
        this.trains = trains;
    }

    public void addTrain(Train train) {
        trains.add(train);
    }

    public void removeTrain(Train train) {
        this.trains.remove(train);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrainGroup that = (TrainGroup) o;
        return trains.equals(that.trains);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trains, groupSize);
    }
}
