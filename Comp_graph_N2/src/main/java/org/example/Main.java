import com.sun.j3d.utils.universe.SimpleUniverse;
import com.sun.j3d.utils.geometry.ColorCube;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.media.j3d.BranchGroup;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Трёхмерная фигура");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        SimpleUniverse universe = new SimpleUniverse();
        BranchGroup group = new BranchGroup();
        group.addChild(new ColorCube(0.3));
        universe.getViewingPlatform().setNominalViewingTransform();
        universe.addBranchGraph(group);

        JPanel panel = new JPanel();
        frame.add(panel);
        frame.setVisible(true);
    }
}
