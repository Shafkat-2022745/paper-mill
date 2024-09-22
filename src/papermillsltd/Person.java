package papermillsltd;

public class Person {
    private String name;
    private String fname;
    private String salary;
    private String phone;
    private String add;
    private String mail;
    private String deg;
        public Person() {
    }

    public Person(String name, String fname, String salary, String phone, String add, String mail, String deg) {
        this.name = name;
        this.fname = fname;
        this.salary = salary;
        this.phone = phone;
        this.add = add;
        this.mail = mail;
        this.deg = deg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname=fname;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary=salary;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone=phone;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add=add;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail=mail;
    }

    public String getDeg() {
        return deg;
    }

    public void setDeg(String deg) {
        this.deg=deg;
    }
    @Override
    public String toString() {
        return "Person{" + "name=" + name + ",Father's Name=" + fname + ",Salary=" + salary + ",Phone=" +
                phone +"Address=" + add + ",Mail=" + mail + ",Designation=" + deg+'}';
    }

}
