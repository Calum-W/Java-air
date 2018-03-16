import java.util.*;

public class airport {

    ArrayList<String> hangar = new ArrayList<String>();

    public String land(String plane){
        hangar.add(plane);
        return "Plane landed";
    }

    public int getPlaneCount() {
        return hangar.size();
    }


}
