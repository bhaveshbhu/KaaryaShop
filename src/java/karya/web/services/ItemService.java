package karya.web.services;  
/** 
 * 
 * @author Nagesh Chauhan 
 */  
  
import java.util.List;  
import karya.web.domain.Items;  
  
public interface ItemService {  
  
 public void insertData(Items items);  
 public List<Items> getItemList();  
 public void deleteData(String id);  
 public Items getItem(String id);  
 public void updateData(Items items);  
  
} 