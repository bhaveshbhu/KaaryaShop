package karya.web.dao;  
/** 
 * 
 * @author Nagesh Chauhan 
 */  
  
import java.util.List;  
import karya.web.domain.Items;  
  
public interface ItemDao {  
 public void insertData(Items item);  
 public List<Items> getItemList();  
 public void updateData(Items item);  
 public void deleteData(String id);  
 public Items getItem(String id);  
  
}