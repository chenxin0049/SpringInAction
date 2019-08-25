package spittr;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Spitter {
    private Long id;
    @Size(min = 2, max = 30, message = "{firstName.size}")
    private String firstName;
    @Size(min = 2, max = 30, message = "{lastName.size}")
    private String lastName;
    @Size(min = 5, max = 16, message = "{username.size}")
    private String username;
    @Size(min = 5, max = 25, message = "{password.size}")
    private String password;
    @NotEmpty(message = "{email.notempty}")  // "NotNull" 不能判断 "" 所以使用 "NotEmpty"
    @Email(message = "{email.valid}")
    private String email;

    public Spitter(){}
    public Spitter(String firstName, String lastName, String username, String password, String email){
        this(null, firstName, lastName, username, password, email);
    }
    public Spitter(Long id, String firstName, String lastName, String username, String password, String email){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getUsername() {
        return username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
}
