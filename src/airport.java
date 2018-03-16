import java.util.*;

public class airport {

    ArrayList<String> hangar = new ArrayList<String>();

    public String land(String plane){
        hangar.add(plane);
        return "Plane landed";
    }

    public String takeOff(String plane) {
        return "Plane has taken off";
    }

    public int getPlaneCount() {
        return hangar.size();
    }


}
