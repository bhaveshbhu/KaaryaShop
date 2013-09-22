package karya.web.dao;  
/** 
 * 
 * @author Nagesh Chauhan 
 */  
  
import java.util.List;  
import karya.web.domain.Users;  
  
public interface UserDao {  
 public void insertData(Users user);  
 public List<Users> getUserList();  
 public void updateData(Users user);  
 public void deleteData(String id);  
 public Users getUser(String id);  
  
}