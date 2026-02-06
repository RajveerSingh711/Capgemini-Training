package Feb6.JUnit;

/*Create a ListManager class that has the following methods:
addElement(List<Integer> list, int element): Adds an element to a list.
removeElement(List<Integer> list, int element): Removes an element from a list.
getSize(List<Integer> list): Returns the size of the list.
Write JUnit tests to verify that:
✅ Elements are correctly added.
✅ Elements are correctly removed.
✅ The size of the list is updated correctly.
*/

import java.util.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ListManager {
    public void addElement(List<Integer> list,int element){
        list.add(element);
    }
    public void removeElement(List<Integer> list,int element){
        list.remove(Integer.valueOf(element));
    }
    public int getSize(List<Integer> list){
        return list.size();
    }
}
class ListManagerTest{
    @Test
    void testAddElement(){
        ListManager manager=new ListManager();
        List<Integer> list=new ArrayList<>();
        manager.addElement(list,10);
        assertTrue(list.contains(10));
        assertEquals(1,manager.getSize(list));
    }
    @Test
    void testRemoveElement(){
        ListManager manager=new ListManager();
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        manager.removeElement(list,10);
        assertFalse(list.contains(10));
        assertEquals(1,manager.getSize(list));
    }
    @Test
    void testGetSize(){
        ListManager manager=new ListManager();
        List<Integer> list=new ArrayList<>();
        manager.addElement(list,5);
        manager.addElement(list,15);
        manager.addElement(list,25);
        assertEquals(3,manager.getSize(list));
    }
}