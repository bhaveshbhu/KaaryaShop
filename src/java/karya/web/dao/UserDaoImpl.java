package karya.web.dao;  
/** 
 * 
 * @author Nagesh Chauhan 
 */  
  
import java.util.ArrayList;  
import java.util.List;  
import javax.sql.DataSource;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.jdbc.core.JdbcTemplate;  
import karya.web.domain.Users;  
import karya.web.jdbc.UserRowMapper;  
  
public class UserDaoImpl implements UserDao {  
  
 @Autowired  
 DataSource dataSource;  
  
 public void insertData(Users user) {  
  
  String sql = "INSERT INTO user "  
    + "(first_name,last_name, gender, city) VALUES (?, ?, ?,?)";  
  
  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
  
  jdbcTemplate.update(  
    sql,  
    new Object[] { user.getId(), user.getUsername(),  
      user.getEmail(), user.getAddress() });  
  
 }  
  
 public List<Users> getUserList() {  
  List userList = new ArrayList();  
  
  String sql = "select * from user";  
  
  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
  userList = jdbcTemplate.query(sql, new UserRowMapper());  
  return userList;  
 }  
  
 @Override  
 public void deleteData(String id) {  
  String sql = "delete from user where user_id=" + id;  
  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
  jdbcTemplate.update(sql);  
  
 }  
  
 @Override  
 public void updateData(Users user) {  
  
  String sql = "UPDATE user set first_name = ?,last_name = ?, gender = ?, city = ? where user_id = ?";  
  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
  
  jdbcTemplate.update(  
    sql,  
    new Object[] { user.getId(), user.getUsername(),  
      user.getEmail(), user.getAddress() });  
  
 }  
  
 @Override  
 public Users getUser(String id) {  
  List<Users> userList = new ArrayList<Users>();  
  String sql = "select * from user where user_id= " + id;  
  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
  userList = jdbcTemplate.query(sql, new UserRowMapper());  
  return userList.get(0);  
 }  
  
}  