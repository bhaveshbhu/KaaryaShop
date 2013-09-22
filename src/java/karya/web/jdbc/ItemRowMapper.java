package karya.web.jdbc;  
/** 
 * 
 * @author Nagesh Chauhan 
 */  
  
import java.sql.ResultSet;  
import java.sql.SQLException;  
import org.springframework.jdbc.core.RowMapper;  
import karya.web.domain.Items;  
  
public class ItemRowMapper implements RowMapper<Items> {  
  
 @Override  
 public Items mapRow(ResultSet resultSet, int line) throws SQLException {  
  ItemExtractor itemsExtractor = new ItemExtractor();  
  return itemsExtractor.extractData(resultSet);  
 }  
  
}  