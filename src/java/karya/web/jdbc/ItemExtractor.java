package karya.web.jdbc;  
/** 
 * 
 * @author Nagesh Chauhan 
 */  
  
  
import java.sql.ResultSet;  
import java.sql.SQLException;  
import org.springframework.dao.DataAccessException;  
import org.springframework.jdbc.core.ResultSetExtractor;  
import karya.web.domain.Items;  
  
public class ItemExtractor implements ResultSetExtractor<Items> {  
  
 public Items extractData(ResultSet resultSet) throws SQLException,  
   DataAccessException {  
    
  Items items = new Items();  
    
  items.setId(resultSet.getInt(1));  
  items.setName(resultSet.getString(2));    
  items.setPrice(resultSet.getInt(3));    
    
  return items;  
 }  
  
}  