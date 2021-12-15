package com.example.educationalmanagementapp.Controller;

import com.example.educationalmanagementapp.Model.AllStudent;
import com.example.educationalmanagementapp.Service.AllStudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/allStudent")
public class AllStudentController {
    private final AllStudentService allStudentService;

    public  AllStudentController( AllStudentService allStudentService){
        this.allStudentService = allStudentService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<AllStudent>> getAllAllStudents(){
        List<AllStudent> allStudents = allStudentService.findAllAllStudents();
        return new ResponseEntity<>(allStudents, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<AllStudent> getAllStudentById(@PathVariable("id") Long id){
        AllStudent allStudent = allStudentService.findAllStudentById(id);
        return new ResponseEntity<>(allStudent, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<AllStudent> addAllStudent(@RequestBody AllStudent allStudent){
        AllStudent newAllStudent = allStudentService.addAllStudent(allStudent);
        return new ResponseEntity<>(newAllStudent, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<AllStudent> updateAllStudent(@RequestBody AllStudent allStudent){
        AllStudent updateAllStudent = allStudentService.updateAllStudent(allStudent);
        return new ResponseEntity<>(updateAllStudent, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteAllStudent(@PathVariable("id") Long id){
        allStudentService.deleteAllStudent(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
