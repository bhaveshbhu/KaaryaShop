package karya.web.services;  
/** 
 * 
 * @author Nagesh Chauhan 
 */  
  
import java.util.List;  
  
import org.springframework.beans.factory.annotation.Autowired;  
import karya.web.dao.UserDao;  
import karya.web.domain.Users;  
  
  
public class UserServiceImpl implements UserService {  
  
 @Autowired  
 UserDao userdao;  
  
 @Override  
 public void insertData(Users user) {  
  userdao.insertData(user);  
 }  
  
 @Override  
 public List<Users> getUserList() {  
  return userdao.getUserList();  
 }  
  
 @Override  
 public void deleteData(String id) {  
  userdao.deleteData(id);  
    
 }  
  
 @Override  
 public Users getUser(String id) {  
  return userdao.getUser(id);  
 }  
  
 @Override  
 public void updateData(Users user) {  
  userdao.updateData(user);  
    
 }  
  
  
   
}