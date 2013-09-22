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
import karya.web.domain.Items;  
import karya.web.jdbc.ItemRowMapper;  
  
public class ItemDaoImpl implements ItemDao {  
  
 @Autowired  
 DataSource dataSource;  
  
 public void insertData(Items items) {  
  
  String sql = "INSERT INTO items "  
    + "(name,price) VALUES (?, ?)";  
  
  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
  
  jdbcTemplate.update(  
    sql,  
    new Object[] {  items.getName(),  
      items.getPrice() });  
  
 }  
  
 public List<Items> getItemList() {  
  List<Items> itemsList = new ArrayList();  
  
  String sql = "select * from items";  
  
  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
  itemsList = jdbcTemplate.query(sql, new ItemRowMapper());  
  return itemsList;  
 }  
  
 @Override  
 public void deleteData(String id) {  
  String sql = "delete from items where id=" + id;  
  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
  jdbcTemplate.update(sql);  
  
 }  
  
 @Override  
 public void updateData(Items items) {  
  
  String sql = "UPDATE items set name = ?,price = ? where id = ?";  
  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
  
  jdbcTemplate.update(  
    sql,  
    new Object[] {  items.getName(),  
      items.getPrice(), items.getId()});  
  
 }  
  
 @Override  
 public Items getItem(String id) {  
  List<Items> itemsList = new ArrayList<Items>();  
  String sql = "select * from items where id= " + id;  
  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
  itemsList = jdbcTemplate.query(sql, new ItemRowMapper());  
  return itemsList.get(0);  
 }  
  
}  