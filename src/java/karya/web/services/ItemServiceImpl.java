package karya.web.services;  
/** 
 * 
 * @author Nagesh Chauhan 
 */  
  
import java.util.List;  
  
import org.springframework.beans.factory.annotation.Autowired;  
import karya.web.dao.ItemDao;  
import karya.web.domain.Items;  
  
  
public class ItemServiceImpl implements ItemService {  
  
 @Autowired  
 ItemDao itemsdao;  
  
 @Override  
 public void insertData(Items items) {  
  itemsdao.insertData(items);  
 }  
  
 @Override  
 public List<Items> getItemList() {  
  return itemsdao.getItemList();  
 }  
  
 @Override  
 public void deleteData(String id) {  
  itemsdao.deleteData(id);  
    
 }  
  
 @Override  
 public Items getItem(String id) {  
  return itemsdao.getItem(id);  
 }  
  
 @Override  
 public void updateData(Items items) {  
  itemsdao.updateData(items);  
    
 }  
  
  
   
}