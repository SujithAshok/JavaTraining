import java.util.*;
class CollectionsMap
{
public static void main(String args[])
{

ArrayList<String> li = new ArrayList<>();
li.add("1");
li.add("2");

List<ArrayList<String>> li1 = new LinkedList<>();
li1.add(li);
System.out.println(li1);

/*--------------------------------------------*/

HashSet<String> st = new HashSet<>();
st.add("3");
st.add("4");

Set<HashSet<String>> st1 = new LinkedHashSet<>();
st1.add(st);
System.out.println(st1);

/*--------------------------------------------*/
	
HashMap<String, String> map = new HashMap<>();

map.put("Name", "Sujith");
map.put("Age", "24");

Map<String, HashMap<String,String>> map1 = new LinkedHashMap<>();

map1.put("Student1", map);
map.put("Name", "Sathish");
map1.put("Student2", map);

System.out.println(map1);

}
}