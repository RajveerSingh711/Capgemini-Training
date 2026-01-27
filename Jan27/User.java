package Jan27;

/*Problem Statement: Create a system to manage social media friend connections using a singly linked list. Each node represents a user with User ID, Name, Age, and List of Friend IDs. Implement the following operations:
Add a friend connection between two users.
Remove a friend connection.
Find mutual friends between two users.
Display all friends of a specific user.
Search for a user by Name or User ID.
Count the number of friends for each user.
Hint:
Use a singly linked list where each node contains a list of friends (which can be another linked list or array of Friend IDs).
For mutual friends, traverse both lists and compare the Friend IDs.
The List of Friend IDs for each user can be implemented as a nested linked list or array.
*/

class FriendNode{
    int friendId;
    FriendNode next;
    FriendNode(int friendId){
        this.friendId=friendId;
        this.next=null;
    }
}
public class User{
    int userId;
    String name;
    int age;
    FriendNode friends;
    User next;
    User(int userId,String name,int age){
        this.userId=userId;
        this.name=name;
        this.age=age;
        this.friends=null;
        this.next=null;
    }
}
class SocialMedia{
    User head;
    void addUser(int userId,String name,int age){
        User newNode=new User(userId,name,age);
        newNode.next=head;
        head=newNode;
    }
    User findUserById(int id){
        User temp=head;
        while(temp!=null){
            if(temp.userId==id) return temp;
            temp=temp.next;
        }
        return null;
    }
    void searchUserByName(String name){
        User temp=head;
        boolean found=false;
        while(temp!=null){
            if(temp.name.equalsIgnoreCase(name)){
                System.out.println(temp.userId+" | "+temp.name+" | "+temp.age);
                found=true;
            }
            temp=temp.next;
        }
        if(!found) System.out.println("User not found");
    }
    void addFriend(User user,int friendId){
        FriendNode newNode=new FriendNode(friendId);
        newNode.next=user.friends;
        user.friends=newNode;
    }
    void addFriendConnection(int id1,int id2){
        User u1=findUserById(id1);
        User u2=findUserById(id2);
        if(u1==null || u2==null){
            System.out.println("User not found");
            return;
        }
        addFriend(u1,id2);
        addFriend(u2,id1);
        System.out.println("Friend connection added");
    }
    void removeFriend(User user,int friendId){
        if(user.friends==null) return;
        if(user.friends.friendId==friendId){
            user.friends=user.friends.next;
            return;
        }
        FriendNode temp=user.friends;
        while(temp.next!=null){
            if(temp.next.friendId==friendId){
                temp.next=temp.next.next;
                return;
            }
            temp=temp.next;
        }
    }
    void removeFriendConnection(int id1,int id2){
        User u1=findUserById(id1);
        User u2=findUserById(id2);
        if(u1==null || u2==null){
            System.out.println("User not found");
            return;
        }
        removeFriend(u1,id2);
        removeFriend(u2,id1);
        System.out.println("Friend connection removed");
    }
    void displayFriends(int userId){
        User user=findUserById(userId);
        if(user==null){
            System.out.println("User not found");
            return;
        }
        System.out.println("Friends of "+user.name+":");
        FriendNode temp=user.friends;
        if(temp==null){
            System.out.println("No friends");
            return;
        }
        while(temp!=null){
            System.out.println(temp.friendId);
            temp=temp.next;
        }
    }
    void findMutualFriends(int id1,int id2){
        User u1=findUserById(id1);
        User u2=findUserById(id2);
        if(u1==null || u2==null){
            System.out.println("User not found");
            return;
        }
        System.out.println("Mutual Friends:");
        FriendNode f1=u1.friends;
        boolean found=false;
        while(f1!=null){
            FriendNode f2=u2.friends;
            while(f2!=null){
                if(f1.friendId==f2.friendId){
                    System.out.println(f1.friendId);
                    found=true;
                }
                f2=f2.next;
            }
            f1=f1.next;
        }
        if(!found) System.out.println("No mutual friends");
    }
    void countFriends(){
        User temp=head;
        while(temp!=null){
            int count=0;
            FriendNode f=temp.friends;
            while(f!=null){
                count++;
                f=f.next;
            }
            System.out.println(temp.name+" has "+count+" friends");
            temp=temp.next;
        }
    }
    public static void main(String[] args){
        SocialMedia sm=new SocialMedia();
        sm.addUser(1,"Raj",20);
        sm.addUser(2,"Aman",21);
        sm.addUser(3,"Neha",19);
        sm.addFriendConnection(1,2);
        sm.addFriendConnection(1,3);
        sm.addFriendConnection(2,3);
        sm.displayFriends(1);
        sm.findMutualFriends(1,2);
        sm.countFriends();
        sm.searchUserByName("Neha");
        sm.removeFriendConnection(1,2);
        sm.displayFriends(1);
    }
}