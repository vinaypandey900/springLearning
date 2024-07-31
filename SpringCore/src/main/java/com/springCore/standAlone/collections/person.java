package com.springCore.standAlone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class person {
   private List<String> friends;
   private Map<String, Integer> feeStructre;
   private Properties properties;

public Map<String, Integer> getFeeStructre() {
	return feeStructre;
}

public void setFeeStructre(Map<String, Integer> feeStructre) {
	this.feeStructre = feeStructre;
}

public List<String> getFriends() {
	return friends;
}

public void setFriends(List<String> friends) {
	this.friends = friends;
}

public Properties getProperties() {
	return properties;
}

public void setProperties(Properties properties) {
	this.properties = properties;
}

@Override
public String toString() {
	return "person [friends=" + friends + ", feeStructre=" + feeStructre + ", properties=" + properties + "]";
}




}
