package com.example.educationalmanagementapp.Service;

import com.example.educationalmanagementapp.Exception.AllStudentNotFoundException;
import com.example.educationalmanagementapp.Model.AllStudent;
import com.example.educationalmanagementapp.Repository.AllStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class AllStudentService {
    private final AllStudentRepository allStudentRepository;

    @Autowired
    public AllStudentService( AllStudentRepository allStudentRepository){
        this.allStudentRepository = allStudentRepository;
    }
    /*** Setting a random code value to the AllStudent ***/
    public AllStudent addAllStudent(AllStudent allStudent){
       allStudent.setAllStudentCode(UUID.randomUUID().toString());
        return allStudentRepository.save(allStudent);
    }


    /*** Getting list of the AllStudent ***/
    public List<AllStudent> findAllAllStudents(){
        return allStudentRepository.findAll();
    }

    /*** Updating AllStudent ***/
    public AllStudent updateAllStudent(AllStudent allStudent){
        return allStudentRepository.save(allStudent);
    }

    /*** Getting list of the AllStudent by Id  ***/
    public AllStudent findAllStudentById(Long id){
        return allStudentRepository.findAllStudentById(id)
                .orElseThrow(() -> new AllStudentNotFoundException("User By Id" + id + "Was Not Found"));
    }

    /*** Deleting AllStudent ***/
    public void deleteAllStudent( Long id){
        allStudentRepository.deleteAllStudentById(id);
    }
}
