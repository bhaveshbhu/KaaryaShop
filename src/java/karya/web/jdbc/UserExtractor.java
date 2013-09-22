package karya.web.jdbc;  
/** 
 * 
 * @author Nagesh Chauhan 
 */  
  
  
import java.sql.ResultSet;  
import java.sql.SQLException;  
import org.springframework.dao.DataAccessException;  
import org.springframework.jdbc.core.ResultSetExtractor;  
import karya.web.domain.Users;  
  
public class UserExtractor implements ResultSetExtractor<Users> {  
  
 public Users extractData(ResultSet resultSet) throws SQLException,  
   DataAccessException {  
    
  Users user = new Users();  
    
  user.setId(resultSet.getInt(1));  
  user.setUsername(resultSet.getString(2));    
  user.setEmail(resultSet.getString(3));  
  user.setAddress(resultSet.getString(4));  
    
  return user;  
 }  
  
}  