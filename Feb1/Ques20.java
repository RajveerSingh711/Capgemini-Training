package Feb1;

/*Given a list of Employee objects, group them by their department using a Map<Department, List<Employee>>.
Example:
Employees: [Alice (HR), Bob (IT), Carol (HR)] → Output: HR: [Alice, Carol], IT: [Bob].
*/

import java.util.*;

class EmployeeGrouping{
    static class Employee {
        String name;
        String department;
        public Employee(String name,String department){
            this.name=name;
            this.department=department;
        }
        public String getDepartment(){
            return department;
        }
        @Override
        public String toString(){
            return name;
        }
    }
    public static Map<String,List<Employee>> groupByDepartment(List<Employee> employees){
        Map<String,List<Employee>> departmentMap=new HashMap<>();
        for(Employee emp:employees){
            departmentMap.computeIfAbsent(emp.getDepartment(),d->new ArrayList<>()).add(emp);
        }
        return departmentMap;
    }
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );

        Map<String, List<Employee>> result = groupByDepartment(employees);

        System.out.println(result);
    }
}

