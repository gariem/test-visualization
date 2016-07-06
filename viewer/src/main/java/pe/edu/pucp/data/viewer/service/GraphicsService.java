package pe.edu.pucp.data.viewer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.pucp.data.viewer.mapper.GraphicsMapper;
import pe.edu.pucp.data.viewer.model.KeyValue;
import pe.edu.pucp.data.viewer.model.Line;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * Created by Emilio on 7/6/2016.
 */
@Service
public class GraphicsService {

    @Autowired
    GraphicsMapper mapper;

    private Line getLine(List<KeyValue> keyValues, String label){
        Line line = new Line();
        line.setLabel(label);

        List<Integer> xList = new ArrayList<>(keyValues.size());
        List<Integer> yList = new ArrayList<>(keyValues.size());

        for(KeyValue item: keyValues){
            xList.add(Integer.parseInt(item.getKey()));
            yList.add((int)Double.parseDouble(item.getValue()));
        }

        line.setX(xList);
        line.setY(yList);

        return line;
    }

    public List<Line> getTsunamiAndVolcanoLines() {
        List<KeyValue> tsunamiKeyValues = mapper.getTsunamiLostsInMillionDollars();
        List<KeyValue> volcanoKeyValues = mapper.getVolcanoLostsInMillionDollars();

        Line tsunamiLine = getLine(tsunamiKeyValues, "Tsunami");
        Line volcanoLine = getLine(volcanoKeyValues, "Volcano");

        List<Line> lines = new ArrayList<>(asList(tsunamiLine, volcanoLine));
        return lines;
    }

}
