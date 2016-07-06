package pe.edu.pucp.data.viewer.mapper;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import pe.edu.pucp.data.viewer.model.KeyValue;

import java.util.List;

/**
 * Created by Emilio on 7/6/2016.
 */
public interface GraphicsMapper {

    @Results({
            @Result(property = "key", column = "key"),
            @Result(property = "value", column = "value")
    })

    @Select("SELECT YEAR AS KEY,COALESCE(SUM(TOTAL_DAMAGE_MILLIONS_DOLLARS),0) AS VALUE FROM TSUNAMI_EVENT WHERE YEAR >=1970 AND YEAR<2012 GROUP BY YEAR ORDER BY YEAR")
    List<KeyValue> getTsunamiLostsInMillionDollars();

    @Select("SELECT YEAR AS KEY,COALESCE(SUM(TOTAL_DAMAGE_MILLIONS_DOLLARS),0) AS VALUE FROM VOLCANO_ERUPTION WHERE YEAR >=1970 AND YEAR<2012 GROUP BY YEAR ORDER BY YEAR")
    List<KeyValue> getVolcanoLostsInMillionDollars();
}
