package karya.web.services;  
/** 
 * 
 * @author Nagesh Chauhan 
 */  
  
import java.util.List;  
import karya.web.domain.Users;  
  
public interface UserService {  
  
 public void insertData(Users user);  
 public List<Users> getUserList();  
 public void deleteData(String id);  
 public Users getUser(String id);  
 public void updateData(Users user);  
  
} 