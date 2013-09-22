package karya.web.jdbc;  
/** 
 * 
 * @author Nagesh Chauhan 
 */  
  
import java.sql.ResultSet;  
import java.sql.SQLException;  
import org.springframework.jdbc.core.RowMapper;  
import karya.web.domain.Users;  
  
public class UserRowMapper implements RowMapper<Users> {  
  
 @Override  
 public Users mapRow(ResultSet resultSet, int line) throws SQLException {  
  UserExtractor userExtractor = new UserExtractor();  
  return userExtractor.extractData(resultSet);  
 }  
  
}  