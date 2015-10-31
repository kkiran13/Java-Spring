package collection;
import java.util.*;

public class JavaCollection {
	 List addressList;
	 Set  addressSet;
	 Map  addressMap;
	 Properties addressProp;
	 
	// a setter method to set List
	 public void setAddressList(List addressList){
		 this.addressList = addressList;
	 }
	 
	// prints and returns all the elements of the list.
	 public List getAddressList(){
		 System.out.println("Address List is: "+addressList);
		 return addressList;
	 }
	 
	// a setter method to set Set
	 public void setAddressSet(Set addressSet){
		 this.addressSet = addressSet;
	 }
	 
	// prints and returns all the elements of the Set.
	 public Set getAddressSet(){
		 System.out.println("Address Set is: "+addressSet);
		 return addressSet;
	 }
	 
	// a setter method to set Map
	 public void setAddressMap(Map addressMap){
		 this.addressMap = addressMap;
	 }
	 
	// prints and returns all the elements of the Map.
	 public Map getAddressMap(){
		 System.out.println("Address Map is: "+addressMap);
		 return addressMap;
	 }
	 
	// a setter method to set Propert
	 public void setAddressProp(Properties addressProp){
		 this.addressProp = addressProp;
	 }
	 
	// prints and returns all the elements of the Property
	 public Properties getAddressProp(){
		 System.out.println("Address Prop is: "+addressProp);
		 return addressProp;
	 }
}
