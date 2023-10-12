package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapLIst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map mapList = new HashMap();
		mapList.put("name","Mohan");
		mapList.put("id",123);
		mapList.put("gender",'m');
		System.out.println(mapList);
		System.out.println(mapList.get("name")); //using get method
		
		Map<String,String> mapList1 = new HashMap<String,String>();
		mapList1.put("name","fhfhgj");
		mapList1.put("id","122");
		System.out.println(mapList1);
		
		Map<Integer,Map> mapOfMap = new HashMap<Integer,Map>();
		mapOfMap.put(5, mapList);
		mapOfMap.put(2, mapList1);
		System.out.println("MAP OF MAP"+mapOfMap);
		System.out.println(" ");
		
		StudentInfoList stdInfo1 = new StudentInfoList();
		stdInfo1.setId(1);
		stdInfo1.setName("Mohan");
		stdInfo1.setGender('m');
		stdInfo1.setEmail("mohan45@gmail.com");
		stdInfo1.setDob("2023-09-26");
		stdInfo1.setMobile(123456789l);
		
		StudentInfoList stdInfo2 = new StudentInfoList();
		stdInfo2.setId(2);
		stdInfo2.setName("Vignesh");
		stdInfo2.setGender('m');
		stdInfo2.setEmail("mohan45@gmail.com");
		stdInfo2.setDob("2023-09-26");
		stdInfo2.setMobile(123456789l);
		
		
		
		Map<Integer,StudentInfoList> stdList1 = new HashMap<Integer,StudentInfoList>();
		stdList1.put(1,stdInfo1);
		stdList1.put(2,stdInfo2);
		for(Map.Entry<Integer,StudentInfoList> val : stdList1.entrySet()) {
			Integer keyObj = val.getKey();
			StudentInfoList valueObj = val.getValue();
			
			 System.out.println("Details Of Student "+keyObj+"\nId: "+valueObj.getId()+"\nName: "+valueObj.getName()+
					 "\nGender: "+valueObj.getGender()+"\nEmail: "+valueObj.getEmail()+"\nMobile:"+valueObj.getMobile());
			 System.out.println(" ");
		}
			
		}
		

	}


