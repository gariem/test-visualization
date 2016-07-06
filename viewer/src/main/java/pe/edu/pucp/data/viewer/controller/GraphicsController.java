package pe.edu.pucp.data.viewer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.pucp.data.viewer.model.Line;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Emilio on 7/6/2016.
 */
@RestController
@RequestMapping("/data")
public class GraphicsController {

    @RequestMapping("/perdidas")
    public List<Line> getPerdidas() {
        List<Line> lines = new ArrayList<>(2);

        Line line1 = new Line();
        line1.setLabel("Data Set 1");

        List<Integer> x1 = new ArrayList<>(4);
        x1.add(0);
        x1.add(1);
        x1.add(2);
        x1.add(3);
        x1.add(4);

        List<Integer> y1 = new ArrayList<>(4);
        y1.add(0);
        y1.add(1);
        y1.add(2);
        y1.add(3);
        y1.add(4);

        line1.setX(x1);
        line1.setY(y1);

        Line line2 = new Line();
        line2.setLabel("Data Set 2");

        List<Integer> x2 = new ArrayList<>(4);
        x2.add(0);
        x2.add(1);
        x2.add(2);
        x2.add(3);
        x2.add(4);

        List<Integer> y2 = new ArrayList<>(4);
        y2.add(0);
        y2.add(1);
        y2.add(4);
        y2.add(9);
        y2.add(16);

        line2.setX(x2);
        line2.setY(y2);

        lines.add(line1);
        lines.add(line2);

        return lines;
    }
}
