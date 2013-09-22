package karya.web.controllers;  
/** 
 * 
 * @author Nagesh Chauhan 
 */  
  
import java.util.ArrayList;  
import java.util.HashMap;  
import java.util.List;  
import java.util.Map;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestParam;  
import org.springframework.web.servlet.ModelAndView;  
import karya.web.domain.Items;  
import karya.web.services.ItemService;  
  
@Controller  
public class HomePageController {  
  
 @Autowired  
 ItemService itemsService;  
  
 @RequestMapping("/register")  
 public ModelAndView registerItem(@ModelAttribute Items items) {  
  
  List<String> genderList = new ArrayList<String>();  
  genderList.add("male");  
  genderList.add("female");  
  
  List<String> cityList = new ArrayList<String>();  
  cityList.add("delhi");  
  cityList.add("gurgaon");  
  cityList.add("meerut");  
  cityList.add("noida");  
  
  Map<String, List> map = new HashMap<String, List>();  
  map.put("genderList", genderList);  
  map.put("cityList", cityList);  
  return new ModelAndView("register", "map", map);  
 }  
  
 @RequestMapping("/insert")  
 public String inserData(@ModelAttribute Items items) {  
  if (items != null)  
   itemsService.insertData(items);  
  return "redirect:/getList";  
 }  
 @RequestMapping("/inserttocart")  
 public String insertToCart(@ModelAttribute Items items) {  
  if (items != null)  
   itemsService.insertData(items);  
  return "redirect:/getList";  
 }
 @RequestMapping("/getList")  
 public ModelAndView getItemLIst() {
     System.out.print("gfjgfjhngfjfv");
  List<Items> itemsList = itemsService.getItemList();  
  return new ModelAndView("itemsList", "itemsList", itemsList);  
 }  
  
 @RequestMapping("/edit")  
 public ModelAndView editItem(@RequestParam String id,  
   @ModelAttribute Items items) {  
  
  items = itemsService.getItem(id);  
  
  List<String> genderList = new ArrayList<String>();  
  genderList.add("male");  
  genderList.add("female");  
  
  List<String> cityList = new ArrayList<String>();  
  cityList.add("delhi");  
  cityList.add("gurgaon");  
  cityList.add("meerut");  
  cityList.add("noida");  
  
  Map<String, Object> map = new HashMap<String, Object>();  
  map.put("genderList", genderList);  
  map.put("cityList", cityList);  
  map.put("items", items);  
  
  return new ModelAndView("edit", "map", map);  
  
 }  
  
 @RequestMapping("/update")  
 public String updateItem(@ModelAttribute Items items) {  
  itemsService.updateData(items);  
  return "redirect:/getList";  
  
 }  
  
 @RequestMapping("/delete")  
 public String deleteItem(@RequestParam String id) {  
  System.out.println("id = " + id);  
  itemsService.deleteData(id);  
  return "redirect:/getList";  
 }  
}  