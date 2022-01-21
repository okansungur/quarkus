package org.acme;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/student")
public class StudentMain {
private static final List<Student> students = new ArrayList<>();
@POST
@Consumes(MediaType.APPLICATION_JSON)
public Response addStudent(Student student) {
    students.add(student);
return Response.ok().build();
}
@GET
@Produces(MediaType.APPLICATION_JSON)
public List<Student> getStudents() {
    students.add(new Student(1,"Sue","Morgan","New York"));
return students;
}


}