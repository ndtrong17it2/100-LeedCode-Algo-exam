/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class EmployeeImportance690 {
    public int getImportance(List<Employee> employees, int id) {
        Employee employee = employees.stream().filter(e -> e.id == id).findFirst().get();
        Queue<Employee> queue = new LinkedList<Employee>();
        queue.add(employee);
        int result = 0;
        while(!queue.isEmpty()){
            Employee emp = queue.remove();
            result += emp.importance;
            employees.forEach(e -> {
                if(emp.subordinates.contains(e.id)){
                    queue.add(e);
                }
            });
        }
        return result;
     }
}