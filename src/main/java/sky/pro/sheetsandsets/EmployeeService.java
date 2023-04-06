package sky.pro.sheetsandsets;

public interface EmployeeService {
    Employee add(String firstName, String lastName);
    Employee remove(String firstName, String lastName);
    Employee finde(String firstName, String lastName);
}
