package org.example;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.ArrayList;
import java.util.List;

@Path("/students")
public class StudentService {
    private static List<Student> students = new ArrayList<>();

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Student getStudent(@PathParam("id") int id) {
        return students.get(id);
    }

    @POST
    // @Consumes(MediaType.APPLICATION_JSON)
    public void createStudent(Student student) {
        students.add(student);
    }

    @PUT
    @Path("/{id}")
    // @Consumes(MediaType.APPLICATION_JSON)
    public void updateStudent(@PathParam("id") int id, Student student) {
        students.set(id, student);
    }

    @DELETE
    @Path("/{id}")
    public void deleteStudent(@PathParam("id") int id) {
        students.remove(id);
    }
}
